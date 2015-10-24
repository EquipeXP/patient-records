(function() {

    'use strict';

    function consultationNewCtrl($scope, $routeParams) {

        console.log($routeParams.idPatient);
    }

    angular.module('app.controllers').controller('ConsultationNewCtrl', consultationNewCtrl)
})();