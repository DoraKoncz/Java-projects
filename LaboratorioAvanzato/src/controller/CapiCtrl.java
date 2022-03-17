package controller;

import java.util.ArrayList;
import java.util.List;

import dal.CapoDAO;
import dal.CapoDAOImpl;
import model.CapoAbbogliamento;
import model.Maglia;
import model.Pantalone;

public class CapiCtrl {
	
	private CapoDAO capi;

	public CapiCtrl() {
		this.capi = new CapoDAOImpl();
	}
	
	public void addMAglia(Maglia m) {
		this.capi.addCapo(m);
	}
	
	public void addPantalone(Pantalone p) {
		this.capi.addCapo(p);
	}
	
	public Pantalone getPantalone(int codArt) {
		if (this.capi.getCapo(codArt) instanceof Pantalone)
			return (Pantalone) this.capi.getCapo(codArt);
		return null;
	}

	public Maglia getMaglia(int codArt) {
		if (this.capi.getCapo(codArt) instanceof Maglia)
			return (Maglia) this.capi.getCapo(codArt);
		return null;
	}
	
	public List<Pantalone> getPanloni(){
		
		List<Pantalone> pantaloni = new ArrayList<>();
		for (CapoAbbogliamento capo : this.capi.getCapi()) {
			if (capo instanceof Pantalone)
				pantaloni.add((Pantalone) capo);
		}
		return pantaloni;
	}
	public List<Maglia> getMaglie(){
		
		List<Maglia> maglie = new ArrayList<>();
		for (CapoAbbogliamento capo : this.capi.getCapi()) {
			if (capo instanceof Maglia)
				maglie.add((Maglia) capo);
		}
		return maglie;
	}
	
}
