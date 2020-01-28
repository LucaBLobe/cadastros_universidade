package com.cadastro.universidade.aluno;

import com.cadastro.universidade.bolitim.Boletim;
import com.cadastro.universidade.disciplina.Disciplina;
import com.cadastro.universidade.notas.Notas;
import com.cadastro.universidade.turma.Turma;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "aluno")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false,  length = 100)
    private String nome;

    @ManyToOne
    private Turma turmaId;

    @ManyToMany
    @JoinTable(name = "aluno_disciplina", joinColumns = {@JoinColumn(name = "disciplina_id")}, inverseJoinColumns = {@JoinColumn(name="aluno_id")})
    private List<Disciplina> disciplinaId;

    @ManyToMany
    @JoinTable(name = "aluno_nota", joinColumns = {@JoinColumn(name = "nota_id")}, inverseJoinColumns = {@JoinColumn(name="aluno_id")})
    private List<Notas> notaId;

    @OneToMany(mappedBy = "alunoId")
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
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", turmaId=" + turmaId +
                ", disciplinaId=" + disciplinaId +
                ", notaId=" + notaId +
                ", boletimId=" + boletimId +
                '}';
    }
}
