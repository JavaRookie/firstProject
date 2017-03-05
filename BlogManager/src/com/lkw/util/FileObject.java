package com.lkw.util;

public class FileObject {
	private String filename;
	private String filedesc;
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getFiledesc() {
		return filedesc;
	}
	public void setFiledesc(String filedesc) {
		this.filedesc = filedesc;
	}
	public FileObject(String filename, String filedesc) {
		super();
		this.filename = filename;
		this.filedesc = filedesc;
	}
	public FileObject() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
