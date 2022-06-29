package com.idat.ecdanielmeza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.ecdanielmeza.model.Cliente;
import com.idat.ecdanielmeza.repository.ClienteRepository;


@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClienteRepository repository;

	@Override
	public void guardarCliente(Cliente cliente) {
		repository.save(cliente);

	}

	@Override
	public void actualizarCliente(Cliente cliente) {
		repository.saveAndFlush(cliente);

	}

	@Override
	public void eliminarCliente(Integer id) {
		repository.deleteById(id);

	}

	@Override
	public List<Cliente> listarClientes() {
		return repository.findAll();
	}

	@Override
	public Cliente obtenerClienteId(Integer id) {
		return repository.findById(id).orElse(null);
	}

}
