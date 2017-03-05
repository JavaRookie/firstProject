package com.lkw.service;

import org.springframework.transaction.annotation.Transactional;

import com.lkw.domain.User;

/**
 * 
 * @ClassName: ProductService 
 * @Description: 用户的业务类
 * @author lkw
 * @date 2017年2月26日 下午12:42:58 
 *
 */
public interface UserService {

	User login(User user);

	int modifyPwd(User user);
	
}
