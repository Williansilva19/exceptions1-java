package entities;

public class Employee {

	private String nome;
	private Integer hours;
	private double valuePerHour;

	public Employee() {

	}

	public Employee(String nome, Integer hours, double valuePerHour) {
		this.nome = nome;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	public double payment() {
		return hours * valuePerHour;
		
	}
}
