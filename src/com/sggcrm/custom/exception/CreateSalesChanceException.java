package com.sggcrm.custom.exception;

/**
 * 
 * <p>@ClassName: CreateSalesChanceException.java</p>
 * <p>@Description: 新增salesChances记录失败时抛出该异常</p>
 * 
 * @author 和鹏
 * @version V1.0
 * @Date 2016年3月28日 下午12:04:58
 */
public class CreateSalesChanceException extends SalesChancesException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;

	public CreateSalesChanceException(String message) {
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
