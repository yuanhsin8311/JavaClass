/*	Student: yh, Yuanhsin Huang
	Homework 9
	Usage:   javac ExceptionDemo.java
	         java  ExceptionDemo
	Sample Output:
	(1)ArrayIndexOutOfBoundsException
		Which zone is your starting point?
		1
		Which zone is your destination?
		8
		Your traveling station is 7 stations.

		The zone area is beyond the general ticket fare calculation scope.
		Please contact with the service window.
		Thanks for you purchase.
	(2)Custom Exception: SpecialFareSavingException
		Which zone is your starting point?
		1
		Which zone is your destination?
		7
		Your traveling station is 6 stations.

		The ticket fare buying from machine for 6 station difference is 50.0
		SpecialFareSavingException caught!
		This kind of clipper card fare is not for single ride but for monthly special discount.
		Thanks for you purchase.		
*/
import java.util.Scanner;
import java.io.*;
class SavingCalculation{
	double SavingCalculation(double clipperFare, double tvmFare)
	{
		return tvmFare - clipperFare;
	}
}
class SpecialFareSavingException extends Exception
{
	SpecialFareSavingException()
	{
		System.out.println("SpecialFareSavingException caught!"); 
	}
}
class ExceptionDemo
{
	public static void main(String args[])
	{
		int[] zone = {1,2,3,4,5,6,7,8};
		double[] ticketVendingMachineFare = {3.75,5.75,7.75,9.75,11.75,13.75,50};
		double[] clipperCardFare = {3.2,5.2,7.2,9.2,11.2,13.2,50};
		
		Scanner myScanner = new Scanner(System.in);
		SavingCalculation mySavingCalculation = new SavingCalculation();
		
		System.out.println("Which zone is your starting point?");
		int startingPoint = myScanner.nextInt();
		System.out.println("Which zone is your destination?");
		int destination = myScanner.nextInt();
		int zoneDifference = destination - startingPoint; 
		System.out.println("Your traveling station is " + zoneDifference + " stations.");
		
		System.out.println();
		
		try
		{
			System.out.println("The ticket fare buying from machine for " + zoneDifference+ " station difference is " + ticketVendingMachineFare[zoneDifference]);
			double mySaving = mySavingCalculation.SavingCalculation(clipperCardFare[zoneDifference],ticketVendingMachineFare[zoneDifference]);
			//System.out.println("If buying clipper card, you can save " + mySaving+".");
			if (ticketVendingMachineFare[zoneDifference]-clipperCardFare[zoneDifference] == 0.0)
				{
					throw new SpecialFareSavingException();
				}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("The zone area is beyond the general ticket fare calculation scope.");
			System.out.println("Please contact with the service window.");	
		}
		catch(SpecialFareSavingException e)
		{
			System.out.println("This kind of clipper card fare is not for single ride but for monthly special discount.");
		}
		finally
		{
			System.out.println("Thanks for you purchase.");
		}
	}	
}

