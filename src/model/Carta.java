package model;

import enums.Naipe;
import enums.TipoDeCarta;

public class Carta {
	
	int valor;
	TipoDeCarta tipo;
	Naipe naipe;
	
	public Carta(TipoDeCarta tipo, Naipe naipe, int valor) {
		this.tipo = tipo;
		this.valor = valor;
		this.naipe = naipe;
	}
	
	public TipoDeCarta getTipo() {
		return tipo;
	}
	
	public int getValor() {
		return valor;
	}

	public Naipe getNaipe() {
		return naipe;
	}
}
