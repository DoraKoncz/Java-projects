package model;

public class Libro extends Pubblicazione implements Comparable<Libro>, Volante {
	
	private String titolo;
	private double prezzo;
	private int pagine;
	public Libro(String titolo, double prezzo, int pagine) {
		this.titolo = titolo;
		this.prezzo = prezzo;
		this.pagine = pagine;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public int getPagine() {
		return pagine;
	}
	public void setPagine(int pagine) {
		this.pagine = pagine;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Libro [titolo=");
		builder.append(titolo);
		builder.append(", prezzo=");
		builder.append(prezzo);
		builder.append(", pagine=");
		builder.append(pagine);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int compareTo(Libro altro) { //comparTo del metodo
		//ordinate per prezzo
		int i = 0;
		
		if (this.prezzo - altro.prezzo > 0) {
			i = 1;
		} else if (this.prezzo - altro.prezzo < 0) {
			i = -1;
		}
		
		return i;
		//ordinate per n pagine
		//return this.pagine - altro.pagine;
		//ordinate per titolo
		//return this.titolo.compareTo(altro.titolo); //compareTo delle stringhe
	}
	@Override
	public double annoPub() {
		
		return 0;
	}
	@Override
	public void vola() {
		System.out.println("Se non ti è piaciuto, puoi lasciarlo e così vola!");
		
	}
	
	
	

}
