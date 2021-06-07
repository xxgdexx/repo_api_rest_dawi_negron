package com.empresa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Marca;
import com.empresa.repository.MarcaRepositorio;
/**
 * 
 * @author JOSE JUNIOR
 * @author Renato Malpartida PC2
 *
 */
@Service
public class MarcaServicioImpl implements MarcaServicio {

	@Autowired
	private MarcaRepositorio repositorio;
	
	
	@Override
	public Marca insertarMarca(Marca obj) {
		return repositorio.save(obj);
	}

	@Override
	public List<Marca> listaMarca() {
		return repositorio.findAll();
		
	}

	@Override
	public List<Marca> listaMarcaPorNombreLike(String filtro) {
		return repositorio.listaMarcaPorNombreLike(filtro);
	}

	

	@Override
	public Optional<Marca> obtienePorId(int idMarca) {
		return repositorio.findById(idMarca);
	}

	@Override
	public void eliminaMarca(int id) {
		repositorio.deleteById(id);
		
	}

}

