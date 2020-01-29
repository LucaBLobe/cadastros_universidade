package com.cadastro.universidade.bolitim;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoletimService {
/*
    private static final Logger LOGGER = LoggerFactory.getLogger(BoletimService.class);
    private final IBoletimRepository iBoletimRepository;

    @Autowired
    public BoletimService(IBoletimRepository iBoletimRepository) {
        this.iBoletimRepository = iBoletimRepository;
    }

    public BoletimDTO save(BoletimDTO boletimDTO){
        LOGGER.info("Salvando Turma{}",boletimDTO);

        Boletim boletim = new Boletim();
        boletim.setTurmaId(boletimDTO.getTurmaId());
        boletim.setAlunoId(boletimDTO.getAlunoId());
        boletim.setDisciplinaId(boletimDTO.getDisciplinaId());
        boletim.setNotaId(boletimDTO.getNotaId());

        boletim = this.iBoletimRepository.save(boletim);
        return boletimDTO.of(boletim);

    }*/
}
