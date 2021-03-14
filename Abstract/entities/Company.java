package entities;

public class Company extends TaxPayer {
	
	private double numberEmployees;
	
	
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Company(String name, double anualIncome, double numberEmployees) {
		super(name, anualIncome);
		this.numberEmployees = numberEmployees;
	}
	

	public double getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(double numberEmployees) {
		this.numberEmployees = numberEmployees;
	}
	
	@Override
	public  double taxesPaied() {
		if (numberEmployees <=  10) {
			return  super.getAnualIncome()  * 0.16;
			
		}else {
			return (super.getAnualIncome()  * 0.14);
			
		}
		
	}
	
}
