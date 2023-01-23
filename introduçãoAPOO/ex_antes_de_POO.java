import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//triangulo x
		System.out.println("Enter the measures of triangle X:");
		double x1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double x3 = sc.nextDouble();
		//triangulo y
		System.out.println("Enter the measures of triangle Y:");
		double y1 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double y3 = sc.nextDouble();
		
		double areaX = area(x1,x2,x3);
		double areaY = area(y1,y2,y3);
		
		System.out.printf("Triangle X area: %.4f", areaX);
		System.out.printf("\nTriangle Y area: %.4f\n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();
		
	}

	public static double area(double a, double b, double c) {
		
		double p = (a+b+c)/2.0;
		
		double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		
		return area;
		
	}
	
}
