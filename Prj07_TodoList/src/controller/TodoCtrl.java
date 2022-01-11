package controller;

import model.Todo;

public class TodoCtrl {//modo con cui controllo il model
	
	private Todo[] spesa;

	public TodoCtrl() {//inizializzo
		this.spesa = new Todo[10];
		System.out.println("hai costruito un controller");
	}
	
	public void addTodo(String desc, int pos) {
		
		Todo temp = new Todo(desc); //temp riferimento temporaneo di Todo
		this.spesa[pos] = temp;
		
	}
	
	public void stampaLista() {
		
		for (int i = 0; i < spesa.length; i++) {
			
			if (spesa[i] != null) {
				
				if (spesa[i].isCompleto())
					System.out.print("[*]"); //altrimenti conln manda a capo
				else
					System.out.print("[]");
				
				System.out.println(spesa[i].getDescrizione());
			}
			
		}
	}	
		
		
public void comleta(int pos) {
			
			if (this.spesa[pos] != null) {
				this.spesa[pos].setCompleto(true);
			}
		
	}
	
	
	
	

}
