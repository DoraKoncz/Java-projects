package model;

public class Lista {
	
	private static int counter = 1;
	
	private String lista;
	
	private boolean completo;
	private int id;
	
	public Lista(String lista) {
		this.completo = false;
	
		this.lista = lista;
		this.id = counter++;
	}
	


	public String getLista() {
		return lista;
	}



	public void setLista(String lista) {
		this.lista = lista;
	}






	public boolean isCompleto() {
		return completo;
	}



	public void setCompleto(boolean completo) {
		this.completo = completo;
	}



	/*
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Lista [lista=");
		builder.append(lista);
		builder.append(", descrizione=");
		builder.append(descrizione);
		builder.append(", completo=");
		builder.append(completo);
		builder.append(", id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}
*/

	
	
	
}

