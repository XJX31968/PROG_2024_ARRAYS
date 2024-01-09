package vectores;

import java.util.Arrays;

public class Start {

	public static void main(String[] args) {
		
		int temperaturas[] = new int[10];
		temperaturas[4] = 2;
		temperaturas[0] = 20;
		temperaturas[2] = 10;
		temperaturas[1] = 23;
		
		String miArray = Arrays.toString(temperaturas);
		System.out.println(miArray);
		System.out.println(temperaturas.length);
		
	}

}
