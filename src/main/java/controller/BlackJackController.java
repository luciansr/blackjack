package main.java.controller;

import java.util.ArrayList;
import java.util.Scanner;

import main.java.model.Croupier;
import main.java.model.Player;
import main.java.view.BlackJackView;

public final class BlackJackController {
	private static BlackJackController INSTANCE = null;
	
	private BlackJackView view;
	private Croupier croupier;

	private ArrayList<Player> listaJogadores;
	
	private	int numeroDeCartasIniciais = 2;
	Scanner in = new Scanner(System.in);
	
	private BlackJackController( Croupier croupier, ArrayList<Player> listaJogadores, BlackJackView view) {
		this.listaJogadores = listaJogadores;
		this.view = view;

		
		this.croupier = croupier; 
	}
	
    public static synchronized BlackJackController getInstance(Croupier croupier, ArrayList<Player> listaJogadores, BlackJackView view){
        if (INSTANCE == null) {
        	INSTANCE = new BlackJackController(croupier, listaJogadores, view);
        	return INSTANCE;
        }
        
        return INSTANCE;
    }
	
	public void start() {
		while(croupier.getBaralho().size() != 0 ){ //TODO, MODIFICAR QUANDO ACABA O JOGO

			//RECEBE AS CARTAS NO COME�O DE CADA RODADA
			for(int i = 0; i < numeroDeCartasIniciais ; i++){
				for (Player player : listaJogadores) {
					if(player.getDinheiro() > 0){
						player.recebeCarta(croupier);
						//player.mostraJogo();
					}
				}
			}
			for(Player player : listaJogadores){
				//player.mostraJogo();
				if(player.getDinheiro() > 0){
					//PEDIR ACAO DO JOGADOR
					int acao = in.nextInt();
					switch(acao){
						case 0:
							if(!player.hit(croupier));{
								//TODO FAZ ALGO
								
							}
							player.mostraJogo();
							System.out.println(player.getPontos());
							break;
						//TODO FAZER OUTRAS A��ES
					}
					
				}
				
			}
		}
	}

	public void fimRodada(){
		//TODO define o fim da rodada, zera as apostas, remove as cartas das m�os dos jogadores
		
	}


	

}
