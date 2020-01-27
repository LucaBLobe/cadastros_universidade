package com.cadastro.universidade.turma;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITurmaRepository extends JpaRepository<Turma, Long> {
}
