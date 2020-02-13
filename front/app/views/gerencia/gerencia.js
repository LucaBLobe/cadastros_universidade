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


    $scope.postTurma = function (periodo, sigla, serie, disciplinaId) {

        var disciplinas = [];

        for (let i = 0; i < disciplinaId.length; i++) {
            const element = disciplinaId[i];

            disciplinas.push(JSON.parse(element));
            
        }
        console.log(disciplinaId);

        var data = {
            periodo: periodo,
            sigla: sigla,
            serie: serie,
            disciplinaId: disciplinas
        };

        $http.post('http://localhost:8080/turma/save', (data)).then(function (response) {
            if (response.data)


                $scope.msg = "Turma cadastrada";


        }, function (response) {
            console.log(response.data)
            $scope.msg = "Erro em Cadastrar Turma";

        });

    };

    $scope.getDisciplinaData = function (id, nome) {
        var data = {
            id: id,
            nome: nome,
        };

        $http.get('http://localhost:8080/disciplinas', JSON.stringify(data)).then(function (response) {
            if (response.data)

                $scope.disciplinaList = response.data;

        }, function () {

            $scope.msg = "Erro ao buscar disciplina";

        });

    };

    
    $scope.getDisciplinaTurmaData = function (turmaId) {
        var data = {
            turmaId: turmaId
        };

        $http.get('http://localhost:8080/disciplinas/turma/' + turmaId, JSON.stringify(data)).then(function (response) {
            if (response.data) {
                $scope.disciplinaTurmaList ="";
                $scope.disciplinaTurmaList = response.data;
            }

        }, function () {

            $scope.msg = "Erro em buscar a Disciplinas";

        });

    };

    $scope.getTurmaData = function (id, periodo, sigla, serie, disciplinaId) {
        var data = {
            id,
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
                $scope.alunoList = "";
                $scope.alunoList = response.data;
            }

        }, function () {

            $scope.msg = "Erro em buscar a Aluno";

        });

    };

    $scope.getAluno2Data = function (turmaId) {
        var data = {
            turmaId: turmaId
        };

        $http.get('http://localhost:8080/alunos/' + turmaId, JSON.stringify(data)).then(function (response) {
            if (response.data) {
                $scope.aluno2List = "";
                $scope.aluno2List = response.data;
            }

        }, function () {

            $scope.msg = "Erro em buscar a Aluno";

        });

    };

    $scope.postNota = function (nota, alunoId, disciplinaId) {

        var data = {
            nota: nota,
            alunoId: alunoId,
            disciplinaId: disciplinaId
        };

        $http.post('http://localhost:8080/notas/save', JSON.stringify(data)).then(function (response) {
            if (response.data)

                $scope.msg = "nota cadastrada";


        }, function () {

            $scope.msg = "Erro em Cadastrar Nota";

        });
    };

    $scope.updateBoletim = function (alunoId) {

        var data = {
            alunoId: alunoId,
        };

        $http.post('http://localhost:8080/boletins/save', JSON.stringify(data)).then(function (response) {
            if (response.data)

                $scope.msg = "Boletim atualizado";


        }, function () {

            $scope.msg = "Erro ao atualizar";

        });
    };

});