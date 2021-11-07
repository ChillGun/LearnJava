
public class SalaryIncome implements Income{

	// TODO
	private double income;
	
	public SalaryIncome(double income) {
		this.income = income;
	}
	
	@Override
	public double getTax() {
		if(this.income < 5000) {
			return 0;
		}
		else
			return (this.income - 5000) * 0.2;
	}

}
