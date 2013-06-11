package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import enums.Acao;
import enums.Naipe;
import enums.TipoDeCarta;

import model.*;

public final class BlackJackController {
	private static BlackJackController INSTANCE = null;
	
	private ArrayList<Player> listaJogadores;
	private int numeroBaralhos; 
	private ArrayList<Carta> cartasDosBaralhos;
	
	Scanner in = new Scanner(System.in);
	
	
	
	private BlackJackController(ArrayList<Player> listaJogadores, int numeroBaralhos) {
		this.listaJogadores = listaJogadores;
		this.numeroBaralhos = numeroBaralhos;
		
		cartasDosBaralhos = new ArrayList<Carta>();
		
		iniciaCartas();
	}
	
    public static synchronized BlackJackController getInstance(ArrayList<Player> listaJogadores, int numeroBaralhos){
        if (INSTANCE == null) {
        	INSTANCE = new BlackJackController(listaJogadores, numeroBaralhos);
        	return INSTANCE;
        }
        
        return INSTANCE;
    }
	
	public void start() {
		while(true) {
			
			for (Player player : listaJogadores) {
				mostraJogo();
				
				
				trataAcoes(player, player.play());
			}
		}
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

	private void mostraJogo() {
		for (Player jogador : listaJogadores) {
			System.out.println("Jogador: '" + jogador.getNome() + "." ); 
			//TODO definir como mostrar na tela
		}

	}
	
	private void daCartaPara(Player player){
		if (cartasDosBaralhos.size() > 0) player.recebeCarta(cartasDosBaralhos.remove(0));
		else cartasAcabaram();
		
		
	}
	
	private void cartasAcabaram() {
		// TODO tratar quando não existirem mais cartas, mostrar na tela erro, ou na interface

	}
	
	private void pagaMetade(Player player) {
		// TODO Auto-generated method stub

	}
	
	private void trataAcoes(Player player, Acao acao) {
		switch (acao) {
			case HIT:
				daCartaPara(player);
				break;
			case DOUBLEDOWN:
				daCartaPara(player);
				break;
			case STAND:
				break;
			case SURRENDER:
				pagaMetade(player);
				listaJogadores.remove(player); //TODO esta correto isso?
				break;
			default:
				break;
		}

	}

}
