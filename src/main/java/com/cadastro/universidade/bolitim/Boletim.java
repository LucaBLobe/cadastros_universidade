package com.cadastro.universidade.bolitim;


import com.cadastro.universidade.aluno.Aluno;
import com.cadastro.universidade.disciplina.Disciplina;
import com.cadastro.universidade.notas.Notas;
import com.cadastro.universidade.turma.Turma;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "boletim")
public class Boletim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Turma turmaId;

    @ManyToOne
    private Aluno alunoId;

    @ManyToMany(mappedBy = "boletimId")
    private List<Disciplina> disciplinaId;

    @ManyToMany(mappedBy = "boletimId")
    private List<Notas> notaId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Turma getTurmaId() {
        return turmaId;
    }

    public void setTurmaId(Turma turmaId) {
        this.turmaId = turmaId;
    }

    public Aluno getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(Aluno alunoId) {
        this.alunoId = alunoId;
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

    @Override
    public String toString() {
        return "Boletim{" +
                "id=" + id +
                ", turmaId=" + turmaId +
                ", alunoId=" + alunoId +
                ", disciplinaId=" + disciplinaId +
                ", notaId=" + notaId +
                '}';
    }
}
