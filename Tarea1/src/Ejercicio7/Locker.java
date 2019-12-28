package Ejercicio7;

public class Locker {

		public static void abrirCasilleros(boolean[] array) {
			for (int i = 0; i < array.length; i++) {
				array[i] = true;
			}
		}

		public static void alternarCasilleros(boolean[] array) {
			for (int multiplo = 2; multiplo <= 100; multiplo++) {
				for (int i = 0; i < array.length; i++) {
					if ((i + 1) % multiplo == 0) {
						array[i] = !array[i];
					}
				}
			}
		}

		public static int contarCasilleros(boolean[] array) {
			int cont = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i]) {
					cont++;
				}
			}
			return cont;
		}

		public static void main(String[] args) {

			// abierto = true
			// cerrado = false

			boolean casilleros[] = new boolean[100];

			abrirCasilleros(casilleros);
			alternarCasilleros(casilleros);

			for (int i = 0; i < casilleros.length; i++) {
				if (casilleros[i]) {
					System.out.printf("\n El casillero %s esta abierto", i + 1);
				} else
					System.out.printf("\n El casillero %s esta cerrado", i + 1);
			}
			System.out.printf("\n La cantidad de casilleros abiertos es: %s", contarCasilleros(casilleros));
		}
}