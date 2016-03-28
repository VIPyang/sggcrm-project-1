package com.sggcrm.custom.exception;

/**
 * 
 * <p>@ClassName: AccountNotFoundException.java</p>
 * <p>@Description: 用户未找到的时候抛出该异常</p>
 * 
 * @author 和鹏
 * @version V1.0
 * @Date 2016年3月26日 下午3:05:11
 */
public class AccountNotFoundException extends UserException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings("unused")
	private String message;

	public AccountNotFoundException(String message) {
		super(message);
	}
}
