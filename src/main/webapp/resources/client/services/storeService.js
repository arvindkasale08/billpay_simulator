(function(){
	"use strict";
	var app = angular.module("store-locator");
	var storeService = function(StoreResource, Notification, Store, ConfigService, $state){
		function saveStore(vm){
			StoreResource.save(vm.store,
			function(response){
				$state.go("stores/list");
				Notification.success("Store saved successfully!");
				
			},
			function(response){
				Notification.error("Something went wrong!");
			}
			);
			
		}
		function resetData(vm, id){
			vm.map = ConfigService.newInstance().maps.defaultConfig;
			vm.marker = ConfigService.newInstance().maps.defaultMarker;
			vm.store = Store.createInstance();
			vm.refresh = true;
			if(id)
			{
				getStore(id).$promise.then(function(resp){
					vm.map = ConfigService.newInstance().maps.defaultConfig;
					vm.marker = ConfigService.newInstance().maps.defaultMarker;
					vm.store = resp;
					vm.refresh = true;
				});
			}
			
		}
		
		function resetCircle(vm){
			vm.circle = {
					id: 1,
	                radius: vm.search.value,
	                stroke: {
	                    color: '#08B21F',
	                    weight: 2,
	                    opacity: 1
	                },
	                fill: {
	                    color: '#08B21F',
	                    opacity: 0.3
	                }
			}
		}
		
		function attachEvents(vm, geocoder){
			/*Add events to marker*/
			vm.marker.events = {
			        dragend: function (marker, eventName, args) {
			            var lat = marker.getPosition().lat();
			            var lon = marker.getPosition().lng();
			            vm.store.latitude = lat;
			            vm.store.longitude =lon;
			            geocoder.geocode({'location': marker.getPosition()}, function(results, status) {
			            	if (status === 'OK') {
			                  if (results[1]) {
			                	  vm.store.address = results[1].formatted_address;
			                  } else {
			                    window.alert('No results found');
			                  }
			                } else {
			                  window.alert('Geocoder failed due to: ' + status);
			                }
			            });
			          }
			};
		}
		
		function getStores(vm){
			StoreResource.query(function(data){
				vm.stores = data;
			});
		}
		
		function getStore(id){
			return StoreResource.get({id:id});
		}
		
		function searchStore(geocoder, vm){
			 geocoder.geocode({'address': vm.search.pincode}, function(results, status) {
	            	if (status === 'OK') {
	            		//console.log(results);
	                  if(results[0]){
	                	  /*Fetch the address lat long based on pincode*/
	                	  var lat = results[0].geometry.location.lat();
	                	  var lng = results[0].geometry.location.lng();
	                	  StoreResource.search({lat : lat, lng : lng, radius : vm.search.value},function(results){
	                		  console.log(results);
	                		  vm.stores = results;
	                		  redrawAndCenter(vm, lat, lng);
	                	  });
	                	  
	                  }
	            	}
	            });
		}
		
		function redrawAndCenter(vm, lat, lng){
			vm.marker.coords.latitude = lat;
		   	vm.marker.coords.longitude= lng;
		   	vm.map.center = { latitude: lat, longitude: lng };
		}
		 
		
		function deleteStore(id){
			StoreResource.delete({id : id},function(response){
				$state.go("stores/list");
				if(response)
					Notification.success("Store deleted successfully!");
				else
					Notification.error("Something went wrong!");
			});
		}
		
		return {
			saveStore : saveStore,
			resetData : resetData,
			resetCircle : resetCircle,
			getStores : getStores,
			deleteStore : deleteStore,
			getStore : getStore,
			attachEvents : attachEvents,
			searchStore : searchStore,
			redrawAndCenter : redrawAndCenter
		}
	}
	app.service("StoreService",["StoreResource", "Notification", "Store", "ConfigService","$state", storeService]);
	
}())