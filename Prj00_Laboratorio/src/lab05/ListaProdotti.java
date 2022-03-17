package lab05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaProdotti {

	public static void main(String[] args) {
		
		List<Prodotto> prodottiList = new ArrayList<Prodotto>();
		
		prodottiList.add(new Prodotto("pigiama", 10, 3));
		prodottiList.add(new Prodotto("maglietta gialla", 12, 2));
		prodottiList.add(new Prodotto("pantaloni verdi", 8, 8));
		prodottiList.add(new Prodotto("pantaloni verdi", 8, 8));
		prodottiList.add(new Prodotto("giacca leopardata", 80, 5));
		prodottiList.add(new Prodotto("cappello cammello", 74, 9));

		Collections.sort(prodottiList);
		
		prodottiList.forEach(p -> System.out.println(p));//lamba expression in javas arrow..
		
//		for (Prodotto prodotto : prodottiList) {
//			System.out.println(prodotto);
//		}
		
	}

}
