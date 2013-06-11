package controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.TODO;

import model.*;

public class BlackJackController {
	Scanner in = new Scanner(System.in);
	
	private ArrayList<Player> listaJogadores;
	
	public BlackJackController(ArrayList<Player> listaJogadores) {
		this.listaJogadores = listaJogadores;
	}
	
	private void mostraJogo() {
		for (Player jogador : listaJogadores) {
			System.out.println("Jogador: '" + jogador.getNome() + "." ); 
			//TODO definir como mostrar na tela
		}

	}
	
	public void start() {
		while(true) {
			
			for (Player player : listaJogadores) {
				mostraJogo();
				player.play();
			}
		}
	}

}
