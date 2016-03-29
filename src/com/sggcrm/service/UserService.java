package com.sggcrm.service;

import java.util.Map;

import com.sggcrm.pojo.Users;



/**
 * 
 * @ClassName:	UserService
 * @Description:用户模块服务层接口
 * @author:	和鹏
 * @date:	2016年3月29日 上午2:43:36
 *
 */
public interface UserService {

	// 用户不存在
	public final static int NOT_EXIST = -1;

	// 用户存在但是不具备登录权限
	public final static int EXIST_DISABLE = 0;

	// 用户存在具备登录权限
	public final static int EXIST_ENABLE = 1;

	
	
	UserMsg getUserMsg();
	
	/**
	 * 
	 * <p>@ClassName: UserService.java</p>
	 * <p>@Description: 用户服务的相关信息</p>
	 * 
	 * @author 和鹏
	 * @version V1.0
	 * @Date 2016年3月27日 下午2:13:56
	 */
	interface UserMsg {
		
		/**
		 * 获取用户不存在的错误信息
		 */
		String getNotExistMsg();
		
		/**
		 * 获取到用户没有权限登录的信息
		 */
		String getDisableLoginMsg();
		
		/**
		 * 获取到用户密码错误的信息 
		 */
		String getPassWordError();
	}

}
