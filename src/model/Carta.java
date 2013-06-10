package model;

import enums.Naipe;

public class Carta {
	
	int valor;
	private String carta;
	Naipe naipe;
	
	public Carta(String carta, int valor, Naipe naipe) {
		this.carta = carta;
		this.valor = valor;
		this.naipe = naipe;
	}
	
	public String getTipo() {
		return carta;
	}
	
	public int getValor() {
		return valor;
	}

	public Naipe getNaipe() {
		return naipe;
	}
}
