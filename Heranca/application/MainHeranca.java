package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product3;
import entities.UsedProduct;

public class MainHeranca {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List <Product3> list = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter the number of the products:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data: ");
			System.out.print("Comun, used or imported? (c,u,i): ");
			char t = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if (t == 'c') {	
				list.add(new Product3(name, price));
			}else if(t == 'u'){
				System.out.print("Manufacture Date: (DD/MM/YYYY)");
				Date date = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price,date));
			}else {
				System.out.print("Custom Fee: ");
				double fee = sc.nextDouble();
				list.add(new ImportedProduct(name, price,fee));

			}

		}
		

		System.out.println();
		System.out.println("PRICE TAGS:");
		for(Product3 prd: list) {
			System.out.println(prd.priceTag());
			
		}

		sc.close();
	}

}
