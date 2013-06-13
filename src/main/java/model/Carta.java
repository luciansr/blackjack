package main.java.model;

import main.java.enums.Naipe;
import main.java.enums.TipoDeCarta;

public class Carta {
	
	private TipoDeCarta tipo;
	private Naipe naipe;
	
	public Carta(TipoDeCarta tipo, Naipe naipe) {
		this.tipo = tipo;
		this.naipe = naipe;
	}
	
	public TipoDeCarta getTipo() {
		return tipo;
	}
	
	public int getValor() {
		return tipo.getValor();
	}

	public Naipe getNaipe() {
		return naipe;
	}
}
