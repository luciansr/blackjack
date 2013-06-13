package main.java.view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import main.java.controller.BlackJackController;
import main.java.model.Agente;
import main.java.model.Carta;
import main.java.model.Croupier;
import main.java.model.Player;


public class Main {
	private static final int DINHEIRO = 1000;
	
	public static void main(String[] args) { 
		Croupier croupier = Croupier.getInstance("Croupier", DINHEIRO, 2);

		
		ArrayList<Player> listaJogadores = new ArrayList<Player>();
		
		listaJogadores.add(new Agente("AgenteDesenteligente", DINHEIRO));
		
		BlackJackController BJController = BlackJackController.getInstance(croupier, listaJogadores);
		
		//BJController.start();
		
	}
}
