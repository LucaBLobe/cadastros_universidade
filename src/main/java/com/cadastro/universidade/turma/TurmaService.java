package com.cadastro.universidade.turma;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TurmaService {

    private final ITurmaRepository iTurmaRepository;
    private static final Logger LOGGER = LoggerFactory.getLogger(TurmaService.class);

    @Autowired
    public TurmaService(ITurmaRepository iTurmaRepository) {
        this.iTurmaRepository = iTurmaRepository;
    }

    public TurmaDTO save(TurmaDTO turmaDTO) {

        LOGGER.info("Salvando Turma{}", turmaDTO);

        Turma turma = new Turma();
        turma.setPeriodo(turmaDTO.getPeriodo());
        turma.setSerie(turmaDTO.getSerie());
        turma.setSigla(turmaDTO.getSigla());

        turma = this.iTurmaRepository.save(turma);
        return turmaDTO.of(turma);
    }
}
