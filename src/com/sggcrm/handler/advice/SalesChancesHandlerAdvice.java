package com.sggcrm.handler.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @ClassName:	SalesChancesAdvice
 * @Description:SalesChances相关处理
 * @author:	和鹏
 * @date:	2016年3月29日 上午2:39:29
 *
 */
@ControllerAdvice
public class SalesChancesHandlerAdvice {
	
	/*
	 * 新增记录的时候抛出了异常
	 */
	@ExceptionHandler(value = com.sggcrm.custom.exception.CreateSalesChanceException.class)
	public ModelAndView createExceptionHandler(Exception ex) {
		ModelAndView mav = new ModelAndView("chance/input");
		mav.addObject("exception", ex);
		return mav;
	}
	
	@ExceptionHandler(value = com.sggcrm.custom.exception.SalesChancesException.class)
	public ModelAndView commonExceptionHandler(Exception ex) {
		ModelAndView mav = new ModelAndView("chance/list");
		mav.addObject("exception", ex);
		return mav;
	}
}
