package model;

public class Monopattino extends VeicoloNonTargato{
	
	
	

	public Monopattino() {
		this.tipo = TipoVeicolo.MONO_PATTINO;
		this.prezzo = getPrezzoCasuale();
	}
	
	@Override
	public double getCostoNoleggio() {
		return getPrezzoVendita() / tipo.getFattore();
	}

	@Override
	public double getPrezzoVendita() {
		return prezzo * 1.22;
	}

}
