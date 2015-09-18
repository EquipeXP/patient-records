(function() {
	
	'use strict';
	
	function patientService($http, BASE_API_ADDRESS) {
	
		return {

            getPatients: function (){

                return $http.get(BASE_API_ADDRESS + 'patient');
            }
        }
	}
	
	angular.module('app.services').factory('PatientService', ['$http', 'BASE_API_ADDRESS', patientService]);
})();