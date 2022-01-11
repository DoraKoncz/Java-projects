package model;

public class Zaino {
	
	private int id;
	private Oggetti[] oggetti;
	
	public Zaino(int id, Oggetti[] oggetti) {
		this.id = id;
		this.oggetti = new Oggetti[15];
	}

	public int getId() {
		return id;
	}

	public Oggetti[] getOggetti() {
		return oggetti;
	}

	public void setOggetti(Oggetti[] oggetti) {
		this.oggetti = oggetti;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void addOggetto(Oggetto oggetti, int posizione) {
		this.oggetti
	}
	
	
	
	
	

}
