package com.lkw.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class TimeInterceptor extends AbstractInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		long start=System.currentTimeMillis();
		//执行下一个拦截器
		String result=arg0.invoke();
		System.out.println(result);
		long end =System.currentTimeMillis();
		System.out.println("所需时间:"+(end-start));
		return result;
	}

}
