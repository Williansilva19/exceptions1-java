package entities;

public class OutSourcedEmployee extends Employee {
	private double additionalCharge;

	public OutSourcedEmployee(String name, int hours, double valuePerHour, double additionalCharge2) {
		super();
	}

	public OutSourcedEmployee(String nome, Integer hours, double valuePerHour) {
		super(nome, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public double payment () {
		return super.payment() + additionalCharge * 1.1;
	}
}
