package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.json.JSONArray;
import org.json.JSONObject;

import controller.CapiCtrl;
import model.Maglia;
import model.Pantalone;
import model.Taglia;

public class ProvaCapiAbbiagliamento {

	public static void main(String[] args) throws FileNotFoundException {
		
		CapiCtrl ctrl = new CapiCtrl();
		
		ctrl.addMAglia(new Maglia("Maglia verde", Taglia.M));
		ctrl.addPantalone(new Pantalone("Pantalone classico", Taglia.XL));
		System.out.println("maglie---------------------");
		JSONArray array = new JSONArray();
		for (Maglia m : ctrl.getMaglie()) {
			JSONObject obj = new JSONObject(m);
			array.put(obj);
			System.out.println(m);
		}
		System.out.println("pantaloni------------------");
		ctrl.getPanloni().forEach(System.out::println);
		
		System.out.println("JSON-----------------------");
		System.out.println(array.toString());
		
		PrintWriter pw = new PrintWriter(new File("files/maglie.json"));
		
		array.forEach(m -> pw.println(m));
		pw.close();
		
	}

}
