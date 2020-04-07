package gugudan;

import java.util.ArrayList;

public class Gugudan {
	public static ArrayList<Integer> array = new ArrayList<Integer>();
	public static ArrayList<Integer> calculate(int first, int second) {
		for (int i=2; i<= first; i++) {
			for (int j=1; j <= second; j++) {
			array.add(i*j);
			
			}
		}
		
		return array;
	}
	
	
}

			
