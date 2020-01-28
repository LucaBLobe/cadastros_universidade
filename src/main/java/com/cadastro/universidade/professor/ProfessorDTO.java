package com.cadastro.universidade.professor;

import com.cadastro.universidade.aluno.Aluno;
import com.cadastro.universidade.disciplina.Disciplina;
import com.cadastro.universidade.notas.Notas;
import com.cadastro.universidade.turma.Turma;

import java.util.List;

public class ProfessorDTO {

    private Long id;
    private String nome;
    private List<Turma> turmaId;
    private List<Disciplina> disciplinas;

    public ProfessorDTO() {
    }

    public ProfessorDTO(Long id, String nome, List<Turma> turmaId, List<Disciplina> disciplinas) {
        this.id = id;
        this.nome = nome;
        this.turmaId = turmaId;
        this.disciplinas = disciplinas;
    }

    public static ProfessorDTO of (Professor professor){
        return new ProfessorDTO(
                professor.getId(),
                professor.getNome(),
                professor.getTurmaId(),
                professor.getDisciplinas()
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

    public List<Turma> getTurmaId() {
        return turmaId;
    }

    public void setTurmaId(List<Turma> turmaId) {
        this.turmaId = turmaId;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return "ProfessorDTO{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", turmaId=" + turmaId +
                ", disciplinas=" + disciplinas +
                '}';
    }
}
