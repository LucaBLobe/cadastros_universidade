app.controller('GerenciaCtrl', function ($scope, $http) {
    $scope.title = 'Controle de turmas e cadastro de corpo docente.';

    $scope.postProfessor = function (nome) {
        var data = {
            nome: nome,
        };

        $http.post('http://localhost:8080/professores/save', JSON.stringify(data)).then(function (response) {
            if (response.data)

                $scope.msg = "Professor cadastrado";

        }, function () {

            $scope.msg = "Erro ao Cadastrar Professor";

        });

    };

    $scope.getProfessorData = function (id, nome) {
        var data = {
            id: id,
            nome: nome,
        };
 
        $http.get('http://localhost:8080/professores', JSON.stringify(data)).then(function (response) {
            if (response.data)
 
                $scope.professorList = response.data;
 
        }, function () {
 
            $scope.msg = "Erro ao cadastrar Professor";
 
        });

    };

    $scope.postDisciplina = function (nome, professorId) {
        var data = {
            nome: nome,
            professorId: professorId
        };

        $http.post('http://localhost:8080/disciplinas/save', JSON.stringify(data)).then(function (response) {
            if (response.data)

                $scope.msg = "Disciplina cadastrada";

        }, function () {

            $scope.msg = "Erro ao Cadastrar Disciplina";

        });

    };

    $scope.getProfessorData = function (id, nome) {
        var data = {
            id: id,
            nome: nome,
        };
 
        $http.get('http://localhost:8080/professores', JSON.stringify(data)).then(function (response) {
            if (response.data)
 
                $scope.professorList = response.data;
 
        }, function () {
 
            $scope.msg = "Erro ao cadastrar Professor";
 
        });
    };
 
});