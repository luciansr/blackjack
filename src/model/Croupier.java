package model;
import java.util.Collections;
import java.util.Stack;

import enums.Naipe;
import enums.TipoDeCarta;

public final class Croupier extends Player {
	private static Croupier INSTANCE = null;
	
	private Stack<Carta> cartasDosBaralhos;
	private int numeroBaralhos;

	private Croupier(String nome, int dinheiro, int numeroBaralhos) {
		super(nome, dinheiro);
		
		this.numeroBaralhos = numeroBaralhos;
		
		cartasDosBaralhos = new Stack<Carta>();
		iniciaCartas();
	}
	
	public Stack<Carta> getBaralho () {
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
		Collections.shuffle(cartasDosBaralhos);
		Collections.shuffle(cartasDosBaralhos);
		Collections.shuffle(cartasDosBaralhos);
	}

	public static synchronized Croupier getInstance(String nome, int dinheiro, int numeroBaralhos){
        if (INSTANCE == null) {
        	INSTANCE = new Croupier(nome, dinheiro, numeroBaralhos);
        	return INSTANCE;
        }
        
        return INSTANCE;
    }


	
	public Carta daCarta() {
		return getBaralho().pop();
	}

	public boolean temCartas() {
		return !cartasDosBaralhos.isEmpty();
	}

	public void cartasAcabaram() {
		// TODO tratar quando não existirem mais cartas, acabando o jogo
		
	}

}
