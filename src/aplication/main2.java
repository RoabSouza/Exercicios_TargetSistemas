package aplication;

import java.util.Scanner;

public class main2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("digite sua palavra:");
		String pf = sc.next();

		int cont = 0;

		for (int i = 0; i < pf.length(); i++) {

			char letra = pf.charAt(i);
			if (letra == 'a' || letra == 'A') {
				cont++;
			}

		}

		if (cont > 0) {
			System.out.println("existe a letra 'A' na string e a quantidade é de: " + cont + " Letras");
		} else {
			System.out.println("não existe letra 'A' na frase");
		}
	}

}
