package com.jan1ooo.systemrh.controller;

import com.jan1ooo.systemrh.model.Vaga;
import com.jan1ooo.systemrh.service.VagaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
@RequestMapping("/api/vagas")
public class VagaController {

    @Autowired
    private final VagaService vagaService;

    public VagaController(VagaService vagaService){
        this.vagaService = vagaService;
    }

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    public List<Vaga> findAll(){
        return vagaService.findAll();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Vaga create(@RequestBody @Valid Vaga vaga){
        return vagaService.create(vaga);
    }
}
