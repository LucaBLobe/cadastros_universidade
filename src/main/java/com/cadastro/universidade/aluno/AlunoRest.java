package com.cadastro.universidade.aluno;

//import com.cadastro.universidade.service.ReportService;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;

@RestController
@RequestMapping("/alunos")
public class AlunoRest {

    private final AlunoService alunoService;

    @Autowired
    public AlunoRest(AlunoService alunoService) {
        this.alunoService = alunoService;
    }
//    @Autowired
//    private ReportService reportService;


    @PostMapping()
    public AlunoDTO save(@RequestBody AlunoDTO alunoDTO){
        return  this.alunoService.save(alunoDTO);
    }

//    @GetMapping("/report/{format}")
//    public String generateReport(@PathVariable String format) throws FileNotFoundException, JRException {
//        return reportService.exportReport(format);
//    }
}
