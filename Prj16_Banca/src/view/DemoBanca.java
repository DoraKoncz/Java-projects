package view;

import controller.GestioneConti;
import model.Cliente;
import model.ContoCorrente;

public class DemoBanca {

	public static void main(String[] args) {
	
		GestioneConti gc = new GestioneConti();
		
		gc.addCliente("Christian", "De La Fuente", "1999-05-31");
		
		Cliente c = gc.getCliente("Christian", "De La Fuente");
		
		gc.apriConto(c);
		
		ContoCorrente conto = gc.getConto(1); //Ctrl + shift + l
		
		gc.faiVersamento(100, conto);
		gc.faiVersamento(200, conto);
		gc.faiVersamento(400, conto);
		gc.faiPrelievo(50, conto);
		System.out.println(conto);
	
	}

}
