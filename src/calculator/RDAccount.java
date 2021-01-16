package calculator;

public class RDAccount extends Account{
	double interestRate;
	double amount;
	int noOfMonths;
	double monthlyAccount;
	int age;
	@Override
	double calculatorInterest() {
		// TODO Auto-generated method stub
		if(noOfMonths == 6)
		{
			if(age < 60)
			{
				interestRate = (amount * 7.50)/100;
			}
			else
			{
				interestRate = (amount * 8.00)/100;
			}
		}
		if(noOfMonths == 9)
		{
			if(age < 60)
			{
				interestRate = (amount * 7.75)/100;
			}
			else
			{
				interestRate = (amount * 8.25)/100;
			}
		}
		if(noOfMonths == 12)
		{
			if(age < 60)
			{
				interestRate = (amount * 8.00)/100;
			}
			else
			{
				interestRate = (amount * 8.50)/100;
			}
		}
		if(noOfMonths == 15)
		{
			if(age < 60)
			{
				interestRate = (amount * 8.25)/100;
			}
			else
			{
				interestRate = (amount * 8.75)/100;
			}
		}
		if(noOfMonths == 18)
		{
			if(age < 60)
			{
				interestRate = (amount * 8.50)/100;
			}
			else
			{
				interestRate = (amount * 9.00)/100;
			}
		}
		if(noOfMonths == 21)
		{
			if(age < 60)
			{
				interestRate = (amount * 8.75)/100;
			}
			else
			{
				interestRate = (amount * 9.25)/100;
			}
		}
		return interestRate;
	}
}
