package application;
import entities.CurrencyConverter;
import java.util.Locale;
import java.util.Scanner;

public class MainDolar_Estatico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dolarCotation = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double dolarQuantity = sc.nextDouble();
		double result = CurrencyConverter.totalPrice(dolarCotation, dolarQuantity);
		System.out.printf("Amount to be paied in reais:%.2f", result);
			
		sc.close();
		

	}

}
