package com.cadastro.universidade.professor;

public class ProfessorDTO {

    private Long id;
    private String nome;

    public ProfessorDTO() {
    }

    public ProfessorDTO(Long id, String nome) {
        this.id = id;
        this.nome = nome;

    }

    public static ProfessorDTO of (Professor professor){
        return new ProfessorDTO(
                professor.getId(),
                professor.getNome()

        );

    }

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



    @Override
    public String toString() {
        return "ProfessorDTO{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
