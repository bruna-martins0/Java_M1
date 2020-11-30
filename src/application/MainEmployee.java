package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Employee emp = new Employee();
		System.out.print("Name: ");
		emp.name = sc.next();
		System.out.print("GrossSalary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		System.out.println("Employee: " + emp.toString());
		System.out.print("Wich percentage to increase salary: ");
		emp.increaseSalary(sc.nextDouble());
		System.out.print("Update data:" + emp.toString());
		sc.close();
	}

}
