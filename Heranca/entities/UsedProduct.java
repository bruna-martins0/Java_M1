package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product3 {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date manufactureDate;
	
	public UsedProduct() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsedProduct(String name, double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
		
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String priceTag() {
		return super.getName() + " (used) $" + String.format("%.2f",super.getPrice()) + " (Manufactured Date: " + 
			   sdf.format(manufactureDate) + " )";
	}
	
	
	

}
