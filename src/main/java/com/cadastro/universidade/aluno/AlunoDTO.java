package com.cadastro.universidade.aluno;

import com.cadastro.universidade.bolitim.Boletim;
import com.cadastro.universidade.disciplina.Disciplina;
import com.cadastro.universidade.notas.Notas;
import com.cadastro.universidade.turma.Turma;

import java.util.List;

public class AlunoDTO {

    private Long id;
    private String nome;
    private Turma turmaId;
    private List<Disciplina> disciplinaId;
    private List<Notas> notaId;
    private List<Boletim> boletimId;

    public AlunoDTO() {
    }

    public AlunoDTO(Long id, String nome, Turma turmaId, List<Disciplina> disciplinaId, List<Notas> notaId, List<Boletim> boletimId) {
        this.id = id;
        this.nome = nome;
        this.turmaId = turmaId;
        this.disciplinaId = disciplinaId;
        this.notaId = notaId;
        this.boletimId = boletimId;
    }


    public static AlunoDTO of (Aluno aluno){
        return new AlunoDTO(
                aluno.getId(),
                aluno.getNome(),
                aluno.getTurmaId(),
                aluno.getDisciplinaId(),
                aluno.getNotaId(),
                aluno.getBoletimId()
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
        return "AlunoDTO{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", turmaId=" + turmaId +
                ", disciplinaId=" + disciplinaId +
                ", notaId=" + notaId +
                ", boletimId=" + boletimId +
                '}';
    }
}
