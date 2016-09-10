(function(){
	"use strict";
	var app = angular.module("store-locator");
	var storeService = function(StoreResource, Notification, Store, ConfigService, $state){
		function saveStore(vm){
			StoreResource.save(vm.store,
			function(response){
				$state.go("home");
				Notification.success("Store saved successfully!");
				
			},
			function(response){
				Notification.error("Something went wrong!");
			}
			);
			
		}
		function resetData(vm){
			console.log(ConfigService.newInstance());
			vm.map = ConfigService.newInstance().maps.defaultConfig;
			vm.marker = ConfigService.newInstance().maps.defaultMarker;
			vm.store = Store.createInstance();
			console.log(vm.store);
			
		}
		
		return {
			saveStore : saveStore,
			resetData : resetData
		}
	}
	app.service("StoreService",["StoreResource", "Notification", "Store", "ConfigService","$state", storeService]);
	
}())