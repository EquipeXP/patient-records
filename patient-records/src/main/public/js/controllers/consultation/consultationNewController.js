(function() {

    'use strict';

    function consultationNewCtrl($scope, $routeParams) {

        $scope.patient = {
            name: 'John Doe',
            genderAdm: 'Masculino',
            birthDate: '12/01/1995 12:33',
            maritalStatus: 'Casado',
            breed: 'Brasileiro',
            ethnicGroup: 'Brasileiro'
        };
    }

    angular.module('app.controllers').controller('ConsultationNewCtrl', consultationNewCtrl)
})();