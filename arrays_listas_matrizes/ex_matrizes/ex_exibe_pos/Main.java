import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// lendo o tamanho da matriz e declarando-a
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] matriz = new int[m][n];

		// lendo os valores da matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		// numero que vamos procurar na matriz
		int x = sc.nextInt();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == x) {
					printaEmVolta(matriz, i, j);
				}
			}
		}

		sc.close();
	}

	public static void printaEmVolta(int[][] matriz, int i, int j) {
		System.out.printf("Position %d,%d:\n", i, j);
		//esquerda
		if(j > 0) {
			System.out.println("Left: " + matriz[i][j-1]);
		}
		//direita
		if(j < matriz[i].length-1) {
			System.out.println("Rigth: " + matriz[i][j+1]);
		}
		//acima
		if(i > 0) {
			System.out.println("Up: " + matriz[i-1][j]);
		}
		//abaixo
		if(i < matriz.length-1) {
			System.out.println("Down: " + matriz[i+1][j]);
		}
	}
}
