package com.sggcrm.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sggcrm.service.UserService;


/**
 * 
 * @ClassName:	UserHandler
 * @Description:"用户"相关操作处理器
 * @author:	和鹏
 * @date:	2016年3月29日 上午3:10:53
 *
 */
@Controller
@RequestMapping("/user")
public class UserHandler {

	@Autowired
	private UserService userService;

	
}
