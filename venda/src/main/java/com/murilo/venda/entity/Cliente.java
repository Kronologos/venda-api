package com.murilo.venda.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "cliente", schema = "tabelas")
@SequenceGenerator(name = "seq_id_cliente", sequenceName = "seq_id_cliente", schema = "tabelas", allocationSize = 1, initialValue = 1)
public class Cliente {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_id_cliente")
	private Long id;

	@Column(name = "cpf", nullable = false, length = 11)
	private String cpf;

	@Column(name = "p_nome", nullable = false, length = 20)
	private String pNome;

	@Column(name = "u_nome", length = 20)
	private String uNome;

	@Temporal(TemporalType.DATE)
	@Column(name = "data_nasc", nullable = false)
	private Date datNasc;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_cad", nullable = false)
	private Date datCads;

	@Column(name = "saldo", nullable = false)
	private Double saldo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getpNome() {
		return pNome;
	}

	public void setpNome(String pNome) {
		this.pNome = pNome;
	}

	public String getuNome() {
		return uNome;
	}

	public void setuNome(String uNome) {
		this.uNome = uNome;
	}

	public Date getDatNasc() {
		return datNasc;
	}

	public void setDatNasc(Date datNasc) {
		this.datNasc = datNasc;
	}

	public Date getDatCads() {
		return datCads;
	}

	public void setDatCads(Date datCads) {
		this.datCads = datCads;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

}
