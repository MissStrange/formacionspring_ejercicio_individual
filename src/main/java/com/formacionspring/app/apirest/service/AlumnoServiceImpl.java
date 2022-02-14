package com.formacionspring.app.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacionspring.app.apirest.dao.AlumnoDao;
import com.formacionspring.app.apirest.entity.Alumno;

@Service
public class AlumnoServiceImpl implements AlumnoService{

	//Listar alumnos
	@Autowired
	private AlumnoDao alumnoDao;
	@Override
	public List<Alumno> findAll() {
		// TODO Auto-generated method stub
		return (List<Alumno>)alumnoDao.findAll();
	}
	
	//ENCONTRAR ALUMNOS POR ID
	@Override
	@Transactional(readOnly = true)
	public Alumno findById(Long id) {
			
		return  alumnoDao.findById(id).orElse(null);
	}
		
	@Override
	@Transactional
	public Alumno save(Alumno alumno) {
			
		return alumnoDao.save(alumno);
	}
}
