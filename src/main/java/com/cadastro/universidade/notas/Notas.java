package com.cadastro.universidade.notas;

import com.cadastro.universidade.aluno.Aluno;
import com.cadastro.universidade.disciplina.Disciplina;

import javax.persistence.*;

@Entity
@Table(name = "notas")
public class Notas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nota", nullable = false)
    private Double nota;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "aluno_id", referencedColumnName = "id")
    private Aluno alunoId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "disciplina_id", referencedColumnName = "id")
    private Disciplina disciplinaId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public Aluno getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(Aluno alunoId) {
        this.alunoId = alunoId;
    }

    public Disciplina getDisciplinaId() {
        return disciplinaId;
    }

    public void setDisciplinaId(Disciplina disciplinaId) {
        this.disciplinaId = disciplinaId;
    }


    @Override
    public String toString() {
        return "Notas{" +
                "id=" + id +
                ", nota=" + nota +
                ", alunoId=" + alunoId +
                '}';
    }
}
