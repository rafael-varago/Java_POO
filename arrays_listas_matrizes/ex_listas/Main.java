import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list_of_employees = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		// input
		for (int i = 0; i < n; i++) {
			System.out.printf("\nEmployee #%d:\n", i + 1);
			System.out.printf("Id: ");
			int id = sc.nextInt();
			while(hasId(list_of_employees, id) != true) {
				System.out.println("Id already taken, try again: ");
				id = sc.nextInt();
			}
			System.out.printf("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.printf("Salary: ");
			double salary = sc.nextDouble();
			list_of_employees.add(new Employee(name, salary, id));
		}

		// looks for the id given
		System.out.print("\nEnter the employee id that will have a salary increase: ");
		int chosen_id = sc.nextInt();
		Employee search_for_id = list_of_employees.stream().filter(x -> x.getId() == chosen_id).findFirst()
				.orElse(null);

		// in case id is inexistent
		if (search_for_id == null) {
			System.out.println("This id does not exist!");
			System.out.println("\nList of employees: ");
			printList(list_of_employees);
			System.exit(0);
		}

		// in case id is found
		System.out.print("Enter the percentage: ");
		double percentage = sc.nextDouble();
		// see that here i got the search_for_id class that was found
		search_for_id.increaseSalary(percentage);
		System.out.println();

		printList(list_of_employees);

		sc.close();
	}

	public static void printList(List<Employee> list_of_employees) {
		for (Employee x : list_of_employees) {
			System.out.println(x);
		}
	}
	
	public static boolean hasId(List<Employee> list_of_employees, int id) {
		Employee search_for_id = list_of_employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(search_for_id != null) {
			return false;
		} else {
			return true;
		}
	}
}
