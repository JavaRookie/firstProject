package com.lkw.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.lkw.domain.Consumer;
import com.lkw.domain.PageBean;
import com.lkw.domain.User;

/**
 * 
 * @ClassName: ProductService 
 * @Description: 用户的业务类
 * @author lkw
 * @date 2017年2月26日 下午12:42:58 
 *
 */
public interface ConsumerService {

	List<Consumer> showAllConsumer(PageBean p,Consumer c);
	int findCount(Consumer c);
	int modifyConsumer(Consumer cs);
	int addconsumer(Consumer cs);
	int deleteConsumer(String ids);
	boolean checkName(String username);
	boolean addConsumer(Consumer c);
	
}
