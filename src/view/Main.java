package view;

import java.util.ArrayList;

import model.Croupier;
import model.Player;

import controller.BlackJackController;

public class Main {
	public static void main(String[] args) {
		Croupier croupier = Croupier.getInstance("Croupier", 1000, 2);
		ArrayList<Player> listaJogadores = new ArrayList<Player>();
		
		BlackJackController BJController = BlackJackController.getInstance(croupier, listaJogadores);
		
	}
}
