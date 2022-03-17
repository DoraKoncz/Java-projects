package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class LeggiDivina {

	public static void main(String[] args) {

		File f = new File("files/divina.txt");
		ArrayList<String> tutteLeParole = new ArrayList<String>();
		TreeSet<String> singoleParole = new TreeSet<String>();
		try {
			Scanner sc = new Scanner(f);

			while (sc.hasNextLine()) {

				String riga = sc.nextLine();

				String[] parole = riga.split(" ");

				for (String parola : parole) {
					if (parola.length() > 3) {
						parola = parola.replace(';', ' ');
						parola = parola.replace(',', ' ');
						parola = parola.replace(':', ' ');
						parola = parola.replace('.', ' ');
						parola = parola.replace('‘', ' ');
						parola = parola.replace('’', ' ');
						parola = parola.replace('“', ' ');
						parola = parola.replace('?', ' ');
						parola = parola.replace('»', ' ');
						parola = parola.replace('”', ' ');
						parola = parola.replace('!', ' ');
						parola = parola.trim();
						tutteLeParole.add(parola);
						singoleParole.add(parola);
					}
				}
			}

			System.out.println("la divina commedia contiene " + tutteLeParole.size());
			System.out.println("la divina commedia contiene " + singoleParole.size() + " parole singole");
			//double pippo = 72 / 0;

			
			File output = new File("files/divna-pulita.txt");
			PrintWriter pw = new PrintWriter(output);
			
			for (String string : singoleParole) {
				pw.println(string);
			}
			pw.close();
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.err.println("mi dispiace non trovo il file, forse hai scritto male il nome");

		} catch (ArithmeticException e) {
			System.err.println("c'è qualche problema aritmetico");
		}

		System.out.println("istruzioni successive al problema...");

	}

}
