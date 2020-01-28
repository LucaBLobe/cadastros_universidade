package com.cadastro.universidade.professor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProfessorRepository extends JpaRepository<Professor, Long> {



}
