package model;

public class Barca extends VeicoloTargato{

	public Barca(String targa) {
		super(targa);
		this.tipo = TipoVeicolo.BARCA;
		this.tipoPatente = tipoPatente.B;
		this.prezzo = getPrezzoCasuale();
		
	}

	@Override
	public double getCostoNoleggio() {
		return getPrezzoVendita() / tipo.getFattore();
	}

	@Override
	public double getPrezzoVendita() {
		
		return prezzo * 1.22 + 50000;
	}

}
