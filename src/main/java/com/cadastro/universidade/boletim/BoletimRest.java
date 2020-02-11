package com.cadastro.universidade.boletim;

import com.cadastro.universidade.service.ReportService;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5000")
@RequestMapping("/boletins")
public class BoletimRest {

    private final BoletimService boletimService;
    private final IBoletimRepository iBoletimRepository;
    @Autowired
    private final ReportService reportService;


    @Autowired
    public BoletimRest(BoletimService boletimService, IBoletimRepository iBoletimRepository, ReportService reportService) {
        this.boletimService = boletimService;
        this.iBoletimRepository = iBoletimRepository;
        this.reportService = reportService;
    }

    @PostMapping("/save")
    public BoletimDTO save(@RequestBody BoletimDTO boletimDTO) throws SQLException {
        return this.boletimService.save(boletimDTO);
    }

    @GetMapping("/{id}")
    public BoletimDTO find(@PathVariable("id") Long id) {
        return this.boletimService.findById(id);
    }



    @GetMapping()
    public List<Boletim> getItens() {
        return iBoletimRepository.findAll();
    }

    @GetMapping("/export/{format}/{alunoId}")
    public String gerarBoletim(@PathVariable("format") String format, @PathVariable("alunoId") Long alunoId ) throws FileNotFoundException, JRException {
        return reportService.exportReport(format, alunoId);
    }


}
