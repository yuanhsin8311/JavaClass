/*	Student: yh, Yuanhsin Huang
	Homework 5
	Usage:   javac StringDemo.java 
	         java StringDemo 
	Sample Output: 
	Clarify what is today's special discount.
    You can get:
    milk
    a
    onion
    Buy 1 Get 1 Free
*/

import java.lang.String;
import java.util.Scanner;

class StringManipulator
{
	static String[] cart = new String[3];
	static String shoppingCart = "";
	static void getCoupon()
   { 
		Scanner sc = new Scanner(System.in);
		cart[0] = sc.next();
		sc = new Scanner(System.in);
		cart[1] = sc.next();
        sc = new Scanner(System.in);
		cart[2] = sc.next();
		
          for(String mm : cart)
          {
              
			  if(mm.startsWith("milk"))
              {
                shoppingCart = "Buy 1 Get 1 Free";
              }
			  else if(mm.contains("cheese"))
              {
                shoppingCart = "You can get one drawing chance.";
              }
			  else
              {
                  continue;
              }
				System.out.println(shoppingCart);
          }
		
		
		if (shoppingCart.isEmpty()) System.out.println("Please add shopping items.");
   }   
}	

class StringDemo
{
	public static void main(String[] args)
	{
		System.out.println("Clarify what is today's special discount.");
		StringManipulator myStringManipulator = new StringManipulator();
		
		System.out.println("You can get: ");	
		myStringManipulator.getCoupon();
	}
}