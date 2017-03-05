package com.lkw.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Entity;
/**
 * 客户实体类
 * @author Alien
 *
 */
@Entity
@Table(name="t_consumer")
public class Consumer {
	@Id
	@GeneratedValue
	private Integer id;
	@Column(name="userame")
	private String userName;
	@Column(name="userpwd")
	private String userPwd;
	private String name;
	private String sex;
	private String birthday;
	private String email;
	private String photourl;
	public String getPhotourl() {
		return photourl;
	}
	public void setPhotourl(String photourl) {
		this.photourl = photourl;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	@Override
	public String toString() {
		return "Consumer [id=" + id + ", userName=" + userName + ", userPwd=" + userPwd + ", name=" + name + ", sex="
				+ sex + ", birthday=" + birthday + ", email=" + email + ", photourl=" + photourl + "]";
	}
	
}
