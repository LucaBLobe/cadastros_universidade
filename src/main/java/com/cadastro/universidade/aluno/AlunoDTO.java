package com.cadastro.universidade.aluno;

import javax.validation.constraints.NotNull;

public class AlunoDTO {


    private Long id;
    @NotNull
    private String nome;
    @NotNull
    private Long turmaId;


    public AlunoDTO() {
    }

    public AlunoDTO(Long id, String nome, Long turmaId) {
        this.id = id;
        this.nome = nome;
        this.turmaId = turmaId;
    }

    public static AlunoDTO of(Aluno aluno) {
        return new AlunoDTO(
                aluno.getId(),
                aluno.getNome(),
                aluno.getTurmaId().getId()
        );
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getTurmaId() {
        return turmaId;
    }

    public void setTurmaId(Long turmaId) {
        this.turmaId = turmaId;
    }
}
