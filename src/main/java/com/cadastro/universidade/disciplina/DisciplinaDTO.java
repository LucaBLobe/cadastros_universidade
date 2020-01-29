package com.cadastro.universidade.disciplina;

import com.cadastro.universidade.aluno.Aluno;
import com.cadastro.universidade.notas.Notas;
import com.cadastro.universidade.professor.Professor;
import com.cadastro.universidade.turma.Turma;

import java.util.List;

public class DisciplinaDTO {

    private Long id;
    private String nome;
    private Professor professorId;
    private List<Aluno> alunoId;
    private List<Turma> turmaId;

    public DisciplinaDTO() {
    }

    public DisciplinaDTO(Long id, String nome, Professor professorId, List<Aluno> alunoId, List<Turma> turmaId) {
        this.id = id;
        this.nome = nome;
        this.professorId = professorId;
        this.alunoId = alunoId;
        this.turmaId = turmaId;
    }

    public static DisciplinaDTO of(Disciplina disciplina) {
        return new DisciplinaDTO(
                disciplina.getId(),
                disciplina.getNome(),
                disciplina.getProfessorId(),
                disciplina.getAlunoId(),
                disciplina.getTurmaId()

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

    public Professor getProfessorId() {
        return professorId;
    }

    public void setProfessorId(Professor professorId) {
        this.professorId = professorId;
    }

    public List<Aluno> getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(List<Aluno> alunoId) {
        this.alunoId = alunoId;
    }

    public List<Turma> getTurmaId() {
        return turmaId;
    }

    public void setTurmaId(List<Turma> turmaId) {
        this.turmaId = turmaId;
    }

    @Override
    public String toString() {
        return "DisciplinaDTO{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", professorId=" + professorId +
                ", alunoId=" + alunoId +
                ", turmaId=" + turmaId +
                '}';
    }
}
