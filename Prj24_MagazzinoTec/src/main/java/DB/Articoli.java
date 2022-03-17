package DB;

import java.util.HashMap;
import java.util.Map;

import model.Articolo;

public class Articoli {

	private static Map<Integer, Articolo> ALL = new HashMap<>();

	static {// non esiste this.

		String[] tech = { "Monitor", "Telefono", "Computer", "Tastiera", "Mouse", "Stampante", "Scanner" };

		for (String art : tech) {// per ogni ciclo fai qualcosa
			Articolo a = new Articolo(art, 100); // ogni volta che c'è un nuovo ciclo inserisco nella map
			ALL.put(a.getId(), a);// metto a = articolo nel contenitore Id
		}
		
		
		
	}

	public static Map<Integer, Articolo> getALL() {
		return ALL;
	}

}
