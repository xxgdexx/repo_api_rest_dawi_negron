package com.empresa.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.empresa.entity.Marca;
/**
 * 
 * @author JOSE JUNIOR 
 * @author Renato Malpartida PC2
 *
 */
public interface MarcaRepositorio extends JpaRepository<Marca, Integer> {
	
	
	
	@Query("select a from Marca a where nombre like :fil")
	public abstract List<Marca> listaMarcaPorNombreLike(@Param("fil")String filtro);

}
