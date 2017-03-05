package com.lkw.dao;

import java.util.List;

import com.lkw.domain.Consumer;
import com.lkw.domain.PageBean;
import com.lkw.domain.User;

/**
 * 
 * @ClassName: ConsumerDao 
 * @Description: 用户管理的Dao层接口
 * @author lkw
 * @date 2017年2月26日 下午12:42:35 
 *
 */
public interface ConsumerDao {
	
	/**
	 * Dao层用户登录的方法
	 * @param product
	 */

	 List<Consumer> showAllConsumer(PageBean p,Consumer c);

	 int findCount(Consumer c);

	 int modifyConsumer(Consumer cs);

	int addConsumer(Consumer cs);

	int deleteConsumer(String ids);

	boolean checkName(String username);

	boolean register(Consumer c);

}
