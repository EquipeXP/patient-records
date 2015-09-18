(function() {
	
	'use strict';
	
	function mainController($scope, PatientService) {
		
		$scope.patients = [];
		
		PatientService.getPatients()
			.then(function(patients) {
				
				$scope.patients = patients.data;
			}, 
			function(err) {
				
				console.log(err);
			});
	}
	
	angular.module('app.controllers').controller('MainController', mainController);
})();