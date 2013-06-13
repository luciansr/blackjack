package main.java.model;

import java.util.ArrayList;
import java.util.Collections;

import main.java.enums.Acao;
import main.java.enums.Naipe;
import main.java.enums.TipoDeCarta;


public final class Croupier extends Player {
	private static Croupier INSTANCE = null;
	
	private ArrayList<Carta> cartasDosBaralhos;
	private int numeroBaralhos;

	private Croupier(String nome, int dinheiro, int numeroBaralhos) {
		super(nome, dinheiro);
		
		this.numeroBaralhos = numeroBaralhos;
		
		cartasDosBaralhos = new ArrayList<Carta>();
		iniciaCartas();
	}
	
	public ArrayList<Carta> getBaralho () {
		return cartasDosBaralhos;
	}
	
	private void iniciaCartas() {
		//inicia a lista com X baralhos
		for(int i = 0; i < numeroBaralhos; i++) {
			for(TipoDeCarta tipo : TipoDeCarta.values()) {
				for(Naipe naipe : Naipe.values()) {
					cartasDosBaralhos.add(new Carta(tipo, naipe));
				}
			}
		}
		
		//embaralha
		//Collections.shuffle(cartasDosBaralhos);
//		Collections.shuffle(cartasDosBaralhos);
//		Collections.shuffle(cartasDosBaralhos);
	}

	public static synchronized Croupier getInstance(String nome, int dinheiro, int numeroBaralhos){
        if (INSTANCE == null) {
        	INSTANCE = new Croupier(nome, dinheiro, numeroBaralhos);
        	return INSTANCE;
        }
        
        return INSTANCE;
    }

	@Override
	public Acao play() {
		return null;
		// TODO Auto-generated method stub
		
	}
	
	public Carta daCarta() {
		return cartasDosBaralhos.remove(0);
	}

	public boolean temCartas() {
		return !cartasDosBaralhos.isEmpty();
	}

}
