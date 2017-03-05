package com.lkw.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.lkw.dao.UserDao;
import com.lkw.domain.User;
import com.lkw.service.UserService;

/**
 * 用户管理的业务层实现类
 * @ClassName: UserServiceImpl 
 * @Description: TODO 
 * @author lkw
 * @date 2017年2月26日 下午5:16:06 
 *
 */
@Transactional
public class UserServiceImpl implements UserService {
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	/**
	 * 业务层登陆方法
	 */
	public User login(User user) {
		User u = userDao.findByUsernameAndPwd(user);
		return u;
	}

	@Override
	public int modifyPwd(User user) {
		int i=userDao.modifyUserPwd(user);
		return i;
	}
	
}
