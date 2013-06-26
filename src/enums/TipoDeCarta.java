package enums;

public enum TipoDeCarta {
	REI(10), RAINHA(10), VALETE(10), DEZ(10) ,  NOVE(9), OITO(8), SETE(7), SEIS(6), CINCO(5), QUATRO(4), TRES(3), DOIS(2), AS(11);
	
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
		case DEZ: 		return "Dez";
		case NOVE: 		return "Nove";
		case OITO:	 	return "Oito";
		case SETE: 		return "Sete";
		case SEIS: 		return "Seis";
		case CINCO: 	return "Cinco";
		case QUATRO: 	return "Quatro";
		case TRES: 		return "Tr�s";
		case DOIS: 		return "Dois";
		case AS: 		return "�s";

		default: 		return null;
			
		}
		
	}
	
	public String toStringAbreviado() {
		switch (this) {
		case REI: 		return "K";
		case RAINHA: 	return "Q";
		case VALETE: 	return "J";
		case DEZ: 		return "T";
		case NOVE: 		return "9";
		case OITO:	 	return "8";
		case SETE: 		return "7";
		case SEIS: 		return "6";
		case CINCO: 	return "5";
		case QUATRO: 	return "4";
		case TRES: 		return "3";
		case DOIS: 		return "2";
		case AS: 		return "A";

		default: 		return null;
			
		}
		
	}
}
