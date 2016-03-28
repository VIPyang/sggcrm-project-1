package com.sggcrm.custom.exception;

/**
 * 
 * <p>@ClassName: IllegalPassWordException.java</p>
 * <p>@Description: 输入的密码无效时抛出该异常</p>
 * 
 * @author 和鹏
 * @version V1.0
 * @Date 2016年3月26日 下午7:25:04
 */
public class IllegalPassWordException extends UserException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;

	public IllegalPassWordException(String message) {
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
