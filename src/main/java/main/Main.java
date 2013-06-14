package main.java.main;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import main.java.controller.BlackJackController;
import main.java.model.Agente;
import main.java.model.Carta;
import main.java.model.Croupier;
import main.java.model.Player;
import main.java.view.BlackJackView;


public class Main {
	private static final int DINHEIRO = 1000;
	
	public static void main(String[] args) { 

		BlackJackView view = new BlackJackView();
		Croupier croupier = Croupier.getInstance("Croupier", DINHEIRO, 2);

		
		ArrayList<Player> listaJogadores = new ArrayList<Player>();
		
		listaJogadores.add(new Agente("AgenteDesenteligente1", DINHEIRO));
		listaJogadores.add(new Agente("AgenteDesenteligente2", DINHEIRO));
		listaJogadores.add(new Agente("AgenteDesenteligente3", DINHEIRO));
		
		BlackJackController BJController = BlackJackController.getInstance(croupier, listaJogadores, view);
		
		BJController.start();
		
	}
}
