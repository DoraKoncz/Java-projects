package model;

public class Dado {

	//modificatori di accesso: pubblic, private, niente (package)
	private int facce;//valore di default 0
	private String colore;//valore di default nullo
	
	public Dado() {
		this.facce = 6;
		this.colore = "bianco";
	}//costruttore di default, inizia per lettera maiuscola (solo in questo caso): si deve chiamare come la classe
	
	public Dado(int facce, String colore) {//new Dado(6, "bianco"); costruttore non deve tornare
		this.facce = facce;//this.facce per specificare a quale ci si riferisce
		this.colore = colore;
	}
	
	public int lancia() {
		
		double casual = Math.random();//val casuale tra (0.0 < 1.0)
		
		//6 facce 1-6   (casuale * facce) + 1 = (1 - 6)
		int res = (int)(Math.random() * facce) + 1; //=(int) si rafforza per avere dei numeri interi perchè altrimenti dà errore
		return res;
	}
	
}
