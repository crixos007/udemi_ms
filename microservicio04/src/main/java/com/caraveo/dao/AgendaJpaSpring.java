package com.caraveo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.caraveo.model.Agenda;

import jakarta.transaction.Transactional;

public interface AgendaJpaSpring extends JpaRepository<Agenda, Integer>{
	Agenda findByEmail(String email);
	
	@Transactional
	@Modifying
	@Query("Delete from Agenda a Where a.email=?1")
	void eliminarPorEmail(String email);	
}