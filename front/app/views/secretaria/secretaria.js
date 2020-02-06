app.controller('SecretariaCtrl', function($scope, $http){

    $scope.getAlunoData = function (id, nome, turmaId) {
        var data = {
            id: id,
            nome: nome,
            turmaId: turmaId
        };
 
        $http.get('http://localhost:8080/alunos', JSON.stringify(data)).then(function (response) {
            if (response.data)
 
                $scope.alunoList = response.data;
 
        }, function () {
 
            $scope.msg = "Erro em buscar a Aluno";
 
        });
       
        $http.post('http://localhost:8080/alunos', JSON.stringify(data)).then(function (response) {
            if (response.data)
 
                $scope.alunoSave = response.data;
 
        }, function () {
 
            $scope.msg = "Erro em buscar a Aluno";
 
        });
 
    };
    
    $scope.getBoletimPDFData = function (alunoId) {
        var data = {
            alunoId: aluno
        };
 
        $http.get('http://localhost:8080/boletins/export/pdf/', JSON.stringify(data)).then(function (response) {
            if (response.data)
 
                $scope.BoletimPDF = response.data;
 
        }, function () {
 
            $scope.msg = "Erro em buscar a Boletim";
 
        });
    };
});