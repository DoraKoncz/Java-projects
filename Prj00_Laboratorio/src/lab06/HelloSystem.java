package lab06;

import java.util.Properties;

public class HelloSystem {

	public static void main(String[] args) {
	
		
		String property = System.getProperty("java.vendor");
		System.out.println(property);
		
		//tutte le proprietà
		Properties properties = System.getProperties();//proprerties di tipo proprerties
		
		properties.list(System.out);
	}

}
