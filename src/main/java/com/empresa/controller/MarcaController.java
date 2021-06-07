package com.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Marca;
import com.empresa.service.MarcaServicio;

@RestController
@RequestMapping("/rest/marca")
public class MarcaController {

	@Autowired
	private MarcaServicio servicio;

	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Marca>> listaMarca(){
		List<Marca> lista= servicio.listaMarca();
		return ResponseEntity.ok(lista);
	}

}
