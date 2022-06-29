package com.idat.ecdanielmeza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.ecdanielmeza.model.Bodega;

@Repository
public interface BodegaRepository extends JpaRepository<Bodega, Integer> {

}
