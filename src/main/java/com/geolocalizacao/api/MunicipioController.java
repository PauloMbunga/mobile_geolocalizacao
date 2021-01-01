package com.geolocalizacao.api;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.Valid;

import com.geolocalizacao.domain.model.Municipio;
import com.geolocalizacao.domain.repository.MunicipioRepository;
import com.geolocalizacao.domain.service.CadastroMunicipioService;

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
@RequestMapping("/municipios")
public class MunicipioController{

    @PersistenceContext
    private EntityManager manager;

    @Autowired
    private MunicipioRepository municipioRepository;

    @Autowired
    private CadastroMunicipioService cadastroMunicipioService;

    @GetMapping
    public List<Municipio> listar() {
        return municipioRepository.findAll();
    }



}

