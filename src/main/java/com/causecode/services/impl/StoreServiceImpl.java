package com.causecode.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.causecode.models.Store;
import com.causecode.services.StoreService;

@Service
public class StoreServiceImpl implements StoreService {

	public List<Store> getAllStores() {
		List<Store> stores = new ArrayList<Store>();
		for(int i=0; i<10; i++){
			Store store = new Store();
			store.setId(i);
			store.setLatitude(Math.random()*i+"");
			store.setLongitude(Math.random()*i+"");
			store.setName("Store-"+i);
			store.setOwner("Owner-"+i);
			store.setType("Type-"+i);
			store.setAddress("Address-"+i);
			stores.add(store);
		}
		return stores;
	}

	public Store getStore(Long id) {
		return new Store("Store 1", "Owner 1", "Type 1", "Address 1", "Latitude 1", "Longitude 1");
	}

}
