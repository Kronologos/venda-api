package com.murilo.venda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.murilo.venda.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
