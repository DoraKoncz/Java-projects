package model;

public class Fattorino extends Dipendente {
	
	public double pagaBase;
	private int consegne;
	private double pagaConsegne;

	public Fattorino(String nome, String cognome) {
		super(nome, cognome);
		this.pagaBase = 20;
		this.pagaConsegne = 3;

	}
	

	public void setConsegne(int consegne) {
		this.consegne = consegne;
	}



	@Override
	public double calcolaStipendio() {
		return this.pagaBase + (this.consegne * this.pagaConsegne);
	}

}
