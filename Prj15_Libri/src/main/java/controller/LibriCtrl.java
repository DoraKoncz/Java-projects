package controller;

import java.util.ArrayList;

import model.Libro;

public class LibriCtrl {
	
	private ArrayList<Libro> libri;

	public LibriCtrl() {
		this.libri = new ArrayList<Libro>();
		
		init();
		
	}
	
	public void init() {
		this.libri.add(new Libro("Vita", 15));
		this.libri.add(new Libro("Bici", 10));
		this.libri.add(new Libro("Harry Potter", 30));
		this.libri.add(new Libro("Casper", 13));
		this.libri.add(new Libro("Mappa", 8));
	}

	public void addLibro(String titolo, double prezzo) {
		
		Libro l = new Libro( titolo, prezzo);
		
		this.libri.add(l);
		
		
	}
	
	public ArrayList<Libro> getLibri() {
		return libri;
	}
	
}
