package com.cadastro.universidade.professor;

import com.cadastro.universidade.disciplina.Disciplina;
import com.cadastro.universidade.turma.Turma;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "professor")
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false,  length = 100)
    private String nome;

    @ManyToMany
    @JoinTable(name = "professor_turma", joinColumns = {@JoinColumn(name = "turma_id")}, inverseJoinColumns = {@JoinColumn(name="professor_id")})
    private List<Turma> turmaId;

    @OneToMany(mappedBy = "professorId")
    private List<Disciplina> disciplinas;

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

    public List<Turma> getTurmaId() {
        return turmaId;
    }

    public void setTurmaId(List<Turma> turmaId) {
        this.turmaId = turmaId;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", turmaId=" + turmaId +
                ", disciplinas=" + disciplinas +
                '}';
    }
}
