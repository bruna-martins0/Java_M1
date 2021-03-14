package entities;

public class ImportedProduct extends Product3 {
	
	private double customFee;

	public ImportedProduct() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ImportedProduct(String name, double price, double customFee ) {
		super(name, price);
		this.customFee = customFee;
		
		// TODO Auto-generated constructor stub
	}
	
	public Double totalPrice() {
		return super.getPrice() + customFee;
	}
	
	@Override
	public String priceTag() {
		return String.format("%.2f", totalPrice())+ "( Customs fee: $ " + String.format("%.2f",customFee) + ")";
	}
	

}
