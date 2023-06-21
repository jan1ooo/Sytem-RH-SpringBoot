package com.jan1ooo.systemrh.controller;

import com.jan1ooo.systemrh.model.Vaga;
import com.jan1ooo.systemrh.service.VagaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/{id}")
    public Optional<Vaga> findById(@PathVariable Long id){
        return vagaService.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Vaga create(@RequestBody @Valid Vaga vaga){
        return vagaService.create(vaga);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        vagaService.delete(id);
    }
}
