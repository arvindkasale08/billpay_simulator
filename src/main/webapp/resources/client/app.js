(function(){

   "use strict";
   var app = angular.module("store-locator",["ui.router","ngResource","uiGmapgoogle-maps","ui-notification"]);

   app.config(["$stateProvider","$urlRouterProvider",function($stateProvider, $urlRouterProvider){

     /* any other state */
     $urlRouterProvider.otherwise("/");

     $stateProvider.state("home",{
       url : "/",
       views:{
         "header" : {templateUrl : "web-resources/client/views/common/header.html"},
         "body" : {templateUrl : "web-resources/client/views/store/list.html", controller : "StoresController as vm"},
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
           "body" : {templateUrl : "web-resources/client/views/store/list.html", controller : "StoresController as vm"},
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
	})

 }());
