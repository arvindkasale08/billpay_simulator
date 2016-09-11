package com.causecode.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

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

	@RequestMapping(value="/api/stores", method = RequestMethod.GET)
	public ResponseEntity<List<Store>> getStores(){
		logger.debug("Fetching all stores from database");
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
		logger.debug("Fetching store with id "+id+" from database");
		Store store = storeService.getStore(id);
		logger.debug("Store value is: "+store);
		return new ResponseEntity<Store>(store, store==null ? HttpStatus.NOT_FOUND : HttpStatus.OK);
	}
	
	@RequestMapping(value="/api/stores/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> deleteStore(@PathVariable("id") Long id){
		logger.debug("Deleting store with id "+id+" from database");
		Boolean flag = storeService.deleteStore(id);
		return new ResponseEntity<Boolean>(flag, HttpStatus.OK);
	}
	
	@RequestMapping(value="/api/stores/search", method = RequestMethod.GET)
	public ResponseEntity<List<Store>> searchStore(HttpServletRequest request){
		Double latitude = Double.valueOf(request.getParameter("lat"));
		Double longitude = Double.valueOf(request.getParameter("lng"));
		Double radius = Double.valueOf(request.getParameter("radius"));
		logger.debug("Searching stores within "+radius+"km from lat "+latitude+"long "+longitude+" from database");
		List<Store> list = storeService.searchStores(latitude, longitude, radius);
		return new ResponseEntity<List<Store>>(list, HttpStatus.OK);
	}
	
}
