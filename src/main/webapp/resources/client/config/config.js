(function(){
	"use strict";
	var app = angular.module("store-locator");
	var configService = function(){
		var cfg = {};
		
		cfg.maps = {
			/*Default to NewYork*/
			defaultConfig : { center: { latitude: 40.710496, longitude: -74.006333 }, zoom: 15 }, /*Default to NewYork*/
			defaultMarker : {iconImage : "", id: "myLoc",coords: {latitude: 40.710496,longitude: -74.006333},options: {icon: "/store-locator/web-resources/static/images/icon_store.jpg", draggable: true, clickable : true }}
		};
		
		return cfg;
	}
	app.factory("ConfigService",configService);	
	
}());