package com.lkw.actionapi;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.lkw.service.ConsumerService;

import net.sf.json.JSONObject;

public class CheckNameAction {
	private ConsumerService consumerService;
	
	public void setConsumerService(ConsumerService consumerService) {
		this.consumerService = consumerService;
	}

	public void checkname(){
		HttpServletResponse response =ServletActionContext.getResponse();
		HttpServletRequest request =ServletActionContext.getRequest();
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setContentType("text/html;charset=utf-8");
        JSONObject json = new JSONObject();
		String username=request.getParameter("username");
		//System.out.println(username);
		if(consumerService.checkName(username)){
			 json.put("result", true);//验证成立
		}else{
			json.put("result", false);//验证成立
		}
	        try {
	            response.getWriter().print(json);
	        } catch (IOException e) {
	            //e.printStackTrace();
	        }
	}
}
