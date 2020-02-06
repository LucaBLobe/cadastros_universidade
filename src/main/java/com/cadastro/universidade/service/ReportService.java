package com.cadastro.universidade.service;

import com.cadastro.universidade.boletim.Boletim;
import com.cadastro.universidade.boletim.BoletimService;
import com.cadastro.universidade.boletim.IBoletimRepository;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ReportService {

    @Autowired
    private final BoletimService boletimService;
    private final IBoletimRepository iBoletimRepository;

    public ReportService(BoletimService boletimService, IBoletimRepository iBoletimRepository) {
        this.boletimService = boletimService;
        this.iBoletimRepository = iBoletimRepository;
    }
    public String exportReport(String reportFormat, Long alunoId) throws FileNotFoundException, JRException {
        String path = "C:\\jasper";
        List<Boletim> boletim = boletimService.findBoletimByAlunoId(alunoId);
        File file = ResourceUtils.getFile("classpath:boletim.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(boletim);
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("createdBy", "Java Techie");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        if (reportFormat.equalsIgnoreCase("html")) {
            JasperExportManager.exportReportToHtmlFile(jasperPrint, path + "\\boletim.html");
        }
        if (reportFormat.equalsIgnoreCase("pdf")) {
            JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\boletim.pdf");
        }
        return "report generated in path : " + path;
    }
}