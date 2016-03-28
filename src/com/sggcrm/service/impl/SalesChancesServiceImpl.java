package com.sggcrm.service.impl;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sggcrm.commons.bean.DataGridResult;
import com.sggcrm.commons.utils.PageUtils;
import com.sggcrm.custom.exception.CreateSalesChanceException;
import com.sggcrm.custom.exception.SalesChancesException;
import com.sggcrm.mapper.SalesChancesMapper;
import com.sggcrm.mapper.UsersMapper;
import com.sggcrm.pojo.SalesChances;
import com.sggcrm.pojo.SalesChancesExample;
import com.sggcrm.pojo.SalesChancesExample.Criteria;
import com.sggcrm.service.SalesChancesService;


/**
 * 
 * @ClassName:	SalesChancesServiceImpl
 * @Description:"营销机会管理"服务层默认实现类
 * @author:	和鹏
 * @date:	2016年3月29日 上午2:56:24
 *
 */
@Service
public class SalesChancesServiceImpl implements SalesChancesService {

	@Autowired
	private SalesChancesMapper chancesMapper;

	@Autowired
	private UsersMapper usersMapper;
	
	/**
	 * 加载properties属性文件的Properties
	 */
	@Resource(name = "configurationProperties")
	private Properties configurationProperties;

	/**
	 * 
	 * <p>Title: getChanceListByStatus</p>
	 * <p>Description:分页查找记录,默认行为按照 com.sggcrm.pojo.SalesChances中status的值进行查找.
	 * 					也可以加入查询条件,此时按照status的值和加入的查询条件进行查找 </p>
	 * @param status
	 * @param pageNum
	 * @param pageSize
	 * @param map 可以为 null 
	 * @return 查询结果集封装后的POJO
	 * @throws Exception
	 * @author:	和鹏
	 * @see com.sggcrm.service.SalesChancesService#getChanceListByStatus(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.util.Map)
	 */
	@Override
	public DataGridResult getChanceListByStatus(Integer status,
			Integer pageNum, Integer pageSize, Map<String, Object> map)
			throws Exception {

		if (!this.configurationProperties.contains(String.valueOf(status))) {
			throw new IllegalArgumentException("传入的参数不合法");
		}

		List<SalesChances> mergeResultList = null;

		PageUtils.startPage(pageNum, pageSize);
		SalesChancesExample example = new SalesChancesExample();
		Criteria criteria = example.createCriteria();
		criteria.andStatusEqualTo(status);

		if (null == map || map.size() == 0) {
			mergeResultList = chancesMapper.selectByExample(example);
		} else {
			if (map.size() != 0) {
				Map<Method, Object> targetMethod = SelectFillVal(map,
						criteria);

				// 根据特定的查询算法执行查询

				boolean isNotFirst = false;

				// 执行所有的targetLikeMethod方法
				// each 策略 每一个执行条件都单独的发一条SQL
				for (Map.Entry<Method, Object> invokeMethod : targetMethod
						.entrySet()) {
					if (isNotFirst) {
						example = new SalesChancesExample();
						criteria = example.createCriteria();
						criteria.andStatusEqualTo(status);
					}
					Method im = invokeMethod.getKey();
					Object val = invokeMethod.getValue();
					im.invoke(criteria, val);
					List<SalesChances> tmpList = chancesMapper
							.selectByExample(example);
					if (tmpList.size() != 0) {
						if (null == mergeResultList) {
							mergeResultList = tmpList;
						} else {
							mergeResultList.addAll(tmpList);
						}
					}
					isNotFirst = true;
				}
			}
		}
		
		// 可能会需要使用 total-fix
		DataGridResult dataGridResult = PageUtils.paging(mergeResultList);
		return dataGridResult;
	}
	
	/**
	 * 
	 * @Title: likeSelectFillVal
	 * @Description: 拼接查询条件
	 * @param map
	 * @param criteria
	 * @return   
	 * @throws 
	 * @Date:2016年3月29日上午3:06:40
	 * @author:	和鹏
	 */
	private Map<Method, Object> SelectFillVal(Map<String, Object> map,
			Criteria criteria) {
		List<Method> allLikeMethod = new ArrayList<Method>();
		Map<Method, Object> targetLikeMethod = new HashMap<Method, Object>();

		// 亮出反射的大刀
		Method[] methods = criteria.getClass().getMethods();
		for (Method m : methods) {
			String methodName = m.getName();
			if (methodName.startsWith("and") && methodName.endsWith("Like")) {
				allLikeMethod.add(m);
			}
		}

		// 拼接查询条件
		for (Map.Entry<String, Object> me : map.entrySet()) {
			String key = me.getKey();
			String value = ((String)me.getValue()).trim();

			// 获取到所有的以"Like"结尾的方法
			// 进行值得填充
			for (Method like : allLikeMethod) {
				String name = like.getName();
				String fieldName = name.substring(
						name.indexOf("and") + "and".length(),
						name.indexOf("Like")).toLowerCase();
						
				if (!"".equals(value) && fieldName.equals(key)) {
					// 存储这个Like查询方法,和要填充的值
					targetLikeMethod.put(like, "%" + value + "%");
				}
			}
		}
		return targetLikeMethod;
	}

	/**
	 * 
	 * <p>Title: save</p>
	 * <p>Description:新增一条记录 </p>
	 * @param salesChances
	 * @throws Exception
	 * @author:	和鹏
	 * @see com.sggcrm.service.SalesChancesService#save(com.sggcrm.pojo.SalesChances)
	 */
	@Override
	public void save(SalesChances salesChances) throws Exception {
		String custName = salesChances.getCustName();
		String description = salesChances.getDescription();
		Integer rate = salesChances.getRate();
		Date createDate = salesChances.getCreateDate();
		Integer createdUserId = salesChances.getCreatedUserId();
		if (null == custName || description == null || rate == null
				|| createDate == null || createdUserId == null) {
			// 抛出异常
			throw new CreateSalesChanceException(
					configurationProperties
							.getProperty("SALESCHANCES.SAVE.ERROR"));
		}
		chancesMapper.insert(salesChances);
	}
	
	/**
	 * 
	 * <p>Title: delete</p>
	 * <p>Description:移除一条记录 </p>
	 * @param id
	 * @param currentUserId
	 * @throws Exception
	 * @author:	和鹏
	 * @see com.sggcrm.service.SalesChancesService#delete(java.lang.Integer, java.lang.Integer)
	 */
	@Override
	public void delete(Integer id) throws Exception {

		if (null == id) {
			throw new IllegalArgumentException("参数必须不为null");
		}
		
		chancesMapper.deleteByPrimaryKey(id);

		/*SalesChances sc = chancesMapper.selectByPrimaryKey(id);
		boolean flag = sc.getDesigneeId() == null;
		boolean enableDel = false;
		// 未被指派可以删除
		if (!flag) {
			enableDel = true;
		} else if (flag && "root".equals(currentUser.getName())) {// 管理员帐户可以删除
			enableDel = true;
		} else {// 不具备删除的权限抛出异常
			throw new SalesChancesException(
					configurationProperties
							.getProperty("SALESCHANCES.DELETE.ERROR"));
		}

		if (enableDel) {
			chancesMapper.deleteByPrimaryKey(id);
		}*/
	}
	
	
	/**
	 * 
	 * <p>Title: update</p>
	 * <p>Description:更新一条记录 </p>
	 * @param salesChances
	 * @param currentUserId
	 * @throws Exception
	 * @author:	和鹏
	 * @see com.sggcrm.service.SalesChancesService#update(com.sggcrm.pojo.SalesChances, java.lang.Integer)
	 */
	@Override
	public void update(SalesChances salesChances)
			throws Exception {

		if (null == salesChances || null == salesChances.getId()) {
			throw new IllegalArgumentException("参数不能为null");
		}
		
		chancesMapper.updateByPrimaryKeySelective(salesChances);
	}

}
