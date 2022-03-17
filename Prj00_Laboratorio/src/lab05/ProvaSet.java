package lab05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ProvaSet {

	public static void main(String[] args) {
		
		Set<String> voti = new HashSet<>();
		Set<String> voti2 = new TreeSet<>();
		Set<String> voti3 = new LinkedHashSet<>();
		
		voti2.add("alfa");
		voti2.add("beta");
		voti2.add("gamma");
		voti2.add("delta");
		voti2.add("ics");
		voti2.add("ipsilon");
		voti2.add("pippo");

		//System.out.println(voti.size()); se ho dei doppi automaticamente mi toglie un doppio
		
		List<String> votiTrasformati = new ArrayList<String>(voti);
		votiTrasformati.add("alfa");
		Set<String> votiRitrasformati = new TreeSet<String>(votiTrasformati);
		
		voti2.forEach(v -> System.out.println(v)); //Seti<Integer>voti.add(1);mette in ordine i numeri
	}

}
