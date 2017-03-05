package com.lkw.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lkw.domain.User;
import com.lkw.util.SessionFactoryUtil;

public class Test2 {
	Session session=SessionFactoryUtil.getSessionFactory().getCurrentSession();
	/*@Before
	public void setUp() throws Exception {
		session.beginTransaction();
	}

	@After
	public void tearDown() throws Exception {
		session.close();
	}*/

	@Test
	public void test() {
		session.beginTransaction();
		User u =(User) session.get(User.class, 1);
		System.out.println(u.getName());
		session.getTransaction().commit();
		System.out.println("@@@@@@@@@@@@@@@@@");
		session=SessionFactoryUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		User u1=(User) session.get(User.class, 1);
		System.out.println(u1.getName());
		session.getTransaction().commit();
	}
	@Test
	public void test1() {
		session.beginTransaction();
		Query q=session.createQuery("from User");
		q.setCacheable(true);
		List<User> ls =q.list();
		for (User user : ls) {
			System.out.println(user.getName());
		}
		session.getTransaction().commit();
		System.out.println("@@@@@@@@@@@@@@@@@");
		session=SessionFactoryUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query q1=session.createQuery("from User");
		
		User u=(User) session.createCriteria(User.class).add(Restrictions.eq("name","dsdsa")).list().get(0);
		
		System.out.println(u.getName());
		
		session.getTransaction().commit();
	}

}
