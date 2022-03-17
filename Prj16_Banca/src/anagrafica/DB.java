package anagrafica;

import java.util.ArrayList;

import model.Cliente;
import model.ContoCorrente;

public class DB {
	
	private static ArrayList<Cliente> cliente = new ArrayList<Cliente>();
	private static ArrayList<ContoCorrente> conti = new ArrayList<ContoCorrente>();
	
	public void addCliente(Cliente c) {
		this.cliente.add(c);
	}
	
	public void addContoCorrente(ContoCorrente c) {
		this.conti.add(c);
	}
	
	public static ArrayList<Cliente> getCliente() {
		return cliente;
	}
	
	
	public static ArrayList<ContoCorrente> getConti() {
		return conti;
	}
	
	
	
}
