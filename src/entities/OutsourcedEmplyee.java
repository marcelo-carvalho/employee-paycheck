package entities;

public class OutsourcedEmplyee extends Employee {

	private Double additionalCharge;
	
	public OutsourcedEmplyee() {
		
	}

	public OutsourcedEmplyee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
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
	public double payment() {
		
		return super.payment() + (1.1 * additionalCharge);
	}
}
