app.controller('HomeCtrl', function($scope, $http){
    $scope.title = 'Pagina inicial';


    $scope.getTurmaData = function (id, periodo, sigla, serie, disciplinaId) {
        var data = {
            id: id,
            periodo: periodo,
            sigla: sigla,
            serie: serie,
            disciplinaId: disciplinaId
        };

        $http.get('http://localhost:8080/turma', JSON.stringify(data)).then(function (response) {
            if (response.data)

                $scope.turmaList = response.data;

        }, function () {

            $scope.msg = "Erro ao buscar Turma";

        });

    };
    $scope.getAlunoData = function (turmaId) {
        var data = {
            turmaId: turmaId
        };

        $http.get('http://localhost:8080/alunos/' + turmaId, JSON.stringify(data)).then(function (response) {
            if (response.data) {
                $scope.alunoList ="";
                $scope.alunoList = response.data;
            }

        }, function () {

            $scope.msg = "Erro em buscar a Aluno";

        });

    };

    $scope.getDisciplinaData = function (turmaId) {
        var data = {
            turmaId: turmaId
        };

        $http.get('http://localhost:8080/disciplinas/turma/' + turmaId, JSON.stringify(data)).then(function (response) {
            if (response.data) {
                $scope.disciplinaList ="";
                $scope.disciplinaList = response.data;
            }

        }, function () {

            $scope.msg = "Erro em buscar a Disciplinas";

        });

    };

});

