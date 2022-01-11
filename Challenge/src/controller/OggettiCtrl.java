package controller;

import model.Oggetti;
import model.Zaino;

public class OggettiCtrl {

	Oggetti oggetto;
	Zaino zaino;

	public void aggiungiOggetti(String descrizione, double peso) {
		oggetto = new Oggetti(descrizione, peso);

	}

	public Oggetti getOggetto() {
		return oggetto;
	}

	public void aggiungiOggettiAlZaino(int pos) {
		this.zaino.getOggetti()[pos] = this.oggetto;
	}

	public void aggiungiOggettiAlzaino() {
		int pos = primaPosizioneLibera();
		if (pos > -1) {
			this.zaino.getOggetti()[pos] = this.oggetto;
		} else {
			System.out.println("Non c'è posto nello zaino");
		}

	}

	private int primaPosizioneLibera() {
		for (int i = 0; i < zaino.getOggetti().length; i++) {
			if (zaino.getOggetti() [i] == null) {
				return i;
			}
		}
		return -1;
	}

}
