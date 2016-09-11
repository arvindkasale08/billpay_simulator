package com.causecode.services;

import java.util.List;
import com.causecode.models.Store;

public interface StoreService {

	public List<Store> getAllStores();

	public Store getStore(Long id);

	public Store saveStore(Store store);

	public Boolean deleteStore(Long id);

	public List<Store> searchStores(Double latitude, Double longitude, Double radius);
}
