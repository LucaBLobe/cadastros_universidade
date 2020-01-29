alter table disciplina_turma add constraint fk_aluno foreign key (turma_id) references turma (id);

alter table disciplina_turma add constraint fk_disciplina foreign key (disciplina_id) references disciplina (id);