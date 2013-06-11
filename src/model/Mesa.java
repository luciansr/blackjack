package model;

public final class Mesa {
    private static final Mesa INSTANCE = new Mesa();
    private int valorApostaAtual = 0;
    private int apostaMinima = 5;
    private int dinheiroApostaAtual = 0;

    private Mesa() {

    }
    
    public int getValorApostaAtual() {
		return valorApostaAtual;
	}
    
    public int getApostaMinima() {
		return apostaMinima;
	}
    
    public int getDinheiroApostaAtual() {
		return dinheiroApostaAtual;
	}
    
    public void adicionarAposta(int quantidade) {
    	dinheiroApostaAtual += quantidade;
	}

    public static synchronized Mesa getInstance(){
          return INSTANCE;
    }

	public void pagaMetade(int quantidade) {
		dinheiroApostaAtual -= quantidade/2;
		
	}
}
