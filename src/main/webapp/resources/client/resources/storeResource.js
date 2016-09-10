(function(){
	"use strict";
	var app = angular.module("store-locator");
	
	function storeResource($resource){
		return $resource("/store-locator/api/stores/:id",{},{});
	}
	
	app.factory("StoreResource",["$resource",storeResource]);
	
	
}());