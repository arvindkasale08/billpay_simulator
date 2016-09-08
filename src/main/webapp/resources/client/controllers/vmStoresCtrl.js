(function(){
	"use strict";
	var app = angular.module("store-locator");
	
	var storesController = function(uiGmapGoogleMapApi, uiGmapMarker, ConfigService){
		var vm = this;
		vm.map = ConfigService.maps.defaultConfig;
		vm.marker = ConfigService.maps.defaultMarker;
		
		//uiGmapGoogleMapApi promise when resolved we need to add vm.map data
		uiGmapGoogleMapApi.then(function(maps){
			console.log(maps);
		})
	};
	
	app.controller("StoresController", storesController);
}());