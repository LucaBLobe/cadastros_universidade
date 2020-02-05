package com.cadastro.universidade.bolitim;

import com.cadastro.universidade.notas.Notas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBoletimRepository extends JpaRepository<Boletim, Long> {

    List<Boletim> findAllByAlunoIdId(Long alunoId);

}
