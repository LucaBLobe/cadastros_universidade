alter table notas add constraint fk_nota_aluno foreign key (aluno_id) references aluno (id);

alter table notas add constraint fk_nota_disciplina foreign key (disciplina_id) references disciplina (id);

