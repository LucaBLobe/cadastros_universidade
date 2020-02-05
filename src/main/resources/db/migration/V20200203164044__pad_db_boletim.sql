
 CREATE TABLE boletim(
    id              BIGINT IDENTITY(1, 1) NOT NULL PRIMARY KEY,
    aluno_id            BIGINT               NOT NULL,
    aluno_nome          VARCHAR(100)         NOT NULL,
    turma_sigla         VARCHAR(50)          NOT NULL,
    aluno_serie         VARCHAR(100)         NOT NULL,
    disciplina          VARCHAR(100)         NOT NULL,
    notas               VARCHAR(100)         NOT NULL,

);

