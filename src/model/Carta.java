package model;

public class Carta {
	
	int valor;
	private String carta;
	Naipe naipe;
	
	public Carta(String carta, int valor) {
		this.carta = carta;
		this.valor = valor;
	}
	
	public String getCarta() {
		return carta;
	}


}
