package model.entities;

public class OutsorcedEmployee extends Employee3 {
	private Double additionalCharge;
	
	public OutsorcedEmployee() {
		super();
	}

	public OutsorcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	@Override
	public Double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
}
