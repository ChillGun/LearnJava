
public class SalaryIncome extends Income{

	// TODO
	public SalaryIncome(double income) {
		super(income);
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
