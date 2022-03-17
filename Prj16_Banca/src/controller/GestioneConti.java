package controller;

import anagrafica.DB;
import model.Cliente;
import model.ContoCorrente;

public class GestioneConti {
	
	public void apriConto(Cliente c) {//per aprire un conto corrente ho bisogno di un cliente quiindi lo aggiungo
		ContoCorrente cc = new ContoCorrente(c);
		DB.getConti().add(cc);
	}
	
	public void addCliente(String nome, String cognome, String data) {
		Cliente c = new Cliente(nome, cognome, data);
		DB.getCliente().add(c);
	}
	
	public ContoCorrente getConto(int numero) {
		ContoCorrente cc = null;
		for (ContoCorrente conto : DB.getConti()) {
			if(conto.getNumero() == numero) {
				return conto;
			}
		}
		return cc;
	}
	
	public Cliente getCliente(String nome, String cognome) {
		Cliente c = null;
		
		for (Cliente cliente : DB.getCliente()) {
			if(cliente.getNome().equals(nome) && cliente.getNome().equals(cognome)) {
				return cliente;
		}
	}
	
	return c;
	}
	
	public void faiVersamento(double denari, ContoCorrente cc) {
		cc.versamento(denari);
	}
	
	public void faiPrelievo(double denari, ContoCorrente cc) {
		cc.prelievo(denari);
	}
	

}
