package com.cadastro.universidade.disciplina;

import com.cadastro.universidade.aluno.Aluno;
import com.cadastro.universidade.bolitim.Boletim;
import com.cadastro.universidade.notas.Notas;
import com.cadastro.universidade.professor.Professor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "disciplina")
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false,  length = 100)
    private String nome;

    @ManyToOne
    private Professor professorId;

    @ManyToMany(mappedBy = "disciplinaId")
    private List<Aluno> alunoId;

    @ManyToMany
    @JoinTable(name = "disciplina_nota", joinColumns = {@JoinColumn(name = "nota_id")}, inverseJoinColumns = {@JoinColumn(name="disciplina_id")})
    private List<Notas> notaId;

    @ManyToMany
    @JoinTable(name = "disciplina_boletim", joinColumns = {@JoinColumn(name = "boletim_id")}, inverseJoinColumns = {@JoinColumn(name="disciplina_id")})
    private List<Boletim> boletimId;

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
        return "Disciplina{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", professorId=" + professorId +
                ", alunoId=" + alunoId +
                ", notaId=" + notaId +
                ", boletimId=" + boletimId +
                '}';
    }
}
