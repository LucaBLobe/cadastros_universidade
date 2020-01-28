package com.cadastro.universidade.disciplina;

import com.cadastro.universidade.aluno.Aluno;
import com.cadastro.universidade.bolitim.Boletim;
import com.cadastro.universidade.notas.Notas;
import com.cadastro.universidade.professor.Professor;

import java.util.List;

public class DisciplinaDTO {

    private Long id;
    private String nome;
    private Professor professorId;
    private List<Aluno> alunoId;
    private List<Notas> notaId;
    private List<Boletim> boletimId;

    public DisciplinaDTO() {
    }

    public DisciplinaDTO(Long id, String nome, Professor professorId, List<Aluno> alunoId, List<Notas> notaId, List<Boletim> boletimId) {
        this.id = id;
        this.nome = nome;
        this.professorId = professorId;
        this.alunoId = alunoId;
        this.notaId = notaId;
        this.boletimId = boletimId;
    }

    public static DisciplinaDTO of(Disciplina disciplina) {
        return new DisciplinaDTO(
                disciplina.getId(),
                disciplina.getNome(),
                disciplina.getProfessorId(),
                disciplina.getAlunoId(),
                disciplina.getNotaId(),
                disciplina.getBoletimId()
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

    public List<Notas> getNotaId() {
        return notaId;
    }

    public void setNotaId(List<Notas> notaId) {
        this.notaId = notaId;
    }

    public List<Boletim> getBoletimId() {
        return boletimId;
    }

    public void setBoletimId(List<Boletim> boletimId) {
        this.boletimId = boletimId;
    }

    @Override
    public String toString() {
        return "DisciplinaDTO{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", professorId=" + professorId +
                ", alunoId=" + alunoId +
                ", notaId=" + notaId +
                ", boletimId=" + boletimId +
                '}';
    }
}
