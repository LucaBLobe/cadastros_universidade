app.config(function($routeProvider){

    $routeProvider
    .when('/home', {
        templateUrl : 'app/views/home/home.html',
        controller  : 'HomeCtrl',
    })

    .when('/gerencia', {
        templateUrl : 'app/views/gerencia/gerencia.html',
        controller  : 'AboutCtrl',
    })

    .when('/secretaria', {
        templateUrl : 'app/views/secretaria/secretaria.html',
        controller  : 'ContactCtrl',
    })

    .otherwise ({ redirectTo: '/' });
});