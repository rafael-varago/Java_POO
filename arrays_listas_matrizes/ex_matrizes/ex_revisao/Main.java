import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//lendo o tamanho da matriz e declarando-a
		int n = sc.nextInt();
		int[][] matriz = new int[n][n];

		//lendo a matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		System.out.println("Diagonal Principal: ");
		diagonalPrincipal(matriz);

		System.out.println("\nNúmeros negativos: " + nrosNegativos(matriz));

		sc.close();
	}

	public static void diagonalPrincipal(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
		}
	}

	public static int nrosNegativos(int matriz[][]) {
		int count = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 0) {
					count++;
				}
			}
		}
		return count;
	}

}
