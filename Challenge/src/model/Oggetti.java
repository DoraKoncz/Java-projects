package model;

public class Oggetti {

	private String descrizione;
	private double peso;

	public Oggetti(String descrizione, double peso) {
		this.descrizione = descrizione;
		this.peso = peso;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

//	public void setDescrizione(String descrizione) {
//		this.descrizione = descrizione;
//	}

	public double getPeso() {
		return this.peso;
	}

//	public void setPeso(double peso) {
//		this.peso = peso;
//	}

}
