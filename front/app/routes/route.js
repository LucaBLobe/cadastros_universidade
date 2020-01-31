app.config(function($routeProvider){

    $routeProvider
    .when('/', {
        templateUrl : 'app/views/home.html',
        controller  : 'HomeCtrl',
    })

    .when('/gerencia', {
        templateUrl : 'app/views/gerencia.html',
        controller  : 'AboutCtrl',
    })

    .when('/secretaria', {
        templateUrl : 'app/views/secretaria.html',
        controller  : 'ContactCtrl',
    })

    .otherwise ({ redirectTo: '/' });
});