package com.cadastro.universidade.notas;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotasService {

    private static final Logger LOGGER = LoggerFactory.getLogger(NotasService.class);
    private final INotasRepository iNotasRepository;

    @Autowired
    public NotasService(INotasRepository iNotasRepository) {
        this.iNotasRepository = iNotasRepository;
    }

    public NotasDTO save(NotasDTO notasDTO){
        LOGGER.info("Salvando Turma{}",notasDTO);

        Notas notas= new Notas();
        notas.setNota(notasDTO.getNota());
        notas.setAlunoId(notasDTO.getAlunoId());
        notas.setDisciplinaId(notasDTO.getDisciplinaId());
        notas.setBoletimId(notasDTO.getBoletimId());
        notas = this.iNotasRepository.save(notas);
        return notasDTO.of(notas);
    }


}
