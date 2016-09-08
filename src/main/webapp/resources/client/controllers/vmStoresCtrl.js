(function(){
	"use strict";
	var app = angular.module("store-locator");
	
	var storesController = function(uiGmapGoogleMapApi, uiGmapMarker, ConfigService){
		var vm = this;
		vm.map = ConfigService.maps.defaultConfig;
		vm.marker = ConfigService.maps.defaultMarker;
		vm.address = ConfigService.maps.defaultMarker.address;
		vm.lat_lon = ConfigService.maps.defaultMarker.coords.latitude+","+ConfigService.maps.defaultMarker.coords.longitude;
		var geocoder = null;
		/*Add events to marker*/
		vm.marker.events = {
		        dragend: function (marker, eventName, args) {
		            var lat = marker.getPosition().lat();
		            var lon = marker.getPosition().lng();
		            vm.lat_lon = lat+","+lon;
		            geocoder.geocode({'location': marker.getPosition()}, function(results, status) {
		            	if (status === 'OK') {
		                  if (results[1]) {
		                    vm.address = results[0].formatted_address;
		                  } else {
		                    window.alert('No results found');
		                  }
		                } else {
		                  window.alert('Geocoder failed due to: ' + status);
		                }
		            });
		          }
		};
		
		/* Update marker 
		vm.marker.options.labelContent = "lat: " + vm.marker.coords.latitude + ' ' + 'lon: ' + vm.marker.coords.longitude;
		vm.marker.options.labelAnchor = "100 0";
		vm.marker.options.labelClass = "marker-labels";
		*/
		console.log(vm.marker);
		
		//uiGmapGoogleMapApi promise when resolved we need to add vm.map data
		uiGmapGoogleMapApi.then(function(maps){
			geocoder = new google.maps.Geocoder();
			console.log(geocoder);
		})
	};
	
	app.controller("StoresController", storesController);
}());