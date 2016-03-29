package com.sggcrm.handler;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sggcrm.pojo.SalesPlan;
import com.sggcrm.service.SalesChancesService;
import com.sggcrm.service.SalesPlanService;
import com.sggcrm.service.UserService;

/**
 * 
 * @ClassName: PlanHandler
 * @Description:销售计划相关操作处理器
 * @author: 和鹏
 * @date: 2016年3月29日 上午10:38:29
 * 
 */
@Controller
@RequestMapping("/plan")
public class SalesPlanHandler {

	@Autowired
	private SalesPlanService planService;
	@Autowired
	private SalesChancesService chancesService;
	@Autowired
	private UserService userService;
	
	/**
	 * 
	 * @Title：tomakePlan
	 * @Description: 跳转到添加计划页面,并显示已有计划列表
	 * @params: chanceId,map
	 * @return: String
	 * @author 刘山禾
	 * @CreateDate 2016年3月29日 下午4:26:52
	 */
	@RequestMapping(value = "/make/{chanceId}", method = RequestMethod.GET)
	public String tomakePlan(@PathVariable("chanceId") Integer chanceId,
			Map<String, Object> map) {

		// 准备显示数据,放入map中
		// 1.当前销售机会
		map = chancesService.getSalesChancesById(chanceId, map);
		// 2.所有已制定好的销售计划
		map.put("plans", planService.getPlansById(chanceId));
		
		return "plan/make";
	}

	/**
	 * @Title：makePlan
	 * @Description: 添加计划，Ajax请求
	 * @author 刘山禾
	 * @CreateDate 2016年3月29日 下午3:03:58
	 */
	@ResponseBody
	@RequestMapping(value = "/make", method = RequestMethod.POST)
	public String makePlan(SalesPlan salesPlan) throws Exception {
		String saveMassege = planService.save(salesPlan);
		return saveMassege;
	}

	/**
	 * @Title：deletePlan
	 * @Description: 删除计划，Ajax请求
	 * @author 刘山禾
	 * @CreateDate 2016年3月29日 下午3:04:14
	 */
	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public String deletePlan(@PathVariable("id") Integer id) {
		String deleteMessage = planService.delete(id);
		return deleteMessage;
	}

	/**
	 * @Title：updatePlan
	 * @Description: 修改计划，Ajax请求
	 * @author 刘山禾
	 * @CreateDate 2016年3月29日 下午3:09:13
	 */
	@ResponseBody
	@RequestMapping(value = "/{planId}", method = RequestMethod.PUT)
	public String updatePlan(@PathVariable("planId") Integer id,
			SalesPlan salesPlan) {
		String updateMessage = planService.update(salesPlan);
		return updateMessage;
	}
	

}
