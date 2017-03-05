package com.lkw.dao;

import com.lkw.domain.User;

/**
 * 
 * @ClassName: UserDao 
 * @Description: 用户管理的Dao层接口
 * @author lkw
 * @date 2017年2月26日 下午12:42:35 
 *
 */
public interface UserDao {
	
	/**
	 * Dao层用户登录的方法
	 * @param product
	 */

	 User findByUsernameAndPwd(User user);

	int modifyUserPwd(User user);

}
