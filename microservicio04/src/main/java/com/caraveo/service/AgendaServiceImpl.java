package com.caraveo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caraveo.dao.AgendaDao;
import com.caraveo.model.Agenda;

@Service
public class AgendaServiceImpl implements AgendaService {
	@Autowired
	AgendaDao service;

	@Override
	public boolean agregarContacto(Agenda contacto) {
		if(service.recuperarContacto(contacto.getIdContacto())==null) {
			service.agregarContacto(contacto);
			return true;
		}
		return false;
	}

	@Override
	public List<Agenda> recuperarContactos() {
		return service.devolverContactos();
	}

	@Override
	public void actualizarContacto(Agenda contacto) {
		if(service.recuperarContacto(contacto.getIdContacto())==null) {
			service.agregarContacto(contacto);
		}
	}

	@Override
	public boolean eliminarContacto(int idContacto) {
		if(service.recuperarContacto(idContacto)!=null) {
			service.eliminarContacto(idContacto);
			return true;
		}
		return false;
	}

	@Override
	public Agenda buscarContacto(int idContacto) {
		return service.recuperarContacto(idContacto);
	}
}