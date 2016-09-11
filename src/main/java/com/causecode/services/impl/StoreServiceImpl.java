package com.causecode.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.causecode.dao.impl.StoreDao;
import com.causecode.models.Store;
import com.causecode.services.StoreService;
import com.causecode.utils.GeoLocation;

@Service
public class StoreServiceImpl implements StoreService {

	@Autowired
	private StoreDao storeDao;
	
	public List<Store> getAllStores() {
		List<Store> stores = storeDao.list();
		return stores;
	}

	public Store getStore(Long id) {
		return storeDao.getStore(id);
	}

	public Store saveStore(Store store) {
		return storeDao.save(store);
	}

	public Boolean deleteStore(Long id) {
		return storeDao.deleteStore(id);
	}

	public List<Store> searchStores(Double latitude, Double longitude, Double radius) {
		GeoLocation location = GeoLocation.fromDegrees(latitude, longitude);
		return storeDao.searchStores(location, radius);
	}
	
	

}
