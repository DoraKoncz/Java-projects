package model;//proprietÓ dell'oggetto

public class Todo {

	private boolean completo;
	private String descrizione;
	
	public Todo(String descrizione) {//new Todo("pane") new Todo("vino")
		this.descrizione = descrizione;	//descrizione di questa nota
		this.completo = false;
	}

	

	//getters (ottenere dati) setters (modificare)
	public boolean isCompleto() {
		return completo;
	}

	public void setCompleto(boolean completo) {
		this.completo = completo;
	}

	//getters
	public String getDescrizione() {
		return descrizione.toUpperCase();
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}



	@Override
	public String toString() {
		return "Todo [completo=" + completo + ", descrizione=" + descrizione + "]";
	}
	
	
	
	
}
