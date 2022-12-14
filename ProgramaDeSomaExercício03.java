
package ListaDeExerc?cios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author Renner Alves Martins. Este programa recebe dois valores, calcula a
 *         soma deles e imprime o resultado.
 */

public class ProgramaDeSomaExerc?cio03 {

	public static void main(String[] args) {

		String mensagem = null;
		int numerosCorretos = 0;
		double[] sequenciaNumerica = new double[2];

		while (numerosCorretos != 2) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Insira um n?mero REAL: ");

			try {
				double numero = scanner.nextDouble();
				for (int i = 0; i < sequenciaNumerica.length; i++) {
					if (i == numerosCorretos) {
						sequenciaNumerica[i] = numero;
					}
				}
				numerosCorretos++;
			} catch (InputMismatchException ex) {
				mensagem = ("Erro! Insira um valor v?lido.");
				System.out.println("Se for decimal, fa?a a " + "separa??o das casas decimais com v?rgula.");
				System.out.println(mensagem);

			}
		}
		System.out.println();
		System.out.println("Os n?meros que voc? digitou foram:");
		System.out.println("Primeiro n?mero: " + sequenciaNumerica[0]);
		System.out.println("Segundo n?mero:" + sequenciaNumerica[1]);

		System.out.println();
		System.out.println("A soma desses valores ?: ");
		System.out.println(+sequenciaNumerica[0] + sequenciaNumerica[1]);

	}
}
