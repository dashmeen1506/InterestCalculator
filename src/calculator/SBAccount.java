package calculator;

public class SBAccount extends Account
 {
	double interestRate;
	double amount;
	@Override
	double calculatorInterest() {
		// TODO Auto-generated method stub
		interestRate = (amount * 4)/100;
		return interestRate;
	}
}
