package com.cadastro.universidade.notas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INotasRepository extends JpaRepository<Notas, Long> {



}
