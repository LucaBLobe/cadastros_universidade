alter table aluno_disciplina add constraint fk_aluno_disciplina foreign key (aluno_id) references aluno (id);

alter table aluno_disciplina add constraint fk_disciplina_aluno foreign key (disciplina_id) references disciplina (id);