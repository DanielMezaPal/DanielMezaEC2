package com.idat.ecdanielmeza.service;

import java.util.List;

import com.idat.ecdanielmeza.model.Usuario;



public interface UsuarioService {
	
	void guardarUsuario(Usuario usuario);
	void actualizarUsuario(Usuario usuario);
	void eliminarUsuario(Integer id);
	List<Usuario> listarUsuarios();
	Usuario obtenerUsuarioId(Integer id);

}
