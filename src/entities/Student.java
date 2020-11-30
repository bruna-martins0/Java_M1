package entities;

public class Student {
	
	public double grade1;
	public double grade2;
	public double grade3;
	public String name;
	public double totalGrade;
	public double missingPoints;
	
	
	public double finalGrade() {
		return totalGrade = grade1 + grade2 + grade3;
	}
	
	public String finalResult() {
		if (totalGrade >= 60) {
			return "PASS";
		}else {
			missingPoints = 60 - totalGrade;
			return "FAIL" + String.format("%n")+ "MISSING POINTS = " + missingPoints;
		}
	}
	
	public String toString() {
		return "FINAL GRADE: " + String.format("%.2f%n",finalGrade()) + "RESULT: " + finalResult();
	}
	
}
