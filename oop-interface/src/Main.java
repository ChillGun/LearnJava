
/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		// TODO: 用接口给一个有工资收入和稿费收入的小伙伴算税:
		Income[] incomes = new Income[] { new RoyaltyIncome(3000), new SalaryIncome(7500), new RoyaltyIncome(12000) };
		double total = 0;
		for(Income income : incomes) {
			total = total + income.getTax();
		}
		// TODO:
		System.out.println(total);
	}

}
