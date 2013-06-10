package model;

import enums.Naipe;
import enums.TipoDeCarta;

public class Carta {
	
	private int valor;
	private TipoDeCarta tipo;
	private Naipe naipe;
	
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
