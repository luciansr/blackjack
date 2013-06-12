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
	
	@Override
	public String toString() {
		switch (this) {
		case REI: 		return "Rei";
		case RAINHA: 	return "Rainha";
		case VALETE: 	return "Valete";
		case NOVE: 		return "Nove";
		case OITO:	 	return "Oito";
		case SETE: 		return "Sete";
		case SEIS: 		return "Seis";
		case CINCO: 	return "Cinco";
		case QUATRO: 	return "Quatro";
		case TRES: 		return "Três";
		case DOIS: 		return "Dois";
		case AS: 		return "Ás";

		default: 		return null;
			
		}
		
	}
}
