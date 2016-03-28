package com.sggcrm.custom.exception;

/**
 * 
 * <p>@ClassName: SalesChancesException.java</p>
 * <p>@Description: SalesChances相关异常的超类</p>
 * 
 * @author 和鹏
 * @version V1.0
 * @Date 2016年3月28日 下午12:31:40
 */
public class SalesChancesException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;

	public SalesChancesException(String message) {
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
