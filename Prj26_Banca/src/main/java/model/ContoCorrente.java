package model;

public class ContoCorrente {
	
	private static int counter = 1;

	private int	numeroConto;
	private Cliente titolare;
	private double saldo;
	
	public ContoCorrente(Cliente c) {

	this.titolare = c;
	this.numeroConto = counter++;
	this.saldo = 0;
	
	}
	
	public void versamento(double denaro) {
		this.saldo += denaro;
	}
	
	public void prelievo(double denaro) {
		if (this.saldo >= denaro) {
			this.saldo -= denaro;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public int getNumeroConto() {
		return numeroConto;
	}

	public Cliente getTitolare() {
		return titolare;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContoCorrente [numeroConto=");
		builder.append(numeroConto);
		builder.append(", titolare=");
		builder.append(titolare);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
