//package com.cadastro.universidade.bolitim;
//
//import com.cadastro.universidade.aluno.Aluno;
//import com.cadastro.universidade.aluno.AlunoService;
//import com.cadastro.universidade.disciplina.DisciplinaService;
//import com.cadastro.universidade.notas.NotasService;
//import com.cadastro.universidade.turma.TurmaService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class BoletimService {
//
//    private static final Logger LOGGER = LoggerFactory.getLogger(BoletimService.class);
//    private final IBoletimRepository iBoletimRepository;
//    private final AlunoService alunoService;
//    private final TurmaService turmaService;
//    private final DisciplinaService disciplinaService;
//    private final NotasService notasService;
//
//    @Autowired
//    public BoletimService(IBoletimRepository iBoletimRepository, AlunoService alunoService, TurmaService turmaService, DisciplinaService disciplinaService, NotasService notasService) {
//        this.iBoletimRepository = iBoletimRepository;
//        this.alunoService = alunoService;
//        this.turmaService = turmaService;
//        this.disciplinaService = disciplinaService;
//        this.notasService = notasService;
//    }
//
//    public BoletimDTO save(BoletimDTO boletimDTO){
//        LOGGER.info("Salvando Turma{}",boletimDTO);
//
//        Boletim boletim = new Boletim(
//
//        boletim.setAluno(alunoService.findAlunoById(boletimDTO.));
//        boletim.setTurmaSigla(turmaService.findTurmaById(boletim.getAlunoNome().getTurmaId().getId()));
//        boletim.setTurmaSerie(turmaService.findTurmaById(boletim.getAlunoNome().getTurmaId().getId()));
//        boletim.setDisciplinas(disciplinaService.findDisciplinaById(boletim.getAlunoNome().getTurmaId().getDisciplinaId().get()));
//        boletim.setNotas(notasService.findNotasById().getAlunoId());
//
//
//        );
//        boletim = this.iBoletimRepository.save(boletim);
//        return boletimDTO.of(boletim);
//
//    }
//
//    public BoletimDTO findById(Long id) {
//        Optional<Boletim> boletimOptional = this.iBoletimRepository.findById(id);
//        if (boletimOptional.isPresent()) {
//            LOGGER.info("Recebendo find by ID... id: [{}]", BoletimDTO.of(boletimOptional.get()));
//            return BoletimDTO.of(boletimOptional.get());
//        }
//        throw new IllegalArgumentException(String.format("ID %s não existe", id));
//    }
//
//
//}
