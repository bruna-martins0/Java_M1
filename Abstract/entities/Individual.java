package entities;

public class Individual extends TaxPayer{

	private double healthExpenditures;

	public Individual() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Individual(String name, double anualIncome, double healthExpenditures ) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public  double taxesPaied() {
		if (super.getAnualIncome() < 20000) {
			return  super.getAnualIncome()  * 0.15;
			
		}else {
			return (super.getAnualIncome()  * 0.25) - (healthExpenditures * 0.5);
			
		}
		
	}
	
}
