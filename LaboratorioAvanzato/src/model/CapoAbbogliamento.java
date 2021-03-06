package model;

public abstract class CapoAbbogliamento {
	
	protected static int counter = 1;
	
	protected int codArt;
	protected String descrizione;
	protected Taglia taglia;
	
	protected String sigla;
	
	public CapoAbbogliamento() {
		this.codArt = counter++;
	}
	
	public int getCodArt() {
		return codArt;
	}
	
	public String getDescrizione() {
		return descrizione;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
	
		builder.append(sigla);
		builder.append(" - ");
		
		builder.append(descrizione);
		builder.append(" - taglia:");
		builder.append(taglia + " (" +taglia.getNumero() + ")");
		builder.append("]");
		return builder.toString();
	}
	
	

}
