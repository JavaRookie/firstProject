package com.lkw.action;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.lkw.domain.User;
import com.lkw.service.UserService;
import com.lkw.util.ResponseUtil;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import net.sf.json.JSONObject;

/**
 * 用户实体类
 * @ClassName: UserAction 
 * @Description: TODO 
 * @author lkw
 * @date 2017年2月26日 下午3:30:41 
 *
 */
public class UserAction extends ActionSupport implements ModelDriven<User> {
	//定义模型驱动类
	private User user = new User();
	private String isCookie;
	
	public String getIsCookie() {
		return isCookie;
	}
	public void setIsCookie(String isCookie) {
		this.isCookie = isCookie;
	}
	@Override
	public User getModel() {
		return user;
	}
	//struts2和spring整合过程中按名称自动注入业务层类
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	/**
	 * action 调用service层方法
	 * @return
	 */
	HttpServletRequest request =ServletActionContext.getRequest();
	HttpServletResponse response =ServletActionContext.getResponse();
	public String login(){
		String yzm=(String)request.getSession().getAttribute("yzm");
		String text=request.getParameter("text");
		if(!yzm.equalsIgnoreCase(text)){
			this.addActionError("验证码错误!");
			return INPUT;
		}else{
			//调用业务层的类
			User u=userService.login(user);
			if(u==null){
				//登录失败
				this.addActionError("用户名或密码错误!");
				return INPUT;
			}else{
				if("on".equals(isCookie)){
					Cookie [] cs =request.getCookies();
					boolean flag=true;
					if(cs!=null){
						for (Cookie cookie : cs) {
							if(cookie.getName().equals("login")){
								flag=false;
								break;
							}
						}
					}
					if(flag){
						Cookie login =new Cookie("login",""+user.getUserName()+"&"+user.getUserPwd()+"");
						login.setMaxAge(60*60*24*10);
						response.addCookie(login);
					}
				}else{
					Cookie[] cs =request.getCookies();
					for (Cookie cookie : cs) {
						if(cookie.getName().equals("login")){
							cookie.setMaxAge(0);
							response.addCookie(cookie);
						}
					}
				}
				//登陆成功
				ActionContext.getContext().getSession().put("User", u);
				return SUCCESS;
			}
		}
	}
	/**
	 * 退出销毁session
	 * @return
	 */
	public String loginout(){
		request.getSession().invalidate();
		return "loginout";
	}
	/**
	 * 修改密码
	 */
	public void modifyPassword(){
		int id=userService.modifyPwd(user);
		JSONObject result= new JSONObject();
		if(id!=0){
			result.put("success", "true");
		}else{
			result.put("error", "修改失败");
		}
		try {
			ResponseUtil.write(response, result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
