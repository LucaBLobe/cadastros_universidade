package com.cadastro.universidade.notas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:5000")
@RequestMapping("/notas")
public class NotasRest {

    private final NotasService notasService;

    @Autowired
    public NotasRest(NotasService notasService) {
        this.notasService = notasService;
    }

    @PostMapping("/save")
    public NotasDTO save(@RequestBody NotasDTO notasDTO) {
        return this.notasService.save(notasDTO);
    }
}
