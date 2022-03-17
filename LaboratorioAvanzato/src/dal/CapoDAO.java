package dal;

import java.util.List;

import model.CapoAbbogliamento;

public interface CapoDAO {
	
	void addCapo(CapoAbbogliamento capo);
	CapoAbbogliamento getCapo(int codArt);
	List<CapoAbbogliamento> getCapi();
	void updCapo(CapoAbbogliamento capo);
	void delCapo(int codArt);
	

}
