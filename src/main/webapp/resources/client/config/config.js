(function(){
	"use strict";
	var app = angular.module("store-locator");
	var configService = function(){
		var cfg = {};
		
		cfg.maps = {
			/*Default to NewYork*/
			defaultConfig : { center: { latitude: 40.710496, longitude: -74.006333 }, zoom: 15 }, /*Default to NewYork*/
			defaultMarker : {address : "9/11 Tribute Center, 120 Liberty Street New York, NY 10006, USA", id: "myLoc",coords: {latitude: 40.710496,longitude: -74.006333},options: {icon: "/store-locator/web-resources/static/images/shop_48.png", draggable: true, clickable : true, title : "Current Location" }}
		};
		
		return cfg;
	}
	app.factory("ConfigService",configService);	
	
}());