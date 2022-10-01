
package ListaDeExercícios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author Renner Alves Martins. Este programa recebe dois valores, calcula a
 *         soma deles e imprime o resultado.
 */

public class ProgramaDeSomaExercício03 {

	public static void main(String[] args) {

		String mensagem = null;
		int numerosCorretos = 0;
		double[] sequenciaNumerica = new double[2];

		while (numerosCorretos != 2) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Insira um número REAL: ");

			try {
				double numero = scanner.nextDouble();
				for (int i = 0; i < sequenciaNumerica.length; i++) {
					if (i == numerosCorretos) {
						sequenciaNumerica[i] = numero;
					}
				}
				numerosCorretos++;
			} catch (InputMismatchException ex) {
				mensagem = ("Erro! Insira um valor válido.");
				System.out.println("Se for decimal, faça a " + "separação das casas decimais com vírgula.");
				System.out.println(mensagem);

			}
		}
		System.out.println();
		System.out.println("Os números que você digitou foram:");
		System.out.println("Primeiro número: " + sequenciaNumerica[0]);
		System.out.println("Segundo número:" + sequenciaNumerica[1]);

		System.out.println();
		System.out.println("A soma desses valores é: ");
		System.out.println(+sequenciaNumerica[0] + sequenciaNumerica[1]);

	}
}
