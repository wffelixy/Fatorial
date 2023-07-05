package fatorial;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número para calcular o fatorial: ");
		int numero = scanner.nextInt();

		CalculaFatorial objCalculaFatorial = new CalculaFatorial();
		long resultado = objCalculaFatorial.calculaFatorial(numero);

		System.out.println("Fatorial de " + numero + " é: " + resultado);
	}
}
