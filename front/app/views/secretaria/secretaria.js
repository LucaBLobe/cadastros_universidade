app.controller('SecretariaCtrl', function($scope, $http){
    $scope.title = 'Controle e cadastros de alunos.';

    var urlApiBoletim = 'http://localhost:8080/boletins/export/pdf/';

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
       
    };

    $scope.postAluno = function (nome, turmaId) {
        var data = {
            nome: nome,
            turmaId: turmaId
        };
 
        $http.post('http://localhost:8080/alunos/save', JSON.stringify(data)).then(function (response) {
            if (response.data)
 
            $scope.msg = "Aluno cadastrado";
 
        }, function () {
 
            $scope.msg = "Erro em buscar a Aluno";
 
        });
       
    };


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
 
            $scope.msg = "Erro ao cadastrar Aluno";
 
        });

    };
    $scope.getBoletimPDFData = function (alunoId) {
        var data = {
            alunoId: alunoId
        };
        
 
        $http.get('http://localhost:8080/boletins/export/pdf/'+alunoId, JSON.stringify(data)).then(function (response) {
            if (response.data)
                 
                $scope.BoletimPDF = response.data;
                $scope.msg = "Boltim gerado";
 
        }, function () {
 
            $scope.msg = "Erro em buscar a Boletim";
 
        });
    };

    $scope.getBoletimHTMLData = function (alunoId) {
        var data = {
            alunoId: alunoId
        };

        $http.get('http://localhost:8080/boletins/export/html/'+ alunoId, JSON.stringify(data)).then(function (response) {
            if (response.data)
                 
                $scope.BoletimPDF = response.data;
                $scope.msg = "Boltim gerado";
 
        }, function () {
 
            $scope.msg = "Erro em buscar a Boletim";
 
        });
    };

    

});

