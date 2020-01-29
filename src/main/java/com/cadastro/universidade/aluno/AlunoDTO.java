package com.cadastro.universidade.aluno;

import com.cadastro.universidade.disciplina.Disciplina;
import com.cadastro.universidade.turma.Turma;

import java.util.List;

public class AlunoDTO {

    private Long id;
    private String nome;
    private Turma turmaId;
    private List<Disciplina> disciplinaId;


    public AlunoDTO() {
    }

    public AlunoDTO(Long id, String nome, Turma turmaId, List<Disciplina> disciplinaId) {
        this.id = id;
        this.nome = nome;
        this.turmaId = turmaId;
        this.disciplinaId = disciplinaId;
    }

    public static AlunoDTO of (Aluno aluno){
        return new AlunoDTO(
                aluno.getId(),
                aluno.getNome(),
                aluno.getTurmaId(),
                aluno.getDisciplinaId()
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

    public Turma getTurmaId() {
        return turmaId;
    }

    public void setTurmaId(Turma turmaId) {
        this.turmaId = turmaId;
    }

    public List<Disciplina> getDisciplinaId() {
        return disciplinaId;
    }

    public void setDisciplinaId(List<Disciplina> disciplinaId) {
        this.disciplinaId = disciplinaId;
    }

    @Override
    public String toString() {
        return "AlunoDTO{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", turmaId=" + turmaId +
                ", disciplinaId=" + disciplinaId +
                '}';
    }
}
