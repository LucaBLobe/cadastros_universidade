//package com.cadastro.universidade.bolitim;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/boletins")
//public class BoletimRest {
//
//    private final BoletimService boletimService;
//
//    @Autowired
//    public BoletimRest(BoletimService boletimService) {
//        this.boletimService = boletimService;
//    }
//
//    @PostMapping()
//    public BoletimDTO save(@RequestBody BoletimDTO boletimDTO){
//        return this.boletimService.save(boletimDTO);
//    }
//
//    @GetMapping("/{id}")
//    public BoletimDTO find(@PathVariable("id") Long id) {
//
//
//        return this.boletimService.findById(id);
//    }
//
//
//
//}
