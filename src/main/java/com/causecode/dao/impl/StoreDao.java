package com.causecode.dao.impl;

import java.util.List;

import com.causecode.models.Store;

public interface StoreDao {

	Store save(Store store);

	List<Store> list();

}
