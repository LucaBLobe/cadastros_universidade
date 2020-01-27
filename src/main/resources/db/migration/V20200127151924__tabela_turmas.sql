 CREATE TABLE turma(
    id              BIGINT IDENTITY(1, 1) NOT NULL,
    periodo          VARCHAR(100)         NOT NULL,
    serie            VARCHAR(50)          NOT NULL,
    sigla            VARCHAR(100)         NOT NULL,

    CONSTRAINT pk_id_turma             PRIMARY KEY  (id),
);

