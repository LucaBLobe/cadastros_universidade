package com.cadastro.universidade.notas;

import com.cadastro.universidade.aluno.AlunoService;
import com.cadastro.universidade.disciplina.DisciplinaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotasService {

    private static final Logger LOGGER = LoggerFactory.getLogger(NotasService.class);
    private final INotasRepository iNotasRepository;
    private final AlunoService alunoService;
    private final DisciplinaService disciplinaService;

    @Autowired
    public NotasService(INotasRepository iNotasRepository, AlunoService alunoService, DisciplinaService disciplinaService) {
        this.iNotasRepository = iNotasRepository;
        this.alunoService = alunoService;
        this.disciplinaService = disciplinaService;
    }


    public NotasDTO save(NotasDTO notasDTO){
        LOGGER.info("Salvando Turma{}",notasDTO);

        Notas notas= new Notas();
        notas.setNota(notasDTO.getNota());
        notas.setAlunoId(alunoService.findAlunoById(notasDTO.getAlunoId()));
        notas.setDisciplinaId(disciplinaService.findDisciplinaById(notasDTO.getDisciplinaId()));

        notas = this.iNotasRepository.save(notas);
        return notasDTO.of(notas);
    }
    public Notas findNotasById(Long id) {
        Optional<Notas> notasOptional = this.iNotasRepository.findById(id);
        if (notasOptional.isPresent()) {
            return notasOptional.get();
        }
        throw new IllegalArgumentException(String.format("ID %s não existe", id));
    }
    public List<Notas> findNotasByAlunoId(Long alunoId) {
        List<Notas> notas = this.iNotasRepository.findAllByAlunoIdId(alunoId);
            return notas;
        }

    public Notas findByDisciplinaId(Long disciplinaId) {
        Optional<Notas> notasOptional = this.iNotasRepository.findById(disciplinaId);
        if (notasOptional.isPresent()) {
            return notasOptional.get();
        }
        throw new IllegalArgumentException(String.format("ID %s não existe", disciplinaId));
    }

}
