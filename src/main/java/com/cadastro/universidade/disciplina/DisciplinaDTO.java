package com.cadastro.universidade.disciplina;

import com.cadastro.universidade.aluno.Aluno;
import com.cadastro.universidade.notas.Notas;
import com.cadastro.universidade.professor.Professor;
import com.cadastro.universidade.turma.Turma;

import javax.validation.constraints.NotNull;
import java.util.List;

public class DisciplinaDTO {


    private Long id;
    @NotNull
    private String nome;
    @NotNull
    private Long professorId;


    public DisciplinaDTO() {
    }

    public DisciplinaDTO(Long id, String nome, Long professorId) {
        this.id = id;
        this.nome = nome;
        this.professorId = professorId;
    }

    public static DisciplinaDTO of(Disciplina disciplina) {
        return new DisciplinaDTO(
                disciplina.getId(),
                disciplina.getNome(),
                disciplina.getProfessorId().getId()

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

    public Long getProfessorId() {
        return professorId;
    }

    public void setProfessorId(Long professorId) {
        this.professorId = professorId;
    }



    @Override
    public String toString() {
        return "DisciplinaDTO{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", professorId=" + professorId +
                '}';
    }
}
