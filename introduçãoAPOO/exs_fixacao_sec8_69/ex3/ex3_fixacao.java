package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ex3_fixacao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.g1 = sc.nextDouble();
		student.g2 = sc.nextDouble();
		student.g3 = sc.nextDouble();
		
		System.out.println(student);
		
		sc.close();

	}

}
