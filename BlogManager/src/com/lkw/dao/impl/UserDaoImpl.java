package com.lkw.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.lkw.dao.UserDao;
import com.lkw.domain.User;
import com.lkw.util.DescUtil;

/**
 * 用户管理Dao层的实现类
 * @ClassName: UserDaoImpl 
 * @Description: TODO 
 * @author lkw
 * @date 2017年2月26日 下午5:17:13 
 *
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
	
	@Override
	/**
	 * dao层中根据用户名和密码查询用户的方法;
	 */
	public User findByUsernameAndPwd(User user) {
		String hql="from User where userName=? and userPwd=?";
		//调用Hibernate模版的find方法返回集合
		String pwd=null;
		try {
			pwd = DescUtil.encryption(user.getUserPwd());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<User> ls=this.getHibernateTemplate().find(hql,user.getUserName(),pwd);
		if(ls.size()>0){
			return ls.get(0);
		}
		return null;
	}

	@Override
	public int modifyUserPwd(User user) {
		int i=0;
		String hql="update User set userPwd=? where id=?";
		String pwd=null;
		try {
			pwd = DescUtil.encryption(user.getUserPwd());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i=this.getHibernateTemplate().bulkUpdate(hql, pwd,user.getId());
		return i;
	}

}
