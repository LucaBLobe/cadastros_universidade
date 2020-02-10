package com.cadastro.universidade.disciplina;

import com.cadastro.universidade.aluno.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDisciplinaRepository extends JpaRepository<Disciplina, Long> {
//
//    List<Disciplina> findAllByTurmaIdId(Long turmaId);


}
