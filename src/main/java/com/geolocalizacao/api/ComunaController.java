package com.geolocalizacao.api;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.Valid;

import com.geolocalizacao.domain.model.Comuna;
import com.geolocalizacao.domain.repository.ComunaRepository;
import com.geolocalizacao.domain.service.CadastroComunaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/comunas")
public class ComunaController{

    @PersistenceContext
    private EntityManager manager;

    @Autowired
    private ComunaRepository comunaRepository;

    @Autowired
    private CadastroComunaService cadastroComunaService;

    @GetMapping
    public List<Comuna> listar() {
        return comunaRepository.findAll();
    }



}

