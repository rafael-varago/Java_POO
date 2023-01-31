package entities;

public class Employee {

	private String name;
	private double salary;
	private int id;
	
	public Employee(String name, double salary, int id) {
		this.name = name;
		this.salary = salary;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
	
	public int getId() {
		return id;
	}

	public void increaseSalary(double percentage) {
		salary *= (1 + (percentage/100));
	}

	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
	
}
