//package com.cadastro.universidade.bolitim;
//
//
//import com.cadastro.universidade.aluno.Aluno;
//import com.cadastro.universidade.disciplina.Disciplina;
//import com.cadastro.universidade.notas.Notas;
//import com.cadastro.universidade.turma.Turma;
//
//import javax.persistence.*;
//import java.util.List;
//
//
//public class Boletim {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne
//    @JoinColumn(name = "aluno_nome", referencedColumnName = "nome")
//    private Aluno aluno;
//
//    @ManyToOne
//    @JoinColumn(name = "turma_sigla", referencedColumnName = "sigla")
//    private Turma turmaSigla;
//
//    @ManyToOne
//    @JoinColumn(name = "turma_serie", referencedColumnName = "serie")
//    private Turma turmaSerie;
//
//    @OneToMany
//    @JoinColumn(name="disciplinas", referencedColumnName="nome")
//    private List<Disciplina> disciplinas;
//
//    @OneToMany
//    @JoinColumn(name="notas_aluno", referencedColumnName="nota")
//    private List<Notas> notas;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Aluno getAluno() {
//        return aluno;
//    }
//
//    public void setAluno(Aluno aluno) {
//        this.aluno = aluno;
//    }
//
//    public Turma getTurmaSigla() {
//        return turmaSigla;
//    }
//
//    public void setTurmaSigla(Turma turmaSigla) {
//        this.turmaSigla = turmaSigla;
//    }
//
//    public Turma getTurmaSerie() {
//        return turmaSerie;
//    }
//
//    public void setTurmaSerie(Turma turmaSerie) {
//        this.turmaSerie = turmaSerie;
//    }
//
//    public List<Disciplina> getDisciplinas() {
//        return disciplinas;
//    }
//
//    public void setDisciplinas(List<Disciplina> disciplinas) {
//        this.disciplinas = disciplinas;
//    }
//
//    public List<Notas> getNotas() {
//        return notas;
//    }
//
//    public void setNotas(List<Notas> notas) {
//        this.notas = notas;
//    }
//
//    @Override
//    public String toString() {
//        return "Boletim{" +
//                "id=" + id +
//                ", aluno=" + aluno +
//                ", turmaSigla=" + turmaSigla +
//                ", turmaSerie=" + turmaSerie +
//                ", disciplinas=" + disciplinas +
//                ", notas=" + notas +
//                '}';
//    }
//}

