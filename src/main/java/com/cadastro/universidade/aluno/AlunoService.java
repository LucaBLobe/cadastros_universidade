package com.cadastro.universidade.aluno;

import com.cadastro.universidade.disciplina.Disciplina;
import com.cadastro.universidade.turma.TurmaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AlunoService {

    private final IAlunoRepository iAlunoRepository;
    private final TurmaService turmaService;
    private static final Logger LOGGER = LoggerFactory.getLogger(AlunoService.class);

    @Autowired
    public AlunoService(IAlunoRepository iAlunoRepository, TurmaService turmaService) {
        this.iAlunoRepository = iAlunoRepository;
        this.turmaService = turmaService;
    }

    public AlunoDTO save(AlunoDTO alunoDTO){

        LOGGER.info("Salvando Turma{}",alunoDTO);
        Aluno aluno = new Aluno();
        aluno.setNome(alunoDTO.getNome());
        aluno.setTurmaId(turmaService.findTurmaById(alunoDTO.getTurmaId()));


        aluno = this.iAlunoRepository.save(aluno);
        return alunoDTO.of(aluno);
    }
    public Aluno findAlunoById(Long id) {
        Optional<Aluno> alunoOptional = this.iAlunoRepository.findById(id);
        if (alunoOptional.isPresent()) {
            return alunoOptional.get();
        }
        throw new IllegalArgumentException(String.format("ID %s não existe", id));
    }


}
