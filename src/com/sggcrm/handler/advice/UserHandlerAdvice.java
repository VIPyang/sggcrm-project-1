package com.sggcrm.handler.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @ClassName:	UserHandlerAdvice
 * @Description:UsreHandler相关处理
 * @author:	和鹏
 * @date:	2016年3月29日 上午2:41:59
 *
 */
@ControllerAdvice
public class UserHandlerAdvice {
	
	//用户名不存在或者是没有登录权限
	@ExceptionHandler(value = com.sggcrm.custom.exception.UserException.class)
	public ModelAndView accountNotFound(Exception ex) {
		ModelAndView mav = new ModelAndView("home/index");
		mav.addObject("exception", ex);
		return mav;
	}
}
