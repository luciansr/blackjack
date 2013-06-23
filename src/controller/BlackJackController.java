package controller;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Semaphore;

import enums.Acao;

import view.BlackJackView;

import model.Croupier;
import model.Player;

public final class BlackJackController {
	private static BlackJackController INSTANCE = null;
	
	private BlackJackView view = null;
	
	private Croupier croupier;

	private ArrayList<Player> listaJogadores;
	
	private	int numeroDeCartasIniciais = 2;
	Scanner in = new Scanner(System.in); //TODO retirar após debugs e utilizacao
	
	private ArrayList<Acao> listaDeComandos = new ArrayList<Acao>();
	
	private BlackJackController( Croupier croupier, ArrayList<Player> listaJogadores) {
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
	
	public void start() { /*
		while(croupier.getBaralho().size() != 0 ){ //TODO, MODIFICAR QUANDO ACABA O JOGO

			//RECEBE AS CARTAS NO COMEÇO DE CADA RODADA
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
						//TODO FAZER OUTRAS AÇÕES
					}
					
				}
				
			}
		}*/
		

	}
	




	private void fimRodada(){
		//TODO define o fim da rodada, zera as apostas, remove as cartas das mãos dos jogadores
		
	}


	public void setView(BlackJackView view) {
		this.view = view;
	}

}
