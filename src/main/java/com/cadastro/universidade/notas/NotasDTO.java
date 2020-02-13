package com.cadastro.universidade.notas;

import com.cadastro.universidade.aluno.Aluno;
import com.cadastro.universidade.disciplina.Disciplina;

import javax.validation.constraints.NotNull;

public class NotasDTO {

    private Long id;
    @NotNull
    private Double nota;
    @NotNull
    private Long alunoId;
    @NotNull
    private Long disciplinaId;

    public NotasDTO() {
    }

    public NotasDTO(Long id, Double nota, Long alunoId, Long disciplinaId) {
        this.id = id;
        this.nota = nota;
        this.alunoId = alunoId;
        this.disciplinaId = disciplinaId;
    }

    public static NotasDTO of(Notas notas) {
        return new NotasDTO(
                notas.getId(),
                notas.getNota(),
                notas.getAlunoId().getId(),
                notas.getDisciplinaId().getId()
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

    public Long getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(Long alunoId) {
        this.alunoId = alunoId;
    }

    public Long getDisciplinaId() {
        return disciplinaId;
    }

    public void setDisciplinaId(Long disciplinaId) {
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
