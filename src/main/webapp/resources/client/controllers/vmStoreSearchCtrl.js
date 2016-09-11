(function(){
	"use strict";
	var app = angular.module("store-locator");
	function storesSearchController(StoreService, uiGmapIsReady, $stateParams, $scope){
		var vm = this;
		vm.id = $stateParams.id;
		vm.search = {
				pincode : "10001",
				lat : null,
				lng : null,
		        value: 15,
		        options: {
		            floor: 0,
		            ceil: 100,
		            step: 5,
		        }
		};
		StoreService.resetData(vm, vm.id);
		StoreService.resetCircle(vm);
		var geocoder;
		uiGmapIsReady.promise(1).then(function(instances){
			geocoder = new google.maps.Geocoder();
			vm.searchStore = function(){
				StoreService.searchStore(geocoder, vm);
			};
			vm.searchStore();
		});
		
		vm.marker.events = {
		        dragend: function (marker, eventName, args) {
		            var lat = marker.getPosition().lat();
		            var lon = marker.getPosition().lng();
		            vm.marker.coords.latitude = lat;
		            vm.marker.coords.longitude = lon;
		            console.log(lat);
		            geocoder.geocode({'location': marker.getPosition()}, function(results, status) {
		            	if (status === 'OK') {
		                  if (results[1]) {
		                	  vm.search.pincode = results[1].formatted_address;
		                	  vm.searchStore();
		                  } else {
		                    window.alert('No results found');
		                  }
		                } else {
		                  window.alert('Geocoder failed due to: ' + status);
		                }
		            });
		            
		          }
		};
		
		$scope.$on("slideEnded", function() {
			vm.searchStore();
		});
		
	}
	app.controller("StoresSearchController",storesSearchController);
}());