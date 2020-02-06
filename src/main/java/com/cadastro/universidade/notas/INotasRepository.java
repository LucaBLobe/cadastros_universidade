package com.cadastro.universidade.notas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface INotasRepository extends JpaRepository<Notas, Long> {

    List<Notas> findAllByAlunoIdId(Long alunoId);
    List<Notas> findByDisciplinaId(Long DisciplinaId);

}
