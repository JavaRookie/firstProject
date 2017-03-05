package com.lkw.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lkw.domain.Consumer;
import com.lkw.domain.PageBean;
import com.lkw.service.ConsumerService;
import com.lkw.util.ResponseUtil;
import com.lkw.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import net.sf.json.JSONObject;

public class ConsumerAction extends ActionSupport implements ModelDriven<Consumer> {
	
	private Consumer consumer= new Consumer();
	
	@Override
	public Consumer getModel() {
		return consumer;
	}
	//struts2和spring整合过程中按名称自动注入业务层类
		private ConsumerService consumerService;

		public void setConsumerService(ConsumerService consumerService) {
			this.consumerService = consumerService;
		}
		HttpServletRequest request =ServletActionContext.getRequest();
		HttpServletResponse response =ServletActionContext.getResponse();

		public String showConsumer(){
			String page=request.getParameter("page");
			String rows=request.getParameter("rows");
			if(StringUtil.isEmpty(page)||StringUtil.isEmpty(rows)){
				return "index";
			}
			PageBean pageBean=new PageBean(Integer.parseInt(page),Integer.parseInt(rows));
			try {
				JSONObject result =new JSONObject();
				//JSONArray array=JsonUtil.formatRsToJsonArray(consumerService.showAllConsumer(pageBean, consumer));
				ObjectMapper mapper= new ObjectMapper();
				String array=mapper.writeValueAsString(consumerService.showAllConsumer(pageBean, consumer));
				int total=consumerService.findCount(consumer);
				result.put("rows", array);
				result.put("total", total);
				ResponseUtil.write(response, result);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "show";
		}
		
		public String addConsumer(){
			String name=request.getParameter("name");
			String sex=request.getParameter("sex");
			//String age=request.getParameter("age");
			String birthday=request.getParameter("birthday");
			String email=request.getParameter("email");
			String id=request.getParameter("id");
			Consumer cs =new Consumer();
			cs.setName(name);
			cs.setSex(sex);
			//cs.setAge(age);
			cs.setBirthday(birthday);
			cs.setEmail(email);
			if(StringUtil.isNotEmpty(id)){
				cs.setId(Integer.parseInt(id));
			}
			int ids=0;
			if(StringUtil.isNotEmpty(id)){
				ids=consumerService.modifyConsumer(cs);
			}else{
				ids=consumerService.addconsumer(cs);
			}
			JSONObject result= new JSONObject();
			if(ids>0){
				result.put("success", "true");
			}else{
				result.put("success", "true");
				result.put("errorMessage", "添加失败");
			}
			try {
				ResponseUtil.write(response, result);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "add";
		}
		
		public String deleteConsumer(){
			String ids =request.getParameter("delIds");
			int id=consumerService.deleteConsumer(ids);
			JSONObject result= new JSONObject();
			if(id>0){
				result.put("success", "true");
				result.put("delNums", ids);
			}else{
				result.put("errorMessage", "删除失败");
			}
			try {
				ResponseUtil.write(response, result);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "delete";
			
		}
}
