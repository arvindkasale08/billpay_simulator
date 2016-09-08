package com.causecode.services;

import java.util.List;
import com.causecode.models.Store;

public interface StoreService {

	public List<Store> getAllStores();

	public Store getStore(Long id);
}