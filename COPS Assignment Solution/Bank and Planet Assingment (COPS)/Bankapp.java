
import java.util.*;
class Bankapp
{   
    String name;
    double basic_amnt;
	double balance;
	int intrest;
    double debit;
    double credit;
	Bankapp()
	{
		name = "HDFC";
	}
	Bankapp(double c, double d)
	{
		this(7);
		credit = c;
        debit = d;
        System.out.println("Credit ammount = "+credit+"\n"+"Debit ammont = "+debit);		
	}
	Bankapp(int x)
	{
		intrest = x;
		System.out.println("Interest = "+x+"%");
		System.out.println("----*****Passbook Print*****----"); 
	}
	void display_cond()
	{
		System.out.println("Bank name = "+name);
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter basic min. ammount = Rs.");
		basic_amnt = s1.nextInt();      
	   if(basic_amnt<10000)
		{
			 System.out.println("Sorry account cannot be open"); 
		}
		else
			System.out.println("Welcome to HDFC Bank");
	}
	double display_balance(double j)
	{
		balance = j;
		return balance;
	}
	public static void main(String args[])
	{
		Bankapp b1 = new Bankapp();
        b1.display_cond();
		Scanner s2 = new Scanner(System.in);
		System.out.print("Enter credit ammount = Rs.");
		double a = s2.nextDouble();
		System.out.print("Enter debit ammount = Rs.");
		double b = s2.nextDouble();
		Bankapp b2 = new Bankapp(a,b);
		double k = (b2.credit - b2.debit);
		double p = b2.display_balance(k);
		System.out.println("Balance = Rs."+(p+10000));
		
	}
}