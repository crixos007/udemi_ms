package com.caraveo.service;

import java.util.List;

import com.caraveo.model.Agenda;

public interface AgendaService {
	boolean agregarContacto(Agenda contacto);
	List<Agenda> recuperarContactos();
	void actualizarContacto(Agenda contacto);
	boolean eliminarContacto(int idContacto);
	Agenda buscarContacto(int idContacto);
}