package enums;

public enum Acao {
	HIT("Hit"), STAND("Stand"), DOUBLEDOWN("DoubleDown"), SURRENDER("Surrender");
	
	private String nome;
	
	private Acao(String nome) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nome;
	}
}
