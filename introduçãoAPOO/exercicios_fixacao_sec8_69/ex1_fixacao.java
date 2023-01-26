package application;
import java.util.Scanner;
//class i've created
import entities.Rectangle;
import java.util.Locale;

public class ex1_fixacao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle r = new Rectangle();
		
		System.out.println("Enter rectangle width and height");
		r.width = sc.nextDouble();
		r.height = sc.nextDouble();
		
		System.out.println(r);
		
		sc.close();

	}

}
