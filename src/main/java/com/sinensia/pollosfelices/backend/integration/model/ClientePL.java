package com.sinensia.pollosfelices.backend.integration.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="CLIENTES")
@PrimaryKeyJoinColumn(name="CODIGO_CLIENTE")
public class ClientePL extends PersonaPL {
	private static final long serialVersionUID = 1L;
	
	@Column(name="GOLD")
	private boolean tarjetaGold;
	
	public ClientePL() {
		
	}

	public boolean isTarjetaGold() {
		return tarjetaGold;
	}

	public void setTarjetaGold(boolean tarjetaGold) {
		this.tarjetaGold = tarjetaGold;
	}

	@Override
	public String toString() {
		return "ClientePL [tarjetaGold=" + tarjetaGold + ", toString()=" + super.toString() + "]";
	}
	
}
