package com.caraveo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.caraveo.model.Curso;

import jakarta.annotation.PostConstruct;

@RestController
public class Cursoscontroller {
	private List<Curso> cursos;
	@PostConstruct
	private void init() {
		cursos=new ArrayList<>();
		cursos.add(new Curso("Java",100,"mañana"));
		cursos.add(new Curso("Java2",200,"tarde"));
		cursos.add(new Curso("Java3",300,"noche"));
	}
		
	@GetMapping(value="curso", produces=MediaType.APPLICATION_XML_VALUE)
	public Curso getCurso() {
		return new Curso("Java",100,"mañana");
	}
	
	@GetMapping(value="cursos", produces=MediaType.APPLICATION_XML_VALUE)
	public List<Curso> getCursos() {
		return cursos;
	}
	
	@GetMapping(value="curso/{name}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> getCurso(@PathVariable("name") String nombre) {
		List<Curso> aux = new ArrayList<>();
		for(Curso x : cursos) {
			if(x.getNombre().contains(nombre)) {
				aux.add(x);
			}
		}
		return aux;
	}
}