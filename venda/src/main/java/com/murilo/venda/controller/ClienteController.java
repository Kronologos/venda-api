package com.murilo.venda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.murilo.venda.entity.Cliente;
import com.murilo.venda.service.ClienteService;

@RestController
@CrossOrigin
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@PostMapping(path = "/inserirCliente")
	public ResponseEntity<Cliente> inserirCliente(@RequestBody(required = true) Cliente c) {
		Cliente cNovo = this.clienteService.insereCliente(c);
		if (cNovo != null) {
			return new ResponseEntity<Cliente>(cNovo, HttpStatus.OK);
		} else {
			return new ResponseEntity<Cliente>(cNovo, HttpStatus.BAD_REQUEST);
		}

	}

	@GetMapping(path = "/listarTodos")
	public List<Cliente> listarTodos() {
		List<Cliente> clientes = this.clienteService.listaTodos();
		System.out.println("Change");
		return clientes;
		
	}
	


}
