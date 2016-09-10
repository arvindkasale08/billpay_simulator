(function(){
	"use strict";
	
	var app = angular.module("store-locator");
	var store = function(ConfigService){
		function createInstance(){
			var str = new Object();
			str.id = "";
			str.name = "";
			str.owner = "";
			str.type = "";
			str.address = ConfigService.newInstance().maps.defaultMarker.address;
			str.coordinates = ConfigService.newInstance().maps.defaultMarker.coords.latitude+","+ConfigService.newInstance().maps.defaultMarker.coords.longitude;
			return str;
		}
		return {
			createInstance : createInstance
		}
	};
	app.factory("Store",store);	
}());