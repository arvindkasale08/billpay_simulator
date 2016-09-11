(function(){
	"use strict";
	var app = angular.module("store-locator");
	
	var ajaxStoresController = function(DTOptionsBuilder, DTColumnBuilder, StoreService){
		var vm = this;
		
		vm.dtOptions = DTOptionsBuilder.fromSource(StoreService.getStores(vm))
		.withOption('order', [0,'desc'])
        .withPaginationType('full_numbers');
		
		vm.deleteStore = function(id){
			if (confirm("Are you sure?")) {
				StoreService.deleteStore(id);
			}
		}
	   
	}
	
	
	
	app.controller("AjaxStoresController",ajaxStoresController);
}());