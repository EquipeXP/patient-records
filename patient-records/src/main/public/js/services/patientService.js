(function() {
	
	'use strict';
	
	function patientService($http, BASE_API_ADDRESS) {
	
		return {

            getPatients: function () {

                return $http.get(BASE_API_ADDRESS + 'patient');
            },
            addPatient: function(patient) {

                return $http.post(BASE_API_ADDRESS + 'patient', patient);
            }
        }
	}
	
	angular.module('app.services').factory('PatientService', ['$http', 'BASE_API_ADDRESS', patientService]);
})();