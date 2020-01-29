
 drop table turma;

 CREATE TABLE professor(
    id              BIGINT IDENTITY(1, 1) NOT NULL PRIMARY KEY,
    nome          VARCHAR(100)         NOT NULL,

);

 CREATE TABLE disciplina(
    id              BIGINT IDENTITY(1, 1) NOT NULL PRIMARY KEY,
    nome          VARCHAR(100)         NOT NULL,


);

 CREATE TABLE aluno(
    id              BIGINT IDENTITY(1, 1) NOT NULL PRIMARY KEY,
    nome          VARCHAR(100)         NOT NULL,
    turma_id BIGINT NOT NULL,

);

 CREATE TABLE notas(
    id              BIGINT IDENTITY(1, 1) NOT NULL PRIMARY KEY,
    nota          DECIMAL(10,2)         ,
    aluno_id BIGINT      NOT NULL,
    disciplina_id BIGINT NOT NULL,

);

 CREATE TABLE turma(
  id              BIGINT IDENTITY(1, 1) NOT NULL,
    periodo          VARCHAR(100)         NOT NULL,
    serie            VARCHAR(50)          NOT NULL,
    sigla            VARCHAR(100)         NOT NULL,

    CONSTRAINT pk_id_turma             PRIMARY KEY  (id),
);

 CREATE TABLE disciplina_turma(
    disciplina_id         BIGINT,
    turma_id              BIGINT,
);

 CREATE TABLE aluno_disciplina(
    disciplina_id         BIGINT,
    aluno_id              BIGINT,
);

CREATE TABLE professor_turma(
    professor_id         BIGINT,
    turma_id              BIGINT,
);



