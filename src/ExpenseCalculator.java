
/**
 * This class is used to implement the Expenser interface
 * @author SENG 210 - Joseph Castro, Julie Chambers, Cameron Basham
 *
 */


public class ExpenseCalculator implements Expenser{

	
	
	public User userAtHand;
	

	@Override
	public void addExpense(Expense Ex) {
		userAtHand.Spending.add(Ex); 
		
	}

	@Override
	public void addMonthlyIncome(Wage W) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void PrintFullreport() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void PrintExpensereport() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void PrintIncomereport() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void PrintIncomereportbyTpe() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void PrintExpensebyType() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exportReport(String reportTitle) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double convertForeignCurrency(String Currency_Name, double amount) {
		for (Currency c : userAtHand.currencyRates) {
			if (c.getName().equals(Currency_Name)) {
				return amount * c.getRate();
			}
		}
		
		// TODO Auto-generated method stub
		return -1;
		// return a error message exception
	}
	
	public double convertForeignCurrency(String Currency_Name) {
		return convertForeignCurrency (Currency_Name, userAtHand.balance);
		//return null;
	}

	@Override
	public boolean loadExpenseFile(String filePath) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean loadIncomeFile(String filePath) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int whenCanIBuy(String itemname, double price) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateMonthlySavings() {
		// TODO Auto-generated method stub
		
		
	}

}



