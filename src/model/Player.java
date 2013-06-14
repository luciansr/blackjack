package model;

import java.util.ArrayList;




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
	
	
	public int getPontos() {
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

	public void doubleDown(Croupier croupier) {
		recebeCarta(croupier);
		apostaAtual += apostaAtual;
		
	}
	/**
	 * Realiza a acao de hit, recebendo uma carta e verificando o estouro
	 * @param croupier
	 * @return retorna false se passar de 21
	 */
	public boolean hit(Croupier croupier ) {
		recebeCarta(croupier);
		if(getPontos() > 21){
			//System.out.println(getPontos());
			System.out.println("Estorou");
			return false;
		}
		return true;
		
	}
	
	public void stand(){
		//TODO
	}

	public void surrender() {
		dinheiro -= apostaAtual/2;
		//TODO falar que a rodada acabou
	}
	
	/**
	 * Método que retira cartas do topo do baralho e dá para o player
	 * @author Augusto
	 * @param Croupier, com seu baralho
	 */
	public void recebeCarta(Croupier croupier) {
		// TODO SÓ PODER TIRAR A CARTA SE AINDA TIVER CARTA NO BARALHO

		if(croupier.temCartas()){
			Carta carta = croupier.daCarta();
			cartasNaMao.add(carta);
		}
		else{
			croupier.cartasAcabaram();
			
		}
	}
	

	public void mostraJogo() {
			
			System.out.println("Jogador: " + getNome() + "." );
			for (Carta carta : cartasNaMao) {
				System.out.println(carta);
			}
			
			//TODO definir como mostrar na tela

	}

}
