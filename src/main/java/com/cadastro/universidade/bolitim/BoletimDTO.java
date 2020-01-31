//package com.cadastro.universidade.bolitim;
//
//import com.cadastro.universidade.aluno.Aluno;
//import com.cadastro.universidade.disciplina.Disciplina;
//import com.cadastro.universidade.notas.Notas;
//import com.cadastro.universidade.turma.Turma;
//
//import java.util.List;
//
//public class BoletimDTO {
//
//    private Long id;
//    private String aluno;
//    private String turmaSigla;
//    private String turmaSerie;
//    private List<Disciplina> disciplinas;
//    private List<Notas> notas;
//
//    public BoletimDTO() {
//    }
//
//    public BoletimDTO(Long id, String aluno, String turmaSigla, String turmaSerie, List<Disciplina> disciplinas, List<Notas> notas) {
//        this.id = id;
//        this.aluno = aluno;
//        this.turmaSigla = turmaSigla;
//        this.turmaSerie = turmaSerie;
//        this.disciplinas = disciplinas;
//        this.notas = notas;
//    }
//
//    public static BoletimDTO of (Boletim boletim){
//        return new BoletimDTO(
//                boletim.getId(),
//                boletim.getAluno().getNome(),
//                boletim.getTurmaSigla().getSigla(),
//                boletim.getTurmaSerie().getSerie(),
//                boletim.getDisciplinas(),
//                boletim.getNotas()
//        );
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getAluno() {
//        return aluno;
//    }
//
//    public void setAluno(String aluno) {
//        this.aluno = aluno;
//    }
//
//    public String getTurmaSigla() {
//        return turmaSigla;
//    }
//
//    public void setTurmaSigla(String turmaSigla) {
//        this.turmaSigla = turmaSigla;
//    }
//
//    public String getTurmaSerie() {
//        return turmaSerie;
//    }
//
//    public void setTurmaSerie(String turmaSerie) {
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
//        return "BoletimDTO{" +
//                "id=" + id +
//                ", aluno='" + aluno + '\'' +
//                ", turmaSigla='" + turmaSigla + '\'' +
//                ", turmaSerie='" + turmaSerie + '\'' +
//                ", disciplinas=" + disciplinas +
//                ", notas=" + notas +
//                '}';
//    }
//}
