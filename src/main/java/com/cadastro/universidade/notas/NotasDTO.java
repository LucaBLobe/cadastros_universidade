package com.cadastro.universidade.notas;

import com.cadastro.universidade.aluno.Aluno;
import com.cadastro.universidade.disciplina.Disciplina;

public class NotasDTO {

    private Long id;
    private Double nota;
    private Aluno alunoId;
    private Disciplina disciplinaId;

    public NotasDTO() {
    }

    public NotasDTO(Long id, Double nota, Aluno alunoId, Disciplina disciplinaId) {
        this.id = id;
        this.nota = nota;
        this.alunoId = alunoId;
        this.disciplinaId = disciplinaId;
    }

    public static NotasDTO of(Notas notas) {
        return new NotasDTO(
                notas.getId(),
                notas.getNota(),
                notas.getAlunoId(),
                notas.getDisciplinaId()
        );
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public Aluno getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(Aluno alunoId) {
        this.alunoId = alunoId;
    }

    public Disciplina getDisciplinaId() {
        return disciplinaId;
    }

    public void setDisciplinaId(Disciplina disciplinaId) {
        this.disciplinaId = disciplinaId;
    }

    @Override
    public String toString() {
        return "NotasDTO{" +
                "id=" + id +
                ", nota=" + nota +
                ", alunoId=" + alunoId +
                ", disciplinaId=" + disciplinaId +
                '}';
    }
}
