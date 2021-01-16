package calculator;

import java.util.*;

public abstract class Account {
	double interestRate;
	double amount;
	abstract double calculatorInterest();
}
class Main{
	public static void main(String[] args)
	{
		int op=0;
		double t;
		Scanner sc = new Scanner(System.in);
		while(op!=4)
		{
			System.out.println("MAIN MENU");
			System.out.println("---------");
			System.out.println("1. Interest Calculator - SB");
			System.out.println("2. Interest Calculator - FD");
			System.out.println("3. Interest Calculator - RD");
			System.out.println("4. Exit");
			System.out.println("Enter your option: ");
			op=sc.nextInt();
			switch(op)
			{
				case 1:
					SBAccount sb = new SBAccount();
					System.out.println("Enter the Average amount in your account: ");
					sb.amount = sc.nextDouble();
					System.out.println("Interest gained: ");
					t=sb.calculatorInterest();
					System.out.println("Rs. "+t);
					break;
				case 2:
					FDAccount fd = new FDAccount();
					System.out.println("Enter the FD amount: ");
					fd.amount = sc.nextDouble();
					System.out.println("Enter the no of days: ");
					fd.noOfDays= sc.nextInt();
					System.out.println("Enter your age: ");
					fd.age = sc.nextInt();
					if(fd.noOfDays<0)
					{
						System.out.println("Invalid no of days. Please enter non-negative values.");
					}
					else
					{
						System.out.println("Interest gained: ");
						t=fd.calculatorInterest();
						System.out.println("Rs. "+t);
					}
					break;
				case 3:
					RDAccount rd = new RDAccount();
					System.out.println("Enter the RD amount: ");
					rd.amount = sc.nextDouble();
					System.out.println("Enter the no of months: ");
					rd.noOfMonths = sc.nextInt();
					System.out.println("Enter your age: ");
					rd.age = sc.nextInt();
					System.out.println("Interest gained: ");
					t = rd.calculatorInterest();
					System.out.println("Rs. "+t);
					break;
				case 4:
					break;
			}
			
		}
		sc.close();
	}
}