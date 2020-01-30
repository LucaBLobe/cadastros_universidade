alter table disciplina add professor_id BIGINT;
alter table disciplina add constraint fk_disciplina_professor foreign key (professor_id) references professor (id);