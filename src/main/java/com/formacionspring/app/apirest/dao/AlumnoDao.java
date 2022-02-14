package com.formacionspring.app.apirest.dao;

import org.springframework.data.repository.CrudRepository;

import com.formacionspring.app.apirest.entity.Alumno;

public interface AlumnoDao extends CrudRepository<Alumno, Long>{

}
