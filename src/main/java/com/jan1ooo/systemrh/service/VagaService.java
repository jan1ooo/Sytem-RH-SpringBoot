package com.jan1ooo.systemrh.service;

import com.jan1ooo.systemrh.model.Vaga;
import com.jan1ooo.systemrh.repository.VagaRepository;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VagaService {

    @Autowired
    private final VagaRepository vagaRepository;

    public VagaService(VagaRepository vagaRepository){
        this.vagaRepository = vagaRepository;
    }

    public List<Vaga> findAll(){
        return vagaRepository.findAll();
    }

    public Vaga create(@Valid @NotNull Vaga vaga){
        return vagaRepository.save(vaga);
    }

    public void delete(Long id){
        if(vagaRepository.findById(id).isPresent()){
            vagaRepository.deleteById(id);
        }
    }

    public Optional<Vaga> findById(Long id){
        if(vagaRepository.findById(id).isPresent()){
            return vagaRepository.findById(id);
        }
//        return null;
        return null;
    }
}
