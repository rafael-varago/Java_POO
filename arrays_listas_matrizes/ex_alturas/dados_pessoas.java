package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class dados_pessoas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		Person[] p = new Person[n];
		
		for(int i = 0; i < p.length; i++) {
			System.out.printf("Altura da %da pessoa: ", i+1);
			double height = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i+1);
			char sex = sc.next().charAt(0);
			p[i] = new Person(height, sex);
		}
		
		System.out.printf("Menor altura = %.2f\n", p[menorPessoa(p)].getHeight());
		System.out.printf("Maior altura = %.2f\n", p[maiorPessoa(p)].getHeight());
		System.out.printf("Media das alturas das mulheres = %.2f\n", mediaDasMulheres(p));
		System.out.printf("Numero de homens = %d", nroDeHomens(p));
		
		sc.close();
	}

	public static int menorPessoa(Person[] p) {
		int menor = 0;
		for(int i = 0; i < p.length; i++) {
			if (p[i].getHeight() < p[menor].getHeight()) {
				menor = i;
			}
		}
		return menor;
	}
	
	public static int maiorPessoa(Person[] p) {
		int maior = 0;
		for(int i = 0; i < p.length; i++) {
			if (p[i].getHeight() > p[maior].getHeight()) {
				maior = i;
			}
		}
		return maior;
	}
	
	public static double mediaDasMulheres(Person[] p) {
		int n_mulheres = 0;
		double sum_mulheres = 0;
		for(int i = 0; i < p.length; i++) {
			if(p[i].getSex() == 'F') {
				n_mulheres++;
				sum_mulheres += p[i].getHeight();
			}
		}
		if(n_mulheres == 0) {
			return 0;
		}
		return sum_mulheres/n_mulheres;
	}
	
	public static int nroDeHomens(Person[] p) {
		int n_homens = 0;
		for(int i = 0; i < p.length; i++) {
			if(p[i].getSex() == 'M') {
				n_homens++;
			}
		}
		return n_homens;
	}
	
}
