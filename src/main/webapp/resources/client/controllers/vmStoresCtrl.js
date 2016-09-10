(function(){
	"use strict";
	var app = angular.module("store-locator");
	
	var storesController = function(uiGmapGoogleMapApi, uiGmapMarker, StoreService){
		console.log("In stores controller");
		var vm = this;
		StoreService.resetData(vm);
		var geocoder = null;
		/*Add events to marker*/
		vm.marker.events = {
		        dragend: function (marker, eventName, args) {
		            var lat = marker.getPosition().lat();
		            var lon = marker.getPosition().lng();
		            vm.store.coordinates = lat+","+lon;
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
		
		//uiGmapGoogleMapApi promise when resolved we need to add vm.map data
		uiGmapGoogleMapApi.then(function(maps){
			geocoder = new google.maps.Geocoder();
			
		});
		
		vm.saveStore = function(){
			StoreService.saveStore(vm);
		}
	};
	
	app.controller("StoresController", storesController);
}());