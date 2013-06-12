package enums;

public enum Naipe {
	OURO, PAUS, ESPADA, COPAS;
	
	@Override
	public String toString() {
		switch (this) {
		case OURO: 		return "Ouro";
		case PAUS: 		return "Paus";
		case ESPADA: 	return "Espada";
		case COPAS: 	return "Copas";

		default: 		return null;
			
		}
		
	}
}
