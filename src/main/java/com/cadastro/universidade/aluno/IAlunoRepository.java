package com.cadastro.universidade.aluno;

import com.cadastro.universidade.boletim.Boletim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAlunoRepository extends JpaRepository<Aluno, Long> {

    List<Aluno> findAllByTurmaIdId(Long turmaId);
}
