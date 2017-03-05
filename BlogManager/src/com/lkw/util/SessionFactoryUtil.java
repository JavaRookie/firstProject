package com.lkw.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * sessionFactoy *
 * 静态工厂方法 
 * @author wangchao
 * @时间 2017年2月24日
 *
 */
public class SessionFactoryUtil {

	private static SessionFactory sessionFactory =new Configuration().configure().buildSessionFactory() ;

	/**
	 * 获取Session
	 * @时间 2017年2月24日
	 * @作者	wangchao
	 * @参数 @return
	 */
	public static SessionFactory getSessionFactory() {

		return sessionFactory;

	}

}
