package com.causecode.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.causecode.dao.impl.StoreDao;
import com.causecode.models.Store;
import com.causecode.utils.CCConstants;
import com.causecode.utils.GeoLocation;

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

	public Boolean deleteStore(Long id) {
		Boolean flag = true;
		try{
			Store store = getStore(id);
			store.setStatus(false);
			save(store);
		}
		catch(Exception e){
			flag = false;
		}
		return flag;
	}

	public Store getStore(Long id) {
		Store store = null;
		try{
		 store = (Store)getSession().get(Store.class, id);
		 if(!store.getStatus())
			 store = null;
		}
		catch(Exception e){}
		return store;
	}

	public List<Store> searchStores(GeoLocation location, Double radius) {
		GeoLocation[] boundingCoordinates =	location.boundingCoordinates(radius, CCConstants.EARTH_RADIUS);
		boolean meridian180WithinDistance =	boundingCoordinates[0].getLongitudeInRadians() > boundingCoordinates[1].getLongitudeInRadians();
		Query query = getSession().createSQLQuery("SELECT * FROM stores WHERE status = 1 AND (RADIANS(latitude) >= :a AND RADIANS(latitude) <= :b) AND (RADIANS(longitude) >= :c " +(meridian180WithinDistance ? "OR" : "AND") + " RADIANS(longitude) <= :d) AND " +"acos(sin(:e) * sin(RADIANS(latitude)) + cos(:f) * cos(RADIANS(latitude)) * cos(RADIANS(longitude) - :g)) <= :h")
				.addEntity(Store.class)
				.setParameter("a", boundingCoordinates[0].getLatitudeInRadians())
				.setParameter("b", boundingCoordinates[1].getLatitudeInRadians())
				.setParameter("c", boundingCoordinates[0].getLongitudeInRadians())
				.setParameter("d", boundingCoordinates[1].getLongitudeInRadians())
				.setParameter("e", location.getLatitudeInRadians())
				.setParameter("f", location.getLatitudeInRadians())
				.setParameter("g", location.getLongitudeInRadians())
				.setParameter("h", CCConstants.EARTH_RADIUS / radius);
		@SuppressWarnings("unchecked")
		List<Store> stores = query.list();
		return stores;
	}

}
