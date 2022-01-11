package controller;

import java.util.ArrayList;

import model.Todo;

public class TodoCtrl {//modo con cui controllo il model
	
	//private Todo[] spesa; //array di todo
	//nella lista non bisogna posizionare
	private ArrayList<Todo> lista; //= new ArrayList<>(); //tipo del dato messo negli angoli

	public TodoCtrl() {//inizializzo
		System.out.println("hai costruito un controller");
		//this.spesa = new Todo[10];
		this.lista = new ArrayList<>();
	}
	
	public void addTodo(String desc, int pos) {
		
		Todo temp = new Todo(desc); //temp riferimento temporaneo di Todo
		//this.spesa[pos] = temp;
		this.lista.add(temp);//aggiungere il todo alla fine della lista
	}
	
	public void stampaLista() {
		
		for (int i = 0; i < lista.size(); i++) {
			
			if (lista.get(i) != null) {
				
				if (lista.get(i).isCompleto())
					System.out.print("[*]"); //altrimenti conln manda a capo
				else
					System.out.print("[]");
				
				System.out.println(lista.get(i).getDescrizione());
			}
			
		}
	}	
		
		

	
	
	public void comleta(int pos) {
		
		if (this.lista.get(pos) != null) {
			this.lista.get(pos).setCompleto(true);
		}
	}
	

}
