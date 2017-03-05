package com.lkw.action;

import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;

/**
 * 文件下载
 * 
 * @author wangchao
 * @时间 2017年2月20日
 *
 */
public class FileLoadAction {

	private String fileName;

	public String dw() {
		if(ServletActionContext.getRequest().getParameter("fileName")==null||"".equals(ServletActionContext.getRequest().getParameter("fileName"))){
			return "error";
			
		}else{
			return Action.SUCCESS;
		}
		
	}

	public InputStream getDownFile() throws Exception {
		this.fileName = ServletActionContext.getRequest().getParameter("fileName");
		// 获取资源路径
		return ServletActionContext.getServletContext().getResourceAsStream("download/"+fileName);
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	
}
