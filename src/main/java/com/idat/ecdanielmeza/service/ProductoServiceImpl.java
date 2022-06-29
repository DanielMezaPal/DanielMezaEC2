package com.idat.ecdanielmeza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.ecdanielmeza.model.Producto;
import com.idat.ecdanielmeza.repository.ProductoRepository;


@Service
public class ProductoServiceImpl implements ProductoService {
	
	
	@Autowired
	private ProductoRepository repository;

	@Override
	public void guardarProducto(Producto producto) {
		repository.save(producto);

	}

	@Override
	public void actualizarProducto(Producto producto) {
		repository.saveAndFlush(producto);

	}

	@Override
	public void eliminarProducto(Integer id) {
		repository.deleteById(id);

	}

	@Override
	public List<Producto> listarProductos() {
		return repository.findAll();
	}

	@Override
	public Producto obtenerProductoId(Integer id) {
		return repository.findById(id).orElse(null);
	}

}
