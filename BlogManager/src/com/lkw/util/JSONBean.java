package com.lkw.util;

/**
 * 前端交互模型
 * @author wangchao
 * @时间 2016年12月28日
 */
public class JSONBean {

	public static final int SUCCESS =0;
	public static final int FAIL =1;
	

	public static final String ERROR_MESSAGE="服务器报错"; 
	
	/**
	 * 0 请求 成功 
	 * 1 请求失败
	 */
	private int code;
	
	/**
	 * 消息
	 */
	private  String message;
	
	/**
	 *  用户请求返回内容
	 */
	private Object result;
	
	private  JSONBean(){
		
	}
	

	public JSONBean(int code, String message, Object result) {
		this.code = code;
		this.message = message;
		this.result = result;
	}



	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}
	
	
	
	
}
