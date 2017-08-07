/*	Student: yh, Yuanhsin Huang
	Homework 2
	Usage: java TaxCalculator 
	Sample Output: 
	
	Are you single or couples? Single is true. Married is false.
    false

    What is your base salary?
    70000
    Your base salary is $70000

    Please suggest your stock income.
    10000
    How about the dividend income?
	250
    Your total stock income is $10250

    Your total State Income tax is $11100.0
*/

//Question about the income level and corresponding tax calculation.

import java.util.Scanner;

class StockTax       // Define the constructor for the StockTax class
{
	double stockIncomeTax(int stockShare,int dividend)   //Define the stockIncomeTax method
	{
		return stockShare * 0.4 + dividend * 0.4;
		}
}

class TaxCalculator{
	public static void main(String args[])
	{
		StockTax myStockTax = new StockTax();        // Call the constructor and create an object of type StockTax
		Scanner myScanner = new Scanner(System.in);  // Create a scanner object
		
		System.out.println("Are you single or couples? Single is true. Married is false."); // Prompt the user to give input
		boolean maritalStatus = myScanner.nextBoolean();    //Take the user's answer and pass it to the object 
		
		System.out.println();
		
		System.out.println("What is your base salary?");
		int baseSalary = myScanner.nextInt();                //Put the value from the keyboard in a variable
		System.out.println("Your base salary is " + "$" + baseSalary);
		
		System.out.println();
		
		System.out.println("Please suggest your stock income.");
		int myStockShare = myScanner.nextInt();
		
		System.out.print("How about the dividend income?");
		int myDividend = myScanner.nextInt();
		
		System.out.println("Your total stock income is " + "$" + (myStockShare + myDividend));
		double totalstockIncomeTax = myStockTax.stockIncomeTax(myStockShare, myDividend);   //Call the "stockIncomeTax" method
		
		System.out.println();
		
		int i = baseSalary + myStockShare + myDividend;
		if ((maritalStatus == true) && (i < 60000)) 
		System.out.println("Your total Income tax is " + "$" + (totalstockIncomeTax + baseSalary * 0.06 ));
		if ((maritalStatus == true) && ((i < 400000) & (i > 60000))) 
		System.out.println("Your total Income tax is " + "$" +(totalstockIncomeTax + baseSalary * 0.10 ));
		if ((maritalStatus == true) && ((i < 1000000) & (i > 400000))) 
		System.out.println("Your total Income tax is " + "$" + (totalstockIncomeTax + baseSalary * 0.13 ));
		if ((maritalStatus != true) && (i < 50000)) 
		System.out.println("Your total Income tax is " + "$" + (totalstockIncomeTax + baseSalary * 0.08 ));
		if ((maritalStatus != true) && ((i < 250000) & (i > 50000))) 
		System.out.println("Your total Income tax is " + "$" + (totalstockIncomeTax + baseSalary * 0.10 ));
		if ((maritalStatus != true) && ((i < 500000) & (i > 250000))) 
		System.out.println("Your total Income tax is " + "$" + (totalstockIncomeTax + baseSalary * 0.12 ));
		if ((maritalStatus != true) && ((i < 1000000) & (i > 500000))) 
		System.out.println("Your total Income tax is " + "$" +(totalstockIncomeTax + baseSalary * 0.13 ));
		}
}
