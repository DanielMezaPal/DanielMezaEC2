package com.idat.ecdanielmeza.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.ecdanielmeza.model.Bodega;
import com.idat.ecdanielmeza.service.BodegaService;



@Controller
@RequestMapping("EC2-DanielMeza/bodega/v1") 
public class BodegaController {
	
	@Autowired
	private BodegaService service;
	
	@RequestMapping("/listar") 
	public @ResponseBody ResponseEntity<List<Bodega>> listar(){
		
		return new ResponseEntity<List<Bodega>>(service.listarBodegas(), HttpStatus.OK) ;		
	}
	
	@RequestMapping( path = "/guardar", method = RequestMethod.POST) 
	public ResponseEntity<Void> guardar( @RequestBody Bodega bodega ) {
		service.guardarBodega(bodega);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
		
	}
	
	@RequestMapping( path = "/eliminar/{id}", method = RequestMethod.DELETE) 
	public ResponseEntity<Void> eliminar( @PathVariable Integer id  ) {
		
		Bodega p = service.obtenerBodegaId(id);
		
		if(p !=null) {
			service.eliminarBodega(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		
	}
	
	@RequestMapping( path = "/actualizar", method = RequestMethod.PUT) 
	public ResponseEntity<Void> actualizar( @RequestBody Bodega bodega ) {
		
		Bodega p = service.obtenerBodegaId(bodega.getIdBodega());
		
		if(p !=null) {
			service.actualizarBodega(bodega);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		
	}
	
	@RequestMapping( path = "/listar/{id}", method = RequestMethod.GET) 
	public ResponseEntity<Bodega> obtenerId( @PathVariable Integer id ) {
		
		Bodega p = service.obtenerBodegaId(id);
		
		if(p !=null) {
			
			return new ResponseEntity<Bodega>(service.obtenerBodegaId(id),HttpStatus.OK);
		}
		
		return new ResponseEntity<Bodega>(HttpStatus.NOT_FOUND);
		
	}

}
