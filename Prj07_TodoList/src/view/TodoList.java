package view;//interfaccia

import java.util.Scanner;

import controller.TodoCtrl;

public class TodoList { // programma parte

	private Scanner scanner;
	private TodoCtrl controller;

	public TodoList() {
		this.scanner = new Scanner(System.in);
		this.controller = new TodoCtrl();
	}

	public static void main(String[] args) {

		// TodoCtrl controller = new TodoCtrl();
		TodoList tl = new TodoList();//viene inizializzato un nuovo contenitore da 10 posizioni

		boolean continua = true;

		while (continua) {

			tl.stampaMenu();

			int scelta = tl.leggiSceltaUtente();

			switch (scelta) {
			case 1:
				// aggiungere todo
				System.out.println("Per aggiungere un nuovo todo, inserisci una stringa descrizione");
				String desc = tl.scanner.next();
				System.out.println("inserisci la posizione della nota");
				int pos = tl.scanner.nextInt();
				tl.controller.addTodo(desc, pos);
				break;

			case 2:
				// completare todo
				System.out.println("Per completare un todo, scrivi il numero intero del todo");
				int pos2 = tl.scanner.nextInt();
				tl.controller.comleta(pos2);
				break;

			case 3:
				// stampa lista todo
				System.out.println("Elenco dei todo disponibili");
				tl.controller.stampaLista();
				break;

			case 0:
				continua = false;
					System.out.println("Exit");
					break;
				}

			}
		System.out.println("Grazie per aver usato il nostro softwar");
		}

//		tl.controller.addTodo("pane", 0);
//		tl.controller.addTodo("vino", 1);
//		tl.controller.addTodo("acqua", 2);
//		tl.controller.addTodo("biscotti", 3);
//		
//		tl.controller.comleta(1);
//		
//		tl.controller.stampaLista();




	private int leggiSceltaUtente() {
		System.out.println("Inserisci un numero intero");
		return this.scanner.nextInt();
	}

	private void stampaMenu() {
		System.out.println("1) Aggiungi todo");
		System.out.println("2) Completa todo");
		System.out.println("3) Stampa elenco todo");
		System.out.println("0) Esci");

	}

}
