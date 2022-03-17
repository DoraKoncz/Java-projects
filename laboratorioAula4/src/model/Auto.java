package model;

public class Auto extends VeicoloTargato{

	private TipoAuto tipoAuto;
	
	
	public Auto(String targa) {
		super(targa);
		this.tipo = TipoVeicolo.BARCA;
		this.tipoPatente = TipoPatente.B;
		this.prezzo = getPrezzoCasuale();
	}

	@Override
	public double getCostoNoleggio() {		
		return getPrezzoVendita() / tipo.getFattore();
	}

	@Override
	public double getPrezzoVendita() {
		return prezzo *1.22 + 15000;
	}
	
}
