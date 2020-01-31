//package com.cadastro.universidade.service;
//
//import com.cadastro.universidade.aluno.Aluno;
//import com.cadastro.universidade.aluno.IAlunoRepository;
//import com.cadastro.universidade.disciplina.IDisciplinaRepository;
//import com.cadastro.universidade.notas.INotasRepository;
//import com.cadastro.universidade.turma.ITurmaRepository;
//import net.sf.jasperreports.engine.*;
//import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
//import org.hibernate.mapping.Map;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.util.ResourceUtils;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.HashMap;
//import java.util.List;
//
//@Service
//public class ReportService {
//    @Autowired
//    private IAlunoRepository iAlunoRepository;
//    private IDisciplinaRepository disciplinaRepository;
//    private ITurmaRepository iTurmaRepository;
//    private INotasRepository iNotasRepository;
//
//    public String exportReport(String reportFormat) throws JRException, FileNotFoundException {
//        String path = "C:\\jasper";
//
//        List<Aluno> aluno = iAlunoRepository.findAll();
//
//        //carregar arquivo e compilar
//        File file = ResourceUtils.getFile("classpath:boletim.jrxml");
//        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
//        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(aluno);
//
//        Map<String, Object> parameters = new HashMap<>();
//        parameters.put("createdBy", "Boletim");
//        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
//        if (reportFormat.equalsIgnoreCase("html")) {
//            JasperExportManager.exportReportToHtmlFile(jasperPrint, path + "\\boletim.html");
//        }
//        if (reportFormat.equalsIgnoreCase("pdf")) {
//            JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\boletim.pdf");
//        }
//        return "report generated in path : " + path;
//    }
//
//}
