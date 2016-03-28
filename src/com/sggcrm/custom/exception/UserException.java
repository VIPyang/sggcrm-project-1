package com.sggcrm.custom.exception;

/**
 * 
 * <p>@ClassName: UserException.java</p>
 * <p>@Description: 用户异常的超类</p>
 * 
 * @author 和鹏
 * @version V1.0
 * @Date 2016年3月26日 下午7:28:04
 */
public class UserException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;

	public UserException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
