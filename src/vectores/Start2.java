package vectores;

import java.util.Arrays;

public class Start2 {

	public static void main(String[] args) {
		
		
		char frase [] = new char[10];
		
		frase[0] = 'h';
		frase[1] = 'o';
		frase[2] = 'l';
		frase[3] = 'a';
		frase[4] = 'm';
		frase[5] = 'u';
		frase[6] = 'n';
		frase[7] = 'd';
		frase[8] = 'o';
		frase[9] = '!';
		
		
		for(int i=frase.length-1;i>=0;i--) {
			System.out.print(frase[i]);
		}
		
		for(char letra:frase) {
			
			System.out.println(letra);
		}

	}

}
