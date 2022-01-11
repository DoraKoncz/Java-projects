package model;

public class Quadrato extends Rettangolo {//costruttore NON si fa in modo ereditario
	
	Segmento lato;
	
	public Quadrato(Segmento lato) {
		super(lato, lato);// nel rettangolo non c'è il costruttore di default quindi sono obbligata a mettere super
		this.lato = lato;//quadrato figlio di rettangolo "super"
		
	}

	@Override
	public double perimetro() {
	System.out.println("Stai usando il metodo del quadrato");
		return this.lato.lunghezza() * 4;
	}
	
	
	

}
