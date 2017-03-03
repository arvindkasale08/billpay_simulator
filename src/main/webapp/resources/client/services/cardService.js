(function() {

  "use strict";
  var app = angular.module("store-locator");

  var cardService = function($http) {

    function saveCard(vm) {
      var url = "/store-locator/card";
      return $http.post(url, vm.card);
    }

    return {
      saveCard : saveCard
    }
  }

  app.service("CardService", ["$http", cardService]);

})();
