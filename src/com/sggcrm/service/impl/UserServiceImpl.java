package com.sggcrm.service.impl;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.sggcrm.commons.utils.SessionServerUtils;
import com.sggcrm.mapper.UsersMapper;
import com.sggcrm.pojo.Users;
import com.sggcrm.pojo.UsersExample;
import com.sggcrm.pojo.UsersExample.Criteria;
import com.sggcrm.service.UserService;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UsersMapper usersMapper;

	// 用户名不存在
	@Value("${username.not.exist}")
	private String notExistMsg;

	// 用户不具备登录权限
	@Value("${disable.login}")
	private String disableLogin;

	// 用户密码错误
	@Value("${password.error}")
	private String passwordError;
	
	private UserMsg userMsg;

	
	
	/**
	 * 
	 * <p>Title: getUserMsg</p>
	 * <p>Description:获取描述用户信息的实例 </p>
	 * @return 返回描述用户信息的实例对象
	 * @author:	和鹏
	 * @see com.sggcrm.service.UserService#getUserMsg()
	 */
	@Override
	public UserMsg getUserMsg() {
		if(null == userMsg){
			synchronized(this){
				if(null == userMsg){
					userMsg = new UserMsg();
				}
			}
		}
		return userMsg;
	}

	public class UserMsg implements UserService.UserMsg {
		
		//默认构造器的accessible标志
		private boolean isAccessible;
		
		{
			Class<?> clazz = SessionServerUtils.class;
			Constructor<?> defaultConst = clazz.getDeclaredConstructors()[0];
			if(defaultConst instanceof AccessibleObject){
				AccessibleObject abo = defaultConst;
				isAccessible = abo.isAccessible();
			}
		}
		
		private UserMsg() {
			if(isAccessible)
				throw new IllegalAccessError("保证该类实例的唯一性");
		}

		@Override
		public String getNotExistMsg() {
			return notExistMsg;
		}

		@Override
		public String getDisableLoginMsg() {
			return disableLogin;
		}

		@Override
		public String getPassWordError() {
			return passwordError;
		}

	}

}
