package com.geolocalizacao.domain.repository;

import java.util.List;

import com.geolocalizacao.domain.model.Municipio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MunicipioRepository extends JpaRepository<Municipio,Long> {
    

    
    Municipio findByCodigo(String codigo);
}
