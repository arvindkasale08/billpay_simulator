package com.causecode.dao.impl;

import java.util.List;

import com.causecode.models.Store;
import com.causecode.utils.GeoLocation;

public interface StoreDao {

	Store save(Store store);

	List<Store> list();

	Boolean deleteStore(Long id);

	Store getStore(Long id);

	List<Store> searchStores(GeoLocation location, Double radius);

}
