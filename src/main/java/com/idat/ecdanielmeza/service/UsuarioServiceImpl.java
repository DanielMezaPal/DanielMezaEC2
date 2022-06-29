package com.idat.ecdanielmeza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.ecdanielmeza.model.Usuario;
import com.idat.ecdanielmeza.repository.UsuarioRepository;


@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	
	

	@Override
	public void guardarUsuario(Usuario usuario) {
		repository.save(usuario);

	}

	@Override
	public void actualizarUsuario(Usuario usuario) {
		repository.saveAndFlush(usuario);

	}

	@Override
	public void eliminarUsuario(Integer id) {
		repository.deleteById(id);

	}

	@Override
	public List<Usuario> listarUsuarios() {
		return repository.findAll();
	}

	@Override
	public Usuario obtenerUsuarioId(Integer id) {
		return repository.findById(id).orElse(null);
	}

}
