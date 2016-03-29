package com.sggcrm.handler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sggcrm.commons.bean.DataGridResult;
import com.sggcrm.commons.bean.ParametersBean;
import com.sggcrm.service.SalesChancesService;
import com.sggcrm.service.SalesPlanService;

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

	
}
