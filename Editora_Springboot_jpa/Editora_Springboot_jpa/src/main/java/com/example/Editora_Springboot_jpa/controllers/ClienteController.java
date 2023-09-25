package com.example.Editora_Springboot_jpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Editora_Springboot_jpa.entities.Cliente;
import com.example.Editora_Springboot_jpa.repositories.ClienteRepository;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteRepository repository;
	
	@GetMapping
	public List<Cliente> findAll() {
		List<Cliente> result = repository.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public Cliente findById(@PathVariable Long id) {
		Cliente result = repository.findById(id).get();
		return result;
	}
	
	@PostMapping
	public Cliente insert(@RequestBody Cliente cliente) {
		Cliente result = repository.save(cliente);
		return result;
	}
}
