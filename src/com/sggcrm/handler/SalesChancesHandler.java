package com.sggcrm.handler;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sggcrm.commons.bean.DataGridResult;
import com.sggcrm.commons.bean.ParametersBean;
import com.sggcrm.pojo.SalesChances;
import com.sggcrm.service.SalesChancesService;

/**
 * 
 * @ClassName: SalesChancesHandler
 * @Description:"营销机会管理"相关操作处理器
 * @author: 和鹏
 * @date: 2016年3月29日 上午3:11:17
 * 
 */
@Controller
@RequestMapping("/chance")
public class SalesChancesHandler {

	@Autowired
	private SalesChancesService chancesService;

	/**
	 * 
	 * @Title: chanceList
	 * @Description: 分页查找
	 * @param: status
	 * @param: pageNum
	 * @param: pageSize
	 * @param: map
	 * @return: String
	 * @throws Exception
	 * @Date:2016年3月28日上午11:45:36
	 */
	@RequestMapping("/list")
	public ModelAndView chanceList(
			@RequestParam(value = "status", required = false, defaultValue = "1") Integer status,
			@RequestParam(value = "pageNo", required = false, defaultValue = "1") Integer pageNum,
			@RequestParam(value = "pageSize", required = false, defaultValue = "2") Integer pageSize,
			ParametersBean<?> pb) throws Exception {

		ModelAndView mav = new ModelAndView("chance/list");
		return mav;
	}

	/**
	 * 
	 * @Title: input
	 * @Description: 跳转到新增页面 /chance/input.jsp <br>
	 * @param: createUserId
	 * @param: map
	 * @return: String
	 * @throws Exception
	 * @Date:2016年3月28日上午11:46:08
	 */
	@RequestMapping(value = "/input", method = RequestMethod.GET)
	public String input(Map<String, Object> map) throws Exception {

		map.put("chance", new SalesChances());
		return "chance/input";
	}

		

}
