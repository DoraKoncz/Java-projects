package model;

public class Dono {
	
	private String descrizione;
	private double peso;
	
	public Dono(String descrizione, double peso) {
		this.descrizione = descrizione;
		this.peso = peso;
	}
	
	public String etichetta() {
		return this.descrizione + " " + this.peso;
	}
	//per estrarlo dal privato i dati ma per far vedere al pubblico il metodo, peso non si può modificare dall'esterno
	public double getPeso() {
		return this.peso;
	}

}
