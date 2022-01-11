package view;

import controller.RubricaController;
import model.Contatto;

public class RubricaDemo {
	
	public static void main(String[] args) {

		RubricaController ctrl = new RubricaController();
		ctrl.addContatto("Pippo", "3545879614");
		ctrl.addContatto("Pino", "3545648684");
		ctrl.addContatto("Rino", "3545845355");
		ctrl.addContatto("Mimmo", "3547868724");
		ctrl.addContatto("Pippo", "3547862484");
		ctrl.addContatto("Pippo", "3544382345");
		ctrl.addContatto("Pippo", "3558494158");
		ctrl.addContatto("Pippo", "3684894357");
		ctrl.addContatto("Pippo", "3343848418");
		ctrl.addContatto("Daniela", "3684548493");
		ctrl.addContatto("Giulia", "3174845955");
		ctrl.addContatto("Mauro", "3545879613");
		
//		for (int i = 0; i < ctrl.getContatti().length; i++) {
//			System.out.println(ctrl.getContatti()[i]);
//		}
		
		for (Contatto c : ctrl.getContatti()) {//ha solo un verso di scorrimento
			System.out.println(c);
			
		}
	}
}
