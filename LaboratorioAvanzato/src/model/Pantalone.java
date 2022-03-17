package model;

public class Pantalone extends CapoAbbogliamento {

	public Pantalone(String descrizione, Taglia taglia) {
		this.descrizione = descrizione;
		this.taglia = taglia;
		this.sigla = "P000-" + this.codArt;
	}
	
	
	
}
