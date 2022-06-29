package com.idat.ecdanielmeza.service;

import java.util.List;

import com.idat.ecdanielmeza.model.Bodega;



public interface BodegaService {
	
	void guardarBodega(Bodega bodega);
	void actualizarBodega(Bodega bodega);
	void eliminarBodega(Integer id);
	List<Bodega> listarBodegas();
	Bodega obtenerBodegaId(Integer id);

}
