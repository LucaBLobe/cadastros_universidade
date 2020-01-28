package com.cadastro.universidade.notas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notas")
public class NotasRest {

    private final NotasService notasService;

    @Autowired
    public NotasRest(NotasService notasService) {
        this.notasService = notasService;
    }

    @PostMapping()
    public NotasDTO save(@RequestBody NotasDTO notasDTO) {
        return this.notasService.save(notasDTO);
    }
}
