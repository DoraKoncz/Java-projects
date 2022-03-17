package model;

public class Studente { //extends Object non lo mettiamo perchè è sottinteso
	// in genere nel model è sempre private (db)
	private int nMat;
	private String nome;
	private String cognome;
	
	private static int matricolatore = 1; //int perchè il numero che diamo che facciamo partire la numerazione è 1, un numero intero
	
	public Studente(String nome, String cognome) {
		super(); // chiama la super classe
		this.nMat = matricolatore++;
		this.nome = nome;
		this.cognome = cognome;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getnMat() {
		return nMat;
	}
	//Classe che costruisce stringhe
	@Override //se commento tutto mi mette con il codice
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Studente [nMat=");
		builder.append(nMat);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", cognome=");
		builder.append(cognome);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	

}
