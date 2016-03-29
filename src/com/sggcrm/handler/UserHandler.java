package com.sggcrm.handler;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sggcrm.commons.utils.LoginUtils;
import com.sggcrm.custom.exception.AccountNotFoundException;
import com.sggcrm.custom.exception.IllegalPassWordException;
import com.sggcrm.custom.exception.UserException;
import com.sggcrm.pojo.Users;
import com.sggcrm.service.UserService;
import com.sggcrm.service.impl.UserServiceImpl.UserMsg;


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
