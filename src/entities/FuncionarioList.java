package entities;

public class FuncionarioList {
	
	private String nome;
	private double salario; 
	private int id;
	
	public FuncionarioList (int id, String nome ,double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}


		
	public String toString() {
		return id + ", " + nome + ", " + String.format("%.2f", salario);
	}
	
	
	public void aumento (double porcentagem) {
		salario += salario * porcentagem/100;
	}
	

}
