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

	// 查找用户记录
	@RequestMapping("/checkUserName")
	@ModelAttribute
	private void findAccount(
			@RequestParam(value = "username", required = false) String username)
			throws Exception {
		if (null != username) {
			if (!"".equals(username.trim())) {
				// 根据用户名去数据库中查找对应的用户记录
				Map<Integer, Users> resultMap = userService
						.getOneEnableByUserName(username);
				String message = null;
				for (Integer key : resultMap.keySet()) {
					if (UserService.NOT_EXIST == key) {
						message = null;
					} else if (UserService.EXIST_DISABLE == key) {
						message = null;
					}
					if (key != UserService.EXIST_ENABLE)
						throw new AccountNotFoundException(message);
				}
			}
		}
	}

	/**
	 * 
	 * @Title: login
	 * @Description: 处理用户的登录请求
	 * @param: username
	 * @param: password
	 * @throws Exception
	 * @Date:2016年3月26日下午1:32:06
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(
			@RequestParam(value = "username", required = false) String username,
			@RequestParam(value = "password", required = false) String password,
			HttpSession session) throws Exception {

		Users user = null;
		String message = null;
		UserMsg userMsg = null;
		if (null != username) {
			if (!"".equals(username.trim())) {
				// 根据用户名去数据库中查找对应的用户记录
				Map<Integer, Users> resultMap = userService
						.getOneEnableByUserName(username);
				userMsg = (UserMsg) userService.getUserMsg();
				for (Integer key : resultMap.keySet()) {
					if (UserService.NOT_EXIST == key) {
						message = userMsg.getNotExistMsg();
					} else if (UserService.EXIST_DISABLE == key) {
						message = userMsg.getDisableLoginMsg();
					}
					if (key != UserService.EXIST_ENABLE)
						throw new UserException(message);
				}
				user = resultMap.get(UserService.EXIST_ENABLE);
			}
		}
		
		// 比对密码
		if (LoginUtils.checkPwd(user.getPassword(), password)) {
			// 使用session服务器,将session都存储在session服务器中
			session.setAttribute("current_user", user);
		} else {
			throw new IllegalPassWordException(userMsg.getPassWordError());
		}
		return "home/main";
	}

}
