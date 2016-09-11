(function(){
	"use strict";
	var app = angular.module("store-locator");
	
	var storesController = function(uiGmapIsReady, uiGmapMarker, StoreService, $stateParams){
		console.log("In stores controller");
		console.log($stateParams);
		var vm = this;
		vm.id = $stateParams.id;
		StoreService.resetData(vm, vm.id);
		/*Add events to marker*/
		
		
		//uiGmapGoogleMapApi promise when resolved we need to add vm.map data
		uiGmapIsReady.promise(1).then(function(instances){
			vm.refresh = false;
			console.log(instances);
			var geocoder = new google.maps.Geocoder();
			vm.marker.events = {
			        dragend: function (marker, eventName, args) {
			            var lat = marker.getPosition().lat();
			            var lon = marker.getPosition().lng();
			            vm.store.latitude = lat;
			            vm.store.longitude = lon;
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
			
		});
		
		vm.saveStore = function(){
			StoreService.saveStore(vm);
		}
	};
	
	app.controller("StoresController", storesController);
}());