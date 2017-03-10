(function() {

  "use strict";

  var app = angular.module("store-locator");

  var registerController = function(CardService, $location, $window) {
    var vm = this;
    vm.card = {
      name : 'John Doe',
      number : '4111-1111-1111-1111',
      cvv : '312',
      expiry : '1/2018'
    };
    
    vm.card.token = $location.search().token;
    vm.card.url = decodeURIComponent($location.absUrl().split('url=')[1]);
    console.log(decodeURIComponent(vm.card.url));
    vm.saveCard = function() {
      CardService.saveCard(vm).then(function(response){
        console.log("Redirecting to url " + response.data.url);
        $window.location.href = response.data.url;
      })
    }
  }

  app.controller("RegisterController", registerController);

}());

