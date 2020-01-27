package com.cadastro.universidade.turma;

public class TurmaDTO {

    private Long id;
    private String periodo;
    private String serie;
    private String sigla;

    public TurmaDTO() {
    }

    public TurmaDTO(Long id, String periodo, String serie, String sigla) {
        this.id = id;
        this.periodo = periodo;
        this.serie = serie;
        this.sigla = sigla;
    }

    public static TurmaDTO of (Turma turma){
        return new TurmaDTO(
                turma.getId(),
                turma.getPeriodo(),
                turma.getSerie(),
                turma.getSigla()
        );
    }

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

    @Override
    public String toString() {
        return "TurmaDTO{" +
                "id=" + id +
                ", periodo='" + periodo + '\'' +
                ", serie='" + serie + '\'' +
                ", sigla='" + sigla + '\'' +
                '}';
    }
}
