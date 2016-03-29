package com.sggcrm.service;

import java.util.List;

import com.sggcrm.pojo.SalesPlan;

/**
 * 
 * @ClassName:	PlanService
 * @Description:客户开发计划的服务层接口
 * @author:	和鹏
 * @date:	2016年3月29日 上午10:45:03
 *
 */
public interface SalesPlanService {
	
	String delete(Integer id);

	String update(SalesPlan salesPlan);

	String save(SalesPlan salesPlan);

	List<SalesPlan> getPlansById(Integer chanceId);
	
	
}
