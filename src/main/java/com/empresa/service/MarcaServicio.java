package com.empresa.service;

import java.util.List;
import java.util.Optional;

import com.empresa.entity.Marca;
 
/**
 * 
 * @author JOSE JUNIOR
 * @author Renato Malpartida PC2
 *
 */
public interface MarcaServicio {
	
	public abstract Marca insertarMarca(Marca obj);
	public abstract List<Marca> listaMarca(); 
	public abstract List<Marca> listaMarcaPorNombreLike(String filtro);
	public abstract void eliminaMarca(int id);
	public abstract Optional<Marca> obtienePorId(int idMarca);
}
