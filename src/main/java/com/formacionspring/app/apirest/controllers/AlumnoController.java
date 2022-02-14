package com.formacionspring.app.apirest.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formacionspring.app.apirest.entity.Alumno;
import com.formacionspring.app.apirest.service.AlumnoService;

@RestController
@RequestMapping("/api")
public class AlumnoController {

	@Autowired
	private AlumnoService servicio;
	
	@GetMapping
	public List<Alumno> alumno(){
		return servicio.findAll();
	}
	
	@GetMapping("/clientes/{id}")
	public ResponseEntity<?> alumnoShow(@PathVariable Long id){
		Alumno alumno = null;
		Map<String, Object> response = new HashMap<>();
		
		try {
			
			alumno = servicio.findById(id);
		} catch(DataAccessException e) {
			
			response.put("mensaje", "Error al realizar la consulta a la base de datos");
			response.put("error", e.getMessage().concat("_").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		if (alumno == null) {
			
			response.put("mensaje", "El cliente ID: ".concat(id.toString().concat("no existe en la base de datos")));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
		}
		 return new ResponseEntity<Alumno>(alumno, HttpStatus.OK);
	}
}
