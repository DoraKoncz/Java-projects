package view;

import java.util.Scanner;

import controller.OggettiCtrl;

public class DemoZaino {

	private Scanner scanner;
	private OggettiCtrl controller;
	
	public DemoZaino() {
		this.scanner = new Scanner(System.in);
		this.controller = new OggettiCtrl();
	}
	
	public static void main(String[] args) {
		DemoZaino dz = new DemoZaino();
		
		boolean continua = true;

		while (continua) {
			
			dz.stampaElenco();
			
			int scelta = dz.leggisceltaUmano();
			
			switch (scelta) {
			case 1:
				System.out.println("Aggiungi il nome dell'oggetto.");
				String desc = dz.scanner.next();
				System.out.println("Indica la posizione in cui mettere l'oggetto");
				int pos = dz.scanner.nextInt();
				dz.controller.aggiungiOggetti(desc, pos);
				break;
				
			case 2:
				// completare todo
				System.out.println("Per completare un todo, scrivi il numero intero del todo");
				int pos2 = dz.scanner.nextInt();
				
				break;
			}
			
		}

		

	}

	private int leggisceltaUmano() {
		System.out.println("Inserisci un numero intero");
		return this.scanner.nextInt();
		
	}

	private void stampaElenco() {
		System.out.println("1) Aggiungi nuovo zaino");
		System.out.println("2) Aggiungi oggetti nello zaino");
		System.out.println("3) Stampa contenuto dello zaino");
		System.out.println("4) Stampa peso dello zaino");
		System.out.println("5) Esci dal programma");
	}
		
		
	}


