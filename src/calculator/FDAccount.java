package calculator;

public class FDAccount extends Account
{
	double interestRate;
	double amount;
	int noOfDays;
	int age;
	@Override
	double calculatorInterest() {
		// TODO Auto-generated method stub
		if(amount < 1000000)
		{
			if(noOfDays>=7 && noOfDays<=14)
			{
				if(age<60)
				{
					interestRate=(amount * 4.50)/100;
				}
				else
				{
					interestRate=(amount*5.00)/100;
				}
			}
			if(noOfDays>=15 && noOfDays<=29)
			{
				if(age<60)
				{
					interestRate=(amount * 4.75)/100;
				}
				else
				{
					interestRate=(amount*5.25)/100;
				}
			}
			if(noOfDays>=30 && noOfDays<=45)
			{
				if(age<60)
				{
					interestRate=(amount * 5.50)/100;
				}
				else
				{
					interestRate=(amount*6.00)/100;
				}
			}
			if(noOfDays>=46 && noOfDays<=60)
			{
				if(age<60)
				{
					interestRate=(amount * 7.00)/100;
				}
				else
				{
					interestRate=(amount*7.50)/100;
				}
			}
			if(noOfDays>=61 && noOfDays<=184)
			{
				if(age<60)
				{
					interestRate=(amount * 7.50)/100;
				}
				else
				{
					interestRate=(amount*8.00)/100;
				}
			}
			if(noOfDays>=185 && noOfDays <=365)
			{
				if(age<60)
				{
					interestRate=(amount * 8.00)/100;
				}
				else
				{
					interestRate=(amount*8.50)/100;
				}
			}
		}
		else
		{
			if(noOfDays>=7 && noOfDays<=14)
			{
				interestRate=(amount*6.50)/100;
			}
			if(noOfDays>=15 && noOfDays<=29)
			{
				interestRate=(amount*6.75)/100;
			}
			if(noOfDays>=30 && noOfDays<=45)
			{
				interestRate=(amount*6.75)/100;
			}
			if(noOfDays>=46 && noOfDays<=60)
			{
				interestRate=(amount*8.00)/100;
			}
			if(noOfDays>=61 && noOfDays<=184)
			{
				interestRate=(amount*8.50)/100;
			}
			if(noOfDays>=185 && noOfDays <=365)
			{
				interestRate=(amount*10.00)/100;
			}
		}
		return interestRate;
	}
}
