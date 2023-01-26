import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product produto = new Product();

		// 1st operation : receiving initial data
		System.out.println("Enter product data:");
		System.out.printf("Name: ");
		produto.name = sc.nextLine();
		System.out.printf("Price: ");
		produto.price = sc.nextDouble();
		System.out.printf("Quantity in stock: ");
		produto.quantity = sc.nextInt();
		System.out.println("\nProduct data: " + produto +"\n");

		// 2nd operation : adding products to stock
		System.out.print("Enter the number of products to be added in stock: ");
		produto.AddProducts(sc.nextInt());
		System.out.print("\nUpdated data:"+ produto +"\n\n");
	
		// 3rd operation : removing products from stock
		System.out.print("Enter the number of products to be removed from stock: ");
		produto.RemoveProducts(sc.nextInt());
		System.out.print("\nUpdated data:" + produto);
	
		sc.close();

	}

}
