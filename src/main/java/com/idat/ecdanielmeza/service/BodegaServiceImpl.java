package com.idat.ecdanielmeza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.ecdanielmeza.model.Bodega;
import com.idat.ecdanielmeza.repository.BodegaRepository;



@Service
public class BodegaServiceImpl implements BodegaService {
	
	@Autowired
	private BodegaRepository repository;	

	@Override
	public void guardarBodega(Bodega bodega) {
		repository.save(bodega);

	}

	@Override
	public void actualizarBodega(Bodega bodega) {
		repository.saveAndFlush(bodega);

	}

	@Override
	public void eliminarBodega(Integer id) {
		repository.deleteById(id);

	}

	@Override
	public List<Bodega> listarBodegas() {
		return repository.findAll();
	}

	@Override
	public Bodega obtenerBodegaId(Integer id) {
		return repository.findById(id).orElse(null);
	}

}
