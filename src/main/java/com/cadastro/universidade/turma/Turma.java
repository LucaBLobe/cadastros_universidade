package com.cadastro.universidade.turma;


import javax.persistence.*;

@Entity
@Table(name = "colaborador")
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String nome) {
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

    @Override
    public String toString() {
        return "Turma{" +
                "id=" + id +
                ", periodo='" + periodo + '\'' +
                ", serie='" + serie + '\'' +
                ", sigla='" + sigla + '\'' +
                '}';
    }
}
