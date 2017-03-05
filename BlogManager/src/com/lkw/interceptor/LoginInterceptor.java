package com.lkw.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		Map<String,Object> session =invocation.getInvocationContext().getSession();
		//User user =(User)invocation.getInvocationContext().getSession().get("user");
		if(session.get("User")!=null){
			System.out.println("拦截了！");
			String result=invocation.invoke();
			System.out.println(result);
			return result;
		}else{
			System.out.println("未进入");
			return "fail";
		}
	}

}
