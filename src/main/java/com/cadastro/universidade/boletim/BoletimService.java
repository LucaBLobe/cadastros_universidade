package com.cadastro.universidade.boletim;

import com.cadastro.universidade.aluno.AlunoService;
import com.cadastro.universidade.aluno.IAlunoRepository;
import com.cadastro.universidade.disciplina.DisciplinaService;
import com.cadastro.universidade.disciplina.IDisciplinaRepository;
import com.cadastro.universidade.notas.INotasRepository;
import com.cadastro.universidade.notas.Notas;
import com.cadastro.universidade.notas.NotasService;
import com.cadastro.universidade.turma.ITurmaRepository;
import com.cadastro.universidade.turma.TurmaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.List;
import java.util.Optional;

@Service
public class BoletimService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BoletimService.class);
    private final IBoletimRepository iBoletimRepository;
    private final AlunoService alunoService;
    private final NotasService notasService;

    @Autowired
    public BoletimService(IBoletimRepository iBoletimRepository, IAlunoRepository iAlunoRepository, IDisciplinaRepository iDisciplinaRepository, ITurmaRepository iTurmaRepository, INotasRepository iNotasRepository, AlunoService alunoService, DisciplinaService disciplinaService, TurmaService turmaService, NotasService notasService) {
        this.iBoletimRepository = iBoletimRepository;


        this.alunoService = alunoService;
        this.notasService = notasService;
    }



    public BoletimDTO save(BoletimDTO boletimDTO) throws SQLException {

//        findNotas(boletimDTO);

        LOGGER.info("Salvando boletim{}", boletimDTO);

        Long alunoId = boletimDTO.getAlunoId();
        String alunoNome = alunoService.findAlunoById(alunoId).getNome();
        String alunoTurma = alunoService.findAlunoById(alunoId).getTurmaId().getSigla();
        String alunoSerie = alunoService.findAlunoById(alunoId).getTurmaId().getSerie();
        List<Notas> alunoNotas = notasService.findNotasByAlunoId(alunoId);



        for (int i = 0; i < alunoNotas.size(); i++) {
            Boletim boletim = new Boletim();
            boletim.setAlunoId(alunoId);
            boletim.setAlunoNome(alunoNome);
            boletim.setTurmaSigla(alunoTurma);
            boletim.setTurmaSerie(alunoSerie);
            Notas nd = notasService.findNotasByAlunoId(alunoId).get(i);
            String nota = nd.getNota().toString();
            String disci = nd.getDisciplinaId().getNome();
            boletim.setDisciplinas(disci);
            boletim.setNotas(nota);
            boletim = this.iBoletimRepository.save(boletim);
        }

        return boletimDTO;
    }

    public BoletimDTO findById(Long id) {
        Optional<Boletim> boletimOptional = this.iBoletimRepository.findById(id);
        if (boletimOptional.isPresent()) {
            LOGGER.info("Recebendo find by ID... id: [{}]", BoletimDTO.of(boletimOptional.get()));
            return BoletimDTO.of(boletimOptional.get());
        }
        throw new IllegalArgumentException(String.format("ID %s não ex'iste", id));
    }
    public List<Boletim> findBoletimByAlunoId(Long alunoId) {
        List<Boletim> boletim = iBoletimRepository.findAllByAlunoId(alunoId);

        return boletim;
    }

}


