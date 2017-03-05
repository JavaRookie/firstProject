package com.lkw.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 用户实体类
 * @ClassName: User 
 * @Description: TODO 
 * @author lkw
 * @date 2017年2月26日 下午3:24:03 
 *
 */
@Entity
@Table(name="t_user")
public class User {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	@Column(name="userName")
	private String userName;
	@Column(name="userPwd")
	private String userPwd;
	@Column(name="imgurl")
	private String imgUrl;
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
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
		return "User [id=" + id + ", name=" + name + ", userName=" + userName + ", userPwd=" + userPwd + ", imgUrl="
				+ imgUrl + "]";
	}
	
}
