package com.causecode.controllers;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.causecode.models.Store;
import com.causecode.services.StoreService;

@RestController
public class StoresController {
	
	private static final Logger logger = Logger.getLogger(StoresController.class);
	
	@Autowired
	private StoreService storeService;

	@RequestMapping(value="/api/stores/", method = RequestMethod.GET)
	public ResponseEntity<List<Store>> getStores(){
		List<Store> stores = storeService.getAllStores();
		return new ResponseEntity<List<Store>>(stores, HttpStatus.OK);
	}
	
	@RequestMapping(value="/api/stores", method = RequestMethod.POST)
	public ResponseEntity<Store> saveStore(@RequestBody Store store){
		logger.debug("Saving store with value: "+store);
		store = storeService.saveStore(store);
		return new ResponseEntity<Store>(store, HttpStatus.OK);
	}
	
	@RequestMapping(value="/api/stores/{id}", method = RequestMethod.GET)
	public ResponseEntity<Store> getStore(@PathVariable("id") Long id){
		Store store = storeService.getStore(id);
		return new ResponseEntity<Store>(store, HttpStatus.OK);
	}
	
}
