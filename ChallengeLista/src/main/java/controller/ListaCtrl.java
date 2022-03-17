package controller;

import java.util.ArrayList;

import model.Lista;

public class ListaCtrl {
	

	private static ArrayList<Lista> lista = new ArrayList<>();
	
	public ListaCtrl() {
		
		
	}
	
	public static void addLista(String lista) {
		Lista temp = new Lista(lista);
		
		
		lista.add(temp);
	}


	
	public static ArrayList<Lista> getLista() {
		return lista;
	}
	
	public void stampaLista() {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) != null);
			
			if (lista.get(i).isCompleto())
				System.out.print("[*]");
			
			else
				System.out.print("[]");
			
			System.out.println(lista.get(i).getLista());
		}
	}
	
}
