package com.murilo.venda.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.murilo.venda.entity.Cliente;
import com.murilo.venda.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	public Cliente insereCliente(Cliente c) {
		if (c.getpNome().equals("")) {
			return null;
		}
		if (c.getDatNasc() == null) {
			return null;
		}
		if (c.getSaldo() == 0) {
			return null;
		}
		if (c.getCpf().equals("")) {
			return null;
		}
		c.setDatCads(new Date());

		return clienteRepository.save(c);

	}

	public List<Cliente> listaTodos() {
		return clienteRepository.findAll();

	}

	public Cliente listarClientePorId(Long id) throws Exception {
		if (id == null || id <= 0) {
			throw new IllegalArgumentException("Id Inválido!!!");
		}
		return this.clienteRepository.findById(id).orElseThrow(() -> new RuntimeException("Deu não viu"));

	}

}

//TODO: Estudar metodos do Optional
