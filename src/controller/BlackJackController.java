package controller;

import java.util.ArrayList;
import java.util.Scanner;

import enums.Acao;

import model.*;

public final class BlackJackController {
	private static BlackJackController INSTANCE = null;
	
	private Croupier croupier;
	private ArrayList<Player> listaJogadores;
	
	Scanner in = new Scanner(System.in);
	
	private BlackJackController(Croupier croupier, ArrayList<Player> listaJogadores) {
		this.listaJogadores = listaJogadores;
		
		this.croupier = croupier; 
	}
	
    public static synchronized BlackJackController getInstance(Croupier croupier, ArrayList<Player> listaJogadores){
        if (INSTANCE == null) {
        	INSTANCE = new BlackJackController(croupier, listaJogadores);
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

	private void mostraJogo() {
		for (Player jogador : listaJogadores) {
			System.out.println("Jogador: '" + jogador.getNome() + "." ); 
			//TODO definir como mostrar na tela
		}

	}
	
	private void daCartaPara(Player player){
		if (croupier.temCartas()) player.recebeCarta(croupier.daCarta());
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
