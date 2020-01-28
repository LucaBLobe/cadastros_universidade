package com.cadastro.universidade.turma;


import com.cadastro.universidade.aluno.Aluno;
import com.cadastro.universidade.bolitim.Boletim;
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

    @ManyToMany(mappedBy = "turmaId" )
    private List<Professor> professorId;

    @OneToMany(mappedBy = "turmaId")
    private List<Aluno> alunoId;

    @OneToMany(mappedBy = "turmaId")
    private List<Boletim> boletimId;

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

    public List<Professor> getProfessorId() {
        return professorId;
    }

    public void setProfessorId(List<Professor> professorId) {
        this.professorId = professorId;
    }

    public List<Aluno> getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(List<Aluno> alunoId) {
        this.alunoId = alunoId;
    }

    public List<Boletim> getBoletimId() {
        return boletimId;
    }

    public void setBoletimId(List<Boletim> boletimId) {
        this.boletimId = boletimId;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "id=" + id +
                ", periodo='" + periodo + '\'' +
                ", serie='" + serie + '\'' +
                ", sigla='" + sigla + '\'' +
                ", professorId=" + professorId +
                ", alunoId=" + alunoId +
                ", boletimId=" + boletimId +
                '}';
    }
}
