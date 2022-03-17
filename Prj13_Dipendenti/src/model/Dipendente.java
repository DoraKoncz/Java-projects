package model;

public abstract class Dipendente {//non posso istaziare oggetti da una classe
	
	private static int counter = 1;
	
	private int matricola;
	private String nome;
	private String cognome;
	
	public Dipendente(String nome, String cognome) {
		this.matricola = counter++;
		this.nome = nome;
		this.cognome = cognome;
	}
	
public abstract double calcolaStipendio();
	
	public int getMatricola() {
		return matricola;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Dipendente [matricola=");
		builder.append(matricola);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", cognome=");
		builder.append(cognome);
		builder.append(", calcolaStipendio()=");
		builder.append(calcolaStipendio());
		builder.append("]");
		return builder.toString();
	}
	
	
}

