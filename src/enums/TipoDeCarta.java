package enums;

public enum TipoDeCarta {
	REI(10), RAINHA(10), VALETE(10), NOVE(9), OITO(8), SETE(7), SEIS(6), CINCO(5), QUATRO(4), TRES(3), DOIS(2), AS(11);
	
	private int valor;
	
	public int getValor() {
		return valor;
	}
	
	private TipoDeCarta(int valor) {
		this.valor = valor;
	}
}
