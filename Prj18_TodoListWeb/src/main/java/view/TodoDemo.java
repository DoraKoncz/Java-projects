package view;

import java.util.Scanner;

import controller.TodoCtrl;
import model.Todo;

public class TodoDemo {

	public static void main(String[] args) {
		
		TodoCtrl ctrl = new TodoCtrl();
		
		String azione = "";
		
		switch(azione) {
		case "aggiungi":
			//chiedi all'utente una Stringa
			String s = chiediUtente();
			//con quella stringa crea il todo e inseriscilo
			ctrl.addTodo(s);
			break;
		
		case "show":
			//vedi l'elenco completo dei todo
			for (Todo df : ctrl.getTodos()) {
				System.out.println(df);
			}
			break;
		case "show_comp":
			//vedere solo i todo completi
			for (Todo df : ctrl.getTodos()) {
				if (df.isDone()==true)			
				System.out.println(df);
			}
			break;
		}
		//completa un todo in base alla posiz/id
		int del = chiediUtenteQuale();
		//vedere solo i todo completi
		for (Todo df : ctrl.getTodos()) {
			if (df.isDone()==true)
			System.out.println(df);
		}
			
//		//vedere solo i todo da completare
//		ctrl.completeTodo(1);
//		
//		ctrl.addTodo("latte");
//		ctrl.addTodo("pane");
//		ctrl.addTodo("vino");
//		ctrl.addTodo("aceto");
//		ctrl.addTodo("mele");
//		
//		Todo t = new Todo("biscotti");
//		
//		ctrl.addTodo(t);
//		
//		ctrl.completeTodoById(0);
//		ctrl.addTodo(new Todo("prezzemolo"));
			
	}

	private static int chiediUtenteQuale() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quale todo vuoi completare:");
		return sc.nextInt();
	}

	private static String chiediUtente() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cosa da fare:");
		sc.close();
		return sc.next();
	}

}
