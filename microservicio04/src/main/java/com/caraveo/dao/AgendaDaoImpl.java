package com.caraveo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.caraveo.model.Agenda;

@Repository
public class AgendaDaoImpl implements AgendaDao {
	@Autowired
	AgendaJpaSpring repository;

	@Override
	public void agregarContacto(Agenda contacto) {
		repository.save(contacto);
	}

	@Override
	public Agenda recuperaContacto(String email) {		
		return repository.findByEmail(email);
	}

	@Override
	public List<Agenda> devolverContactos() {
		return repository.findAll();
	}

	@Override
	public void eliminarContacto(String email) {
		repository.eliminarPorEmail(email);
	}

	@Override
	public void eliminarContacto(int idContacto) {
		repository.deleteById(idContacto);
	}

	@Override
	public Agenda recuperarContacto(int idContacto) {
		if(repository.findById(idContacto).isPresent()) {
			return repository.findById(idContacto).get();
		}
		return null;
	}

	@Override
	public void actualizarContacto(Agenda contacto) {
		repository.save(contacto);
	}
}