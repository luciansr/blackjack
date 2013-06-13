package model;

import java.util.ArrayList;

import enums.Acao;

/**
 * Qualquer uma das classes que podem jogar, devem herdar de Player. 
 * @author Lucian
 *
 */
public abstract class Player {
	
	ArrayList<Carta> cartasNaMao;
	
	private int apostaAtual = 0;


	private int dinheiro;
	private String nome;
	
	public Player(String nome, int dinheiro) {
		this.dinheiro = dinheiro;
		this.nome = nome;
		
		cartasNaMao = new ArrayList<Carta>();
	}
	
	public int getDinheiro() {
		return dinheiro;
	}
	
	public abstract Acao play();
	
	protected int getPontos() {
		int pontos = 0;
		
		for (Carta cartaAtual : cartasNaMao) {
			pontos += cartaAtual.getValor();
		}
		
		return pontos;
	}

	public String getNome() {
		return nome;
	}
	
	
	public int getApostaAtual() {
		return apostaAtual;
	}
	
	public void setApostaAtual(int apostaAtual) {
		this.apostaAtual = apostaAtual;
	}

	public void doubleDown(Mesa mesa) {
		mesa.adicionarAposta(apostaAtual);
		apostaAtual += apostaAtual;
		

	}
	
	public void hit(Carta carta) {
		cartasNaMao.add(carta);
		
	}
	
	public void stand(){
		
	}

	public void surrender(Mesa mesa) {
		dinheiro -= apostaAtual/2;
		mesa.pagaMetade(apostaAtual);
		
	}

}
