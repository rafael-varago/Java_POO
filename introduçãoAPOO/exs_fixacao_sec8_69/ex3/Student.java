package entities;

public class Student {

	public String name;
	public double g1;
	public double g2;
	public double g3;
	
	public double finalGrade() {
		return g1 + g2 + g3;
	}
	
	public String toString() {
		
		if(finalGrade() >= 60) {
			return "FINAL GRADE = " + finalGrade() + "\nPASS";
		} else {
			return "FINAL GRADE = " + finalGrade() + "\nFAILED" + "\nMISSING " + (60.0 - finalGrade()) + " POINTS"; 
		}
		
	}
	
}
