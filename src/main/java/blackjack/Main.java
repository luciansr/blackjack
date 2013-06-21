package main.java.blackjack;


import java.util.ArrayList;

import view.BlackJackView;

import controller.BlackJackController;

import model.Agente;
import model.Croupier;
import model.Player;


public class Main {
	private static final int DINHEIRO = 1000;
	
	public static void main(String[] args) { 

		BlackJackView view = new BlackJackView(); /*
		Croupier croupier = Croupier.getInstance("Croupier", DINHEIRO, 2);

		
		ArrayList<Player> listaJogadores = new ArrayList<Player>();
		
		listaJogadores.add(new Agente("AgenteDesenteligente1", DINHEIRO));
		listaJogadores.add(new Agente("AgenteDesenteligente2", DINHEIRO));
		listaJogadores.add(new Agente("AgenteDesenteligente3", DINHEIRO));
		
		BlackJackController BJController = BlackJackController.getInstance(croupier, listaJogadores, view);
		
		BJController.start();                 */
		
		view.setVisible(true);	
	}
}
