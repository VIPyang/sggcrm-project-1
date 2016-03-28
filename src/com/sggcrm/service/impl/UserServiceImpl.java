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
	 * @Title: getOneByUserName
	 * @Description: 根据用户名查询用户记录
	 * @param: username
	 * @return: Users
	 * @throwsException
	 * @Date:2016年3月26日下午2:46:42
	 */
	@Override
	public Users getOneByUserName(String username) throws Exception {
		UsersExample useExample = new UsersExample();
		Criteria criteria = useExample.createCriteria();
		criteria.andNameEqualTo(username);
		List<Users> list = usersMapper.selectByExample(useExample);
		if (null != list && list.size() == 1) {
			return list.get(0);
		}
		return null;
	}

	/**
	 * 
	 * <p>Title: getOneEnableByUserName</p>
	 * <p>Description: 根据给定的用户名查找用户记录,并确定该用户是否具备登录权限</p>
	 * @param username
	 * @return 返回Map,Map的键为int类型,值为Users类型;<br>
	 * 			表示用户的状态:-1 表示用户名不存在,值为null;<br>
	 * 			0 表示用户名存在但是不允许登录,值不为null<br>
	 * 			1 表示用户名存在且允许登录,值不为null<br>
	 * @throws Exception
	 * @author:	和鹏
	 * @see com.sggcrm.service.UserService#getOneEnableByUserName(java.lang.String)
	 */
	@Override
	public Map<Integer, Users> getOneEnableByUserName(String username)
			throws Exception {
		Map<Integer, Users> map = new HashMap<Integer, Users>();
		Users user = getOneByUserName(username);
		if (null != user) {
			// 1 enable 0 disable
			Integer isEnabled = user.getEnabled();
			if (null != isEnabled && isEnabled == 1) {
				map.put(UserService.EXIST_ENABLE, user);
			} else if (isEnabled == 0) {
				map.put(UserService.EXIST_DISABLE, user);
			}
		} else {
			map.put(UserService.NOT_EXIST, null);
		}
		return map;
	}
	
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
