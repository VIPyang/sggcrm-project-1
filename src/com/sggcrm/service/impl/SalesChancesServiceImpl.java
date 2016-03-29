package com.sggcrm.service.impl;

import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sggcrm.mapper.SalesChancesMapper;
import com.sggcrm.mapper.UsersMapper;
import com.sggcrm.pojo.SalesChances;
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
	 * @Title: Dispatch
	 * @Description: 完成销售机会指派
	 * @author 刘山禾
	 * @CreateDate 2016年3月29日 上午11:45:19
	 */
	@Override
	public void Dispatch(SalesChances salesChance) throws Exception {

		if (null == salesChance || null == salesChance.getId()) {
			throw new IllegalArgumentException("参数不能为null");
		}
		chancesMapper.update(salesChance);
	}

	/**
	 * @Title: getSalesChancesById
	 * @Description: 根据ID查询一个实体类
	 * @author 刘山禾
	 * @CreateDate  2016年3月29日 下午1:12:18
	 */
	@Override
	public Map<String, Object> getSalesChancesById(Integer id, Map<String, Object> map) {
		
		//根据ID查询chance对象，放入map
		SalesChances chance = chancesMapper.selectByPrimaryKey(id);
		map.put("chance",chance);
		//创建人名称,放入map
		map.put("creater", usersMapper.selectByPrimaryKey(chance.getCreatedUserId()));
		
		if(null == chance.getDesigneeId()){
			//查询所有的、可供指派的用户，放入map
			map.put("canDesign", usersMapper.selectAll());
		}else{
			//指派人名称,放入map
			map.put("designer", chancesMapper.selectByPrimaryKey(chance.getDesigneeId()));
		}
		return map;
	}
	
	
}
