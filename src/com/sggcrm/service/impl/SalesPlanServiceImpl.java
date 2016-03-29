package com.sggcrm.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sggcrm.mapper.ContactsMapper;
import com.sggcrm.mapper.CustomersMapper;
import com.sggcrm.mapper.SalesChancesMapper;
import com.sggcrm.mapper.SalesPlanMapper;
import com.sggcrm.pojo.SalesPlan;
import com.sggcrm.service.SalesPlanService;

/**
 * 
 * @ClassName: PlanServiceImpl
 * @Description:客户开发计划服务层实现类
 * @author: 和鹏
 * @date: 2016年3月29日 上午10:45:43
 * 
 */
@Service
public class SalesPlanServiceImpl implements SalesPlanService {

	@Autowired
	private ContactsMapper contactsMapper;
	@Autowired
	private CustomersMapper customersMapper;
	@Autowired
	private SalesChancesMapper chancesMapper;
	@Autowired
	private SalesPlanMapper planMapper;

	/**
	 * 加载properties属性文件的Properties
	 */
	@Resource(name = "configurationProperties")
	private Properties configurationProperties;

	/**
	 * @Title: delete
	 * @Description: 删除计划
	 * @author 刘山禾
	 * @CreateDate 2016年3月29日 下午4:22:13
	 */
	@Override
	public String delete(Integer id) {
		if (null == id) {
			return "删除失败！";
		} else {
			return "删除成功";
		}
	}

	/**
	 * @Title: update
	 * @Description: 修改计划
	 * @author 刘山禾
	 * @CreateDate 2016年3月29日 下午4:21:59
	 */
	@Override
	public String update(SalesPlan salesPlan) {
		if (null == salesPlan || null == salesPlan.getId()) {
			return "修改失败！";
		} else {
			return "修改成功";
		}
	}

	/**
	 * @Title: save
	 * @Description: 添加计划
	 * @author 刘山禾
	 * @CreateDate 2016年3月29日 下午4:20:32
	 */
	@Override
	public String save(SalesPlan salesPlan) {

		Date planDate = salesPlan.getPlanDate();
		String todo = salesPlan.getTodo();

		if (null == planDate || null == todo) {
			return "添加计划失败，数据不能为空！";
		}
		return "添加计划成功！";
	}

	/**
	 * @Title: getPlansById
	 * @Description: 根据销售机会ID查询所属的所有已制定的计划
	 * @author 刘山禾
	 * @CreateDate 2016年3月29日 下午4:19:47
	 */
	@Override
	public List<SalesPlan> getPlansById(Integer chanceId) {

		
		
		return null;
	}

}
