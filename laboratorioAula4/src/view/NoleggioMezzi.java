package view;

import controller.VeicoliNoleggio;

public class NoleggioMezzi {

	public static void main(String[] args) {
		 VeicoliNoleggio ctrlNolo = new VeicoliNoleggio();
		 
		 ctrlNolo.getVeicoliList().stream().forEach(System.out::println);
//		 ctrlNolo.getVeicoliList().stream().forEach(v -> System.out.println(v));

	}

}
