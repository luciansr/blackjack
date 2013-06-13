package view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import model.Agente;
import model.Carta;
import model.Croupier;
import model.Mesa;
import model.Player;

import controller.BlackJackController;

public class Main {
	private static final int DINHEIRO = 1000;
	
	public static void main(String[] args) { 
		Croupier croupier = Croupier.getInstance("Croupier", DINHEIRO, 2);
		Mesa mesa = Mesa.getInstance();
		
		ArrayList<Player> listaJogadores = new ArrayList<Player>();
		
		listaJogadores.add(new Agente("AgenteDesenteligente", DINHEIRO));
		
		BlackJackController BJController = BlackJackController.getInstance(mesa, croupier, listaJogadores);
		
		BJController.start();
		
		//augusto noob, teste
		
		//teste teste
			
	}
}
