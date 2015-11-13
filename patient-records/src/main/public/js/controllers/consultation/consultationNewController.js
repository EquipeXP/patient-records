(function() {

    'use strict';

    function consultationNewCtrl($scope, $routeParams, PatientService, AlertService) {

        $scope.patient = {
            name: undefined,
            genderAdm: undefined,
            birthDate: undefined,
            maritalStatus: undefined,
            breed: undefined,
            ethnicGroup: undefined
        };

        $scope.gendersAdm = {
            'F': 'Feminino',
            'M': 'Masculino',
            'UN': 'Indiferenciado'
        };

        function load() {
            PatientService.getById($routeParams.idPatient)
                .then(function(patient) {

                    $scope.patient = angular.copy(patient.data);
                    $scope.patient.birthDate = new Date(patient.data.birthDate);
                }, function(err) {

                    AlertService.addError('Paciente não encontrado.');
                });
        }

        load();
    }

    angular.module('app.controllers').controller('ConsultationNewCtrl', consultationNewCtrl)
})();