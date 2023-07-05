package fatorial;

public class CalculaFatorial {

	public long calculaFatorial(int numero) {

		if (numero < 0) {
			throw new IllegalArgumentException("O número não pode ser negativo.");
		}

		long fatorial = 1;

		for (int i = 1; i <= numero; i++) {
			fatorial = fatorial * i;
		}

		return fatorial;
	}
}
