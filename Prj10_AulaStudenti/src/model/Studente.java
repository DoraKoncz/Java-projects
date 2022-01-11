package model;

public class Studente {
	
	private static int contatore = 1;
	private int matricola;
	private String nome;
	private String cognome;
	
//	public Studente() {}
	
	public Studente(String nome, String cognome) {
		this.matricola = contatore++; //prima era = 1000; contatore appartiene alla classe "static"
		this.nome = nome;
		this.cognome = cognome;
	}
	
//	public Studente(int matricola, String nome) {
//		
//		//costruttore
//		this.matricola = matricola;
//		this.nome = nome;
//	}
	//getters and setters
	public int getMatricola() {
		return matricola;
	}
	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	//string
	@Override
	public String toString() {
		return "Matricola: " + matricola + ", " + nome + "";
	}
	
	
	
}
