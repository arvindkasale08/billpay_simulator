(function(){
	"use strict";
	var app = angular.module("store-locator");
	function storesSearchController(StoreService, uiGmapIsReady, $stateParams){
		var vm = this;
		vm.id = $stateParams.id;
		vm.search = {
				pincode : "",
				lat : null,
				lng : null,
		        value: 15,
		        options: {
		            floor: 0,
		            ceil: 100,
		            step: 5
		        }
		};
		StoreService.resetData(vm, vm.id);
		StoreService.resetCircle(vm);
		
		uiGmapIsReady.promise(1).then(function(instances){
			console.log(instances);
			var geocoder = new google.maps.Geocoder();
			vm.searchStore = function(){
				StoreService.searchStore(geocoder, vm);
			};
		});
		
	}
	app.controller("StoresSearchController",storesSearchController);
}());