package com.cadastro.universidade.aluno;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    private final IAlunoRepository iAlunoRepository;
    private static final Logger LOGGER = LoggerFactory.getLogger(AlunoService.class);

    @Autowired
    public AlunoService(IAlunoRepository iAlunoRepository) {
        this.iAlunoRepository = iAlunoRepository;
    }

    public AlunoDTO save(AlunoDTO alunoDTO){

        LOGGER.info("Salvando Turma{}",alunoDTO);
        Aluno aluno = new Aluno();
        aluno.setNome(alunoDTO.getNome());
        aluno.setTurmaId(alunoDTO.getTurmaId());
        aluno.setDisciplinaId(alunoDTO.getDisciplinaId());



        aluno = this.iAlunoRepository.save(aluno);
        return alunoDTO.of(aluno);
    }
}
