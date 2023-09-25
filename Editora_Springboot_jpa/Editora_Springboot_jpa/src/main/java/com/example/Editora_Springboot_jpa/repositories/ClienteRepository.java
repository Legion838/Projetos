package com.example.Editora_Springboot_jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Editora_Springboot_jpa.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
