package com.cadastro.universidade.boletim;

public class BoletimDTO {

    private Long id;
    private Long alunoId;
    private String alunoNome;


    public BoletimDTO() {
    }

    public BoletimDTO(Long id, Long alunoId, String alunoNome, String turmaSigla, String turmaSerie, String disciplinas, String notas) {
        this.id = id;
        this.alunoId = alunoId;

    }

    public static BoletimDTO of (Boletim boletim){
        return new BoletimDTO(
                boletim.getId(),
                boletim.getAlunoId(),
                boletim.getAlunoNome(),
                boletim.getTurmaSigla(),
                boletim.getTurmaSerie(),
                boletim.getDisciplinas(),
                boletim.getNotas()
        );
    }

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

    @Override
    public String toString() {
        return "BoletimDTO{" +
                "id=" + id +
                ", alunoId=" + alunoId +
                '}';
    }
}
