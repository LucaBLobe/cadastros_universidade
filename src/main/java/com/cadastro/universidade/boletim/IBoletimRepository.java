package com.cadastro.universidade.boletim;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBoletimRepository extends JpaRepository<Boletim, Long> {

    List<Boletim> findAllByAlunoId(Long alunoId);

}
