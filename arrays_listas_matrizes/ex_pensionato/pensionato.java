package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Renter;

public class pensionato {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		Renter[] rent = new Renter[10];
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("\nRent #%d:", i+1);
			System.out.printf("\nName: ");
			String name = sc.nextLine();
			System.out.printf("Email: ");
			String email = sc.nextLine();
			System.out.printf("Room: ");
			int room = sc.nextInt();
			rent[room] = new Renter(name, email, room);
		}
		
		System.out.println("\nBusy rooms:");
		for(int i = 0; i < rent.length; i++) {
			if(rent[i] != null) {
				System.out.printf("%d: %s, %s\n", rent[i].getRoom(), rent[i].getName(), rent[i].getEmail());
			}
		}
		
		sc.close();
	}
}
