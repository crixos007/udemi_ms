package com.caraveo.dao;

import java.util.List;

import com.caraveo.model.Agenda;

public interface AgendaDao {
	void agregarContacto(Agenda contacto);
	Agenda recuperaContacto(String email);
	List<Agenda> devolverContactos();
	void eliminarContacto(String email);
	void eliminarContacto(int idContacto);
	Agenda recuperarContacto(int idContacto);
	void actualizarContacto(Agenda contacto);
}