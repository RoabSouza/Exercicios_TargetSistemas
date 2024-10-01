package aplication;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe um número: ");
		int num = scanner.nextInt();

		
		if (Ftrue(num)) {
			System.out.println(num + " Faz parte da sequência de Fibonacci.");
		} else {
			System.out.println(num + " não Faz parte da sequência de Fibonacci.");
		}

		scanner.close();
	}

	public static boolean Ftrue(int num) {
		if (num == 0 || num == 1) {
			return true;
		}

		int a = 0;
		int b = 1;
		int next = a + b;

		while (next <= num) {
			if (next == num) {
				return true;
			}
			a = b;
			b = next;
			next = a + b;
		}
		return false;
	}

}
