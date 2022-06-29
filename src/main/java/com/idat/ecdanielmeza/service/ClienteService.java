package com.idat.ecdanielmeza.service;

import java.util.List;

import com.idat.ecdanielmeza.model.Cliente;



public interface ClienteService {
	
	void guardarCliente(Cliente cliente);
	void actualizarCliente(Cliente cliente);
	void eliminarCliente(Integer id);
	List<Cliente> listarClientes();
	Cliente obtenerClienteId(Integer id);

}
