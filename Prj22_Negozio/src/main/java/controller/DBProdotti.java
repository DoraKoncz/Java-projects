package controller;

public class DBProdotti {
	private static List<Prodotto> prodotti = new ArrayList();
	
	//blocco inizializzazione
	static
	{
		prodotti.add(new Prodotto("alici salate", 5));
		prodotti.add(new Prodotto("baccala", 20));
		prodotti.add(new Prodotto("pesce spada", 40));
		prodotti.add(new Prodotto("ostriche", 30));
		prodotti.add(new Prodotto("salmone", 10));
		prodotti.add(new Prodotto("champagne", 15));
	}

	public static List<Prodotto> getProdotti() {
		return prodotti;
	}

}
