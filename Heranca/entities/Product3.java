package entities;

public class Product3 {
	
	private String name;
	private double price;
	
	public Product3(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	
	public Product3() {
	}
	

	public String getName() {
		return name;
	}



	public double getPrice() {
		return price;
	}
	
	
	public void setPrice(double price) {
		this.price = price;
	}

	public String priceTag() {
		return name + " $" + String.format("%.2f", price) + " "; 
	}


}
