package lab03;

import java.util.ArrayList;

public class ProvaArrayList {

	public static void main(String[] args) {
		
		ArrayList<Studente> studenti = new ArrayList<Studente>();
		
		
		
			studenti.add(	new Studente("Daniele Sudosi"));//non metto più il numero di matricola
			studenti.add(	new Studente("Simone Sudosi"));
			studenti.add(	new Studente("Matteo Gamba"));
			studenti.add(	new Studente("Dora Koncz"));
			studenti.add(	new Studente("Aurora Esposito"));
//			studenti.add(new Studente());
//			studenti.get(5).setMatricola(6);
//			studenti.get(5).setNome("Pippo");
			studenti.add(new Studente("Giovanni"));
			
		
			for (Studente studente : studenti) {
				System.out.println(studente);
			
			
			}	
			
		

	}

}
