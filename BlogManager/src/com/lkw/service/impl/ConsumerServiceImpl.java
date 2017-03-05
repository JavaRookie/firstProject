package com.lkw.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.lkw.dao.ConsumerDao;
import com.lkw.domain.Consumer;
import com.lkw.domain.PageBean;
import com.lkw.service.ConsumerService;
@Transactional
public class ConsumerServiceImpl implements ConsumerService{
	private ConsumerDao consumerDao;
	
	public void setConsumerDao(ConsumerDao consumerDao) {
		this.consumerDao = consumerDao;
	}

	@Override
	public List<Consumer> showAllConsumer(PageBean p,Consumer c) {
		List<Consumer> ls = consumerDao.showAllConsumer(p,c);
		return ls;
	}


	@Override
	public int findCount(Consumer c) {
		int i=consumerDao.findCount(c);
		return i;
	}

	@Override
	public int modifyConsumer(Consumer cs) {
		int i=consumerDao.modifyConsumer(cs);
		return i;
	}

	@Override
	public int addconsumer(Consumer cs) {
		int i=consumerDao.addConsumer(cs);
		return i;
	}

	@Override
	public int deleteConsumer(String ids) {
		int i=consumerDao.deleteConsumer(ids);
		return i;
	}

	@Override
	public boolean checkName(String username) {
		boolean a=consumerDao.checkName(username);
		return a;
	}

	@Override
	public boolean addConsumer(Consumer c) {
		boolean a=consumerDao.register(c);
		return a;
	}

}
