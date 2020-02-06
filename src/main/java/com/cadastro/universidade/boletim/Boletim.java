package com.cadastro.universidade.boletim;


import javax.persistence.*;

@Entity
@Table(name = "boletim")
public class Boletim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "aluno_id", nullable = false)
    private Long alunoId;

    @Column(name = "aluno_nome", nullable = false,  length = 100)
    private String alunoNome;

    @Column(name = "turma_sigla", nullable = false,  length = 50)
    private String turmaSigla;

    @Column(name = "aluno_serie", nullable = false,  length = 100)
    private String turmaSerie;

    @Column(name = "disciplina", nullable = false)
    private String disciplinas;

    @Column(name = "notas", nullable = false)
    private String notas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(Long alunoId) {
        this.alunoId = alunoId;
    }

    public String getAlunoNome() {
        return alunoNome;
    }

    public void setAlunoNome(String alunoNome) {
        this.alunoNome = alunoNome;
    }

    public String getTurmaSigla() {
        return turmaSigla;
    }

    public void setTurmaSigla(String turmaSigla) {
        this.turmaSigla = turmaSigla;
    }

    public String getTurmaSerie() {
        return turmaSerie;
    }

    public void setTurmaSerie(String turmaSerie) {
        this.turmaSerie = turmaSerie;
    }

    public String getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String disciplinas) {
        this.disciplinas = disciplinas;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Boletim{" +
                "id=" + id +
                ", alunoId=" + alunoId +
                ", alunoNome='" + alunoNome + '\'' +
                ", turmaSigla='" + turmaSigla + '\'' +
                ", turmaSerie='" + turmaSerie + '\'' +
                ", disciplinas='" + disciplinas + '\'' +
                ", notas='" + notas + '\'' +
                '}';
    }
}

