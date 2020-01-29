alter table professor_turma add constraint fk_professor_turma foreign key (professor_id) references professor (id);

alter table professor_turma add constraint fk_turma_professor foreign key (turma_id) references turma (id);