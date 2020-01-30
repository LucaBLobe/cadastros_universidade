package com.cadastro.universidade.turma;


import com.cadastro.universidade.aluno.Aluno;
import com.cadastro.universidade.disciplina.Disciplina;
import com.cadastro.universidade.professor.Professor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "turma")
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "periodo", nullable = false,  length = 100)
    private String periodo;

    @Column(name = "serie", nullable = false,  length = 50)
    private String serie;

    @Column(name = "sigla", nullable = false,  length = 100)
    private String sigla;

    @ManyToMany
    @JoinTable(name = "disciplina_turma", joinColumns = {@JoinColumn(name = "turma_id")}, inverseJoinColumns = {@JoinColumn(name="disciplina_id")})
    private List<Disciplina> disciplinaId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public List<Disciplina> getDisciplinaId() {
        return disciplinaId;
    }

    public void setDisciplinaId(List<Disciplina> disciplinaId) {
        this.disciplinaId = disciplinaId;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "id=" + id +
                ", periodo='" + periodo + '\'' +
                ", serie='" + serie + '\'' +
                ", sigla='" + sigla + '\'' +
                ", disciplinaId=" + disciplinaId +
                '}';
    }
}
