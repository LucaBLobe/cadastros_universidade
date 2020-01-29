package com.cadastro.universidade.disciplina;

import com.cadastro.universidade.aluno.Aluno;
import com.cadastro.universidade.professor.Professor;
import com.cadastro.universidade.turma.Turma;

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

    @ManyToMany(mappedBy = "disciplinaId")
    private List<Turma> turmaId;

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

    public List<Turma> getTurmaId() {
        return turmaId;
    }

    public void setTurmaId(List<Turma> turmaId) {
        this.turmaId = turmaId;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", professorId=" + professorId +
                ", alunoId=" + alunoId +
                ", turmaId=" + turmaId +
                '}';
    }
}
