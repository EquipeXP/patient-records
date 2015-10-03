(function() {
	
	'use strict';
	
	function routesConfig($routeProvider) {

        $routeProvider
            .when('/', {
                templateUrl: '/templates/views/main.html',
                controller: 'MainController',
            })
            .when('/patient/new', {
                templateUrl: '/templates/views/patient/patientNew.html',
                controller: 'PatientCtrl',
            })
            .otherwise({
                redirectTo: '/'
            });
    }
	
    angular.module('app').config(['$routeProvider', routesConfig]);
})();