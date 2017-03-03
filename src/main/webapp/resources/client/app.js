(function(){

   "use strict";
   var app = angular.module("store-locator",["ui.router","ngResource","uiGmapgoogle-maps","ui-notification","datatables","rzModule"]);

   app.config(["$stateProvider","$urlRouterProvider",function($stateProvider, $urlRouterProvider){

     /* any other state */
     $urlRouterProvider.otherwise("/");

     $stateProvider.state("home",{
       url : "/",
       views:{
         "header" : {templateUrl : "web-resources/client/views/common/header.html"},
         "body" : {templateUrl : "web-resources/client/views/store/list.html", controller : "AjaxStoresController as vm"},
         "footer" : {templateUrl : "web-resources/client/views/common/footer.html"}
       }
     });

     $stateProvider.state("stores/new",{
       url : "/stores/new",
       views:{
         "header" : {templateUrl : "web-resources/client/views/common/header.html"},
         "body" : {templateUrl : "web-resources/client/views/store/new.html", controller : "StoresController as vm"},
         "footer" : {templateUrl : "web-resources/client/views/common/footer.html"}
       }
     });

     
     
     
     $stateProvider.state("stores/list",{
         url : "/stores/list",
         views:{
           "header" : {templateUrl : "web-resources/client/views/common/header.html"},
           "body" : {templateUrl : "web-resources/client/views/store/list.html", controller : "AjaxStoresController as vm"},
           "footer" : {templateUrl : "web-resources/client/views/common/footer.html"}
         }
       });
     
     $stateProvider.state("stores/search",{
         url : "/stores/search",
         views:{
           "header" : {templateUrl : "web-resources/client/views/common/header.html"},
           "body" : {templateUrl : "web-resources/client/views/store/search.html", controller : "StoresSearchController as vm"},
           "footer" : {templateUrl : "web-resources/client/views/common/footer.html"}
         }
       });
     
     $stateProvider.state("stores/show",{
         url : "/stores/:id",
         views:{
           "header" : {templateUrl : "web-resources/client/views/common/header.html"},
           "body" : {templateUrl : "web-resources/client/views/store/new.html", controller : "StoresController as vm"},
           "footer" : {templateUrl : "web-resources/client/views/common/footer.html"}
         }
       });
     
     $stateProvider.state("card/register",{
         url : "/bill-pay/register",
         views:{
           "header" : {templateUrl : "web-resources/client/views/common/header.html"},
           "body" : {templateUrl : "web-resources/client/views/card/register.html", controller : "RegisterController as vm"},
           "footer" : {templateUrl : "web-resources/client/views/common/footer.html"}
         }
       });
     


   }]);
   
   /*Configuration to access Google maps*/
   app.config(function(uiGmapGoogleMapApiProvider) {
	    uiGmapGoogleMapApiProvider.configure({
	        key: 'AIzaSyBNZ0gFe-dZ9uKweGbr5HDpSmcJAGKFeVs',
	        libraries: 'weather,geometry,visualization'
	    });
	});
   
   

 }());
