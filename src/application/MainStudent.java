package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class MainStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Student std = new Student ();
		
		System.out.print("Grade 1: ");
		std.grade1 = sc.nextDouble();
		System.out.print("Grade 2: ");
		std.grade2 = sc.nextDouble();
		System.out.print("Grade 3: ");
		std.grade3 = sc.nextDouble();
		
		System.out.print (std.toString());
		
		sc.close();
		

	}

}
