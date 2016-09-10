package com.causecode.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.causecode.dao.impl.StoreDao;
import com.causecode.models.Store;

@Transactional
@Repository
public class StoreDaoImpl implements StoreDao {

	@Autowired
	private SessionFactory sessionFactory;
		
	public Store save(Store store) {
		return (Store)getSession().merge(store);
	}
	
	private Session getSession(){
		Session session = getSessionFactory().getCurrentSession();
		if(session == null)
			session = getSessionFactory().openSession();
		return session;
	}
	
	private SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@SuppressWarnings("unchecked")
	public List<Store> list() {
		return (List<Store>)getSession().createCriteria(Store.class).add(Restrictions.eq("status", true)).addOrder(Order.desc("createdDate")).list();
	}

}
