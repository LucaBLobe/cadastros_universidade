package com.cadastro.universidade.notas;

import com.cadastro.universidade.aluno.Aluno;
import com.cadastro.universidade.bolitim.Boletim;
import com.cadastro.universidade.disciplina.Disciplina;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "notas")
public class Notas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nota", nullable = false)
    private Double nota;

    @ManyToMany(mappedBy = "notasId")
    private List<Aluno> alunoId;

    @ManyToMany(mappedBy = "notasId")
    private List<Disciplina> disciplinaId;

    @ManyToMany
    @JoinTable(name = "nota_boletim", joinColumns = {@JoinColumn(name = "boletim_id")}, inverseJoinColumns = {@JoinColumn(name="nota_id")})
    private List<Boletim> boletimId;

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

    public List<Aluno> getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(List<Aluno> alunoId) {
        this.alunoId = alunoId;
    }

    public List<Disciplina> getDisciplinaId() {
        return disciplinaId;
    }

    public void setDisciplinaId(List<Disciplina> disciplinaId) {
        this.disciplinaId = disciplinaId;
    }

    public List<Boletim> getBoletimId() {
        return boletimId;
    }

    public void setBoletimId(List<Boletim> boletimId) {
        this.boletimId = boletimId;
    }

    @Override
    public String toString() {
        return "Notas{" +
                "id=" + id +
                ", nota=" + nota +
                ", alunoId=" + alunoId +
                ", disciplinaId=" + disciplinaId +
                ", boletimId=" + boletimId +
                '}';
    }
}
