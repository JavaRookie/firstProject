package com.lkw.actionapi;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.lkw.domain.Consumer;
import com.lkw.service.ConsumerService;
import com.lkw.util.DateUtil;
import com.lkw.util.DescUtil;

public class RegisterAction  {
	private ConsumerService consumerService;
	public void setConsumerService(ConsumerService consumerService) {
		this.consumerService = consumerService;
	}
	private Consumer c =new Consumer();
	private String name;
	private String username;
	private String userpwd;
	private String sex;
	private Date birthday;
	private String email;
	private File photo;
	private String photoFileName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public File getPhoto() {
		return photo;
	}
	public void setPhoto(File photo) {
		this.photo = photo;
	}
	public String getPhotoFileName() {
		return photoFileName;
	}
	public void setPhotoFileName(String photoFileName) {
		this.photoFileName = photoFileName;
	}
	public void register(){
		HttpServletResponse response =ServletActionContext.getResponse();
		HttpServletRequest request =ServletActionContext.getRequest();
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setContentType("text/html;charset=utf-8");
		//System.out.println(name+username+userpwd+sex+email+DateUtil.formatDate(birthday, "yyyy-MM-dd")+photoFileName);
		//System.out.println(DateUtil.formatDate(birthday, "yyyy-MM-dd"));
		String date=DateUtil.formatDate(birthday, "yyyy-MM-dd");
		String rootPath = ServletActionContext.getServletContext().getRealPath("/photos");
		String newFileName = new Date().getTime()+photoFileName.substring(photoFileName.lastIndexOf("."));
		File newFile = new File(rootPath+"/"+newFileName);
		//user.setPhotoPath("photos/"+newFileName);
		// 保存文件
		try {
			FileUtils.moveFile(photo, newFile);
			//System.out.println(newFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c.setName(name);
		c.setUserName(username);
		try {
			userpwd=DescUtil.encryption(userpwd);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		c.setUserPwd(userpwd);
		c.setEmail(email);
		c.setBirthday(date);
		c.setSex(sex);
		c.setPhotourl("photos/"+newFileName);
		//System.out.println(c.toString());
		if(consumerService.addConsumer(c)){
			try {
				response.getWriter().write("<h1>注册成功</h1><a href='index.html'>点击回到主页</a>");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			try {
				response.getWriter().write("<h1>注册失败</h1><br/><a href='index.html'>点击回到主页</a>");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
