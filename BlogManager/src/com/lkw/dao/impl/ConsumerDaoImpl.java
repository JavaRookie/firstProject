package com.lkw.dao.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.lkw.dao.ConsumerDao;
import com.lkw.domain.Consumer;
import com.lkw.domain.PageBean;
import com.lkw.domain.User;
import com.lkw.util.DateUtil;
import com.lkw.util.StringUtil;

/**
 * 用户管理Dao层的实现类
 * @ClassName: UserDaoImpl 
 * @Description: TODO 
 * @author lkw
 * @date 2017年2月26日 下午5:17:13 
 *
 */
public class ConsumerDaoImpl  implements ConsumerDao {
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public int findCount(Consumer c) {
		try {
			Session session =sessionFactory.getCurrentSession();
			System.out.println("执行了count");
			StringBuffer sb = new StringBuffer("from Consumer where 1=1");
			if(c!=null&&StringUtil.isNotEmpty(c.getName())){
				sb.append(" and name like '%"+c.getName()+"%'");
			}
			if(c!=null&&StringUtil.isNotEmpty(c.getSex())){
				sb.append(" and sex like '%"+c.getSex()+"%'");
			}
			Query query = session.createQuery(sb.toString());
			@SuppressWarnings("unchecked")
			List <Consumer> list = query.list();
			return list.size();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			/*sessionFactory.getCurrentSession().close();
			sessionFactory.close();*/
			System.out.println("关闭了fa");
		}
		return 0;
	}
	
	@Override
	public List<Consumer> showAllConsumer(PageBean p, Consumer c) {
		try {
			System.out.println("执行了list");
			Session session =sessionFactory.getCurrentSession();
			StringBuffer sb = new StringBuffer("from Consumer where 1=1");
			if(c!=null&&StringUtil.isNotEmpty(c.getName())){
				sb.append(" and name like '%"+c.getName()+"%'");
			}
			if(c!=null&&StringUtil.isNotEmpty(c.getSex())){
				sb.append(" and sex like '%"+c.getSex()+"%'");
			}
			Query query = session.createQuery(sb.toString());
			//int totalCount = this.findCount(c);//总条数
			query.setFirstResult(p.getStart());
			query.setMaxResults(p.getRows());
			@SuppressWarnings("unchecked")
			List <Consumer> list = query.list();
			return list;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			/*sessionFactory.getCurrentSession().close();
			sessionFactory.close();*/
			System.out.println("关闭session");
		}
		return null;
	}

 
	@Override
	public int modifyConsumer(Consumer cs) {
		Session session =sessionFactory.getCurrentSession();
		Consumer c =(Consumer) session.get(Consumer.class, cs.getId());
		c.setName(cs.getName());
		c.setSex(cs.getSex());
		c.setBirthday(cs.getBirthday());
		c.setEmail(cs.getEmail());
		session.update(c);
		return 1;
	}

	@Override
	public int addConsumer(Consumer cs) {
		Session session =sessionFactory.getCurrentSession();
		Consumer c =new Consumer();
		c.setName(cs.getName());
		c.setSex(cs.getSex());
		c.setBirthday(cs.getBirthday());
		c.setEmail(cs.getEmail());
		c.setUserName("root");
		c.setUserPwd("root");
		c.setPhotourl("photos/admin.jpg");
		session.save(c);
		return 1;
	}

	@Override
	public int deleteConsumer(String ids) {
		Session session =sessionFactory.getCurrentSession();
		String hql="delete from Consumer where id in ("+ids+")";
		Query query = session.createQuery(hql);
		int i=query.executeUpdate();
		return i;
	}

	@Override
	public boolean checkName(String username) {
		Session session =sessionFactory.getCurrentSession();
		String hql ="from Consumer where username=?";
		Query query=session.createQuery(hql);
		query.setString(0, username);
		if(query.list().size()!=0){
			return false;
		}
		return true;
	}

	@Override
	public boolean register(Consumer c) {
		Session session =sessionFactory.getCurrentSession();
		session.save(c);
		return true;
	}

	
}
