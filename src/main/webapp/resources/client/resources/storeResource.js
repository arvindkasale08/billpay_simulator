(function(){
	"use strict";
	var app = angular.module("store-locator");
	
	function storeResource($resource){
		return $resource("/store-locator/api/stores/:id",{},{
			  search : {
			        method: "GET",
			        url : "/store-locator/api/stores/search",
			        isArray : true
			   }
		});
	}
	
	app.factory("StoreResource",["$resource",storeResource]);
	
	
}());