package com.cadastro.universidade.notas;

import com.cadastro.universidade.aluno.Aluno;
import com.cadastro.universidade.bolitim.Boletim;
import com.cadastro.universidade.disciplina.Disciplina;
import com.cadastro.universidade.turma.Turma;

import java.util.List;

public class NotasDTO {

    private Long id;
    private Double nota;
    private List<Aluno> alunoId;
    private List<Disciplina> disciplinaId;
    private List<Boletim> boletimId;

    public NotasDTO() {
    }

    public NotasDTO(Long id, Double nota, List<Aluno> alunoId, List<Disciplina> disciplinaId, List<Boletim> boletimId) {
        this.id = id;
        this.nota = nota;
        this.alunoId = alunoId;
        this.disciplinaId = disciplinaId;
        this.boletimId = boletimId;
    }

    public static NotasDTO of (Notas notas){
        return new NotasDTO(
                notas.getId(),
                notas.getNota(),
                notas.getAlunoId(),
                notas.getDisciplinaId(),
                notas.getBoletimId()

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

    public List<Aluno> getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(List<Aluno> alunoId) {
        this.alunoId = alunoId;
    }

    public List<Disciplina> getDisciplinaId() {
        return disciplinaId;
    }

    public void setDisciplinaId(List<Disciplina> disciplinaId) {
        this.disciplinaId = disciplinaId;
    }

    public List<Boletim> getBoletimId() {
        return boletimId;
    }

    public void setBoletimId(List<Boletim> boletimId) {
        this.boletimId = boletimId;
    }

    @Override
    public String toString() {
        return "NotasDTO{" +
                "id=" + id +
                ", nota=" + nota +
                ", alunoId=" + alunoId +
                ", disciplinaId=" + disciplinaId +
                ", boletimId=" + boletimId +
                '}';
    }
}
