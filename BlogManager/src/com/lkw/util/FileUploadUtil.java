package com.lkw.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 多文件上传
 * @author Alien
 *
 */
public class FileUploadUtil extends ActionSupport {
	private List<File> file;
	private List<String> fileContentType;
	private List<String> fileFileName;
	private List<String> fileDesc;
	
	public List<String> getFileDesc() {
		return fileDesc;
	}


	public void setFileDesc(List<String> fileDesc) {
		this.fileDesc = fileDesc;
	}


	public List<File> getFile() {
		return file;
	}


	public void setFile(List<File> file) {
		this.file = file;
	}


	public List<String> getFileContentType() {
		return fileContentType;
	}


	public void setFileContentType(List<String> fileContentType) {
		this.fileContentType = fileContentType;
	}


	public List<String> getFileFileName() {
		return fileFileName;
	}


	public void setFileFileName(List<String> fileFileName) {
		this.fileFileName = fileFileName;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("###################");
		System.out.println(file);
		System.out.println(fileContentType);
		System.out.println(fileFileName);
		System.out.println(fileDesc);
		System.out.println("###################");
		List<FileObject> ls =new ArrayList<FileObject>();
		for (int i = 0; i < fileFileName.size(); i++) {
			ls.add(new FileObject(fileFileName.get(i),fileDesc.get(i)));
		}
		ActionContext.getContext().put("ls",ls);
		String rootPath = ServletActionContext.getServletContext().getRealPath("/photos");
		for (int i = 0; i < fileFileName.size(); i++) {
			String newFileName = new Date().getTime()+fileFileName.get(i).substring(fileFileName.get(i).lastIndexOf("."));
			File newFile = new File(rootPath+"/"+newFileName);
			//user.setPhotoPath("photos/"+newFileName);
			// 保存文件
			try {
				FileUtils.moveFile(file.get(i), newFile);
				//System.out.println(newFile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return SUCCESS;
	}
}
