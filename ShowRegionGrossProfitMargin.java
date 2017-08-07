/*
	Student: yh, Yuanhsin Huang
	Homework 1
	Usage: java ShowRegionGrossProfitMargin "2015" "South America" 
	Sample Output: 
		
		Year: 2015
		Region: South America
		Growth Profit Margin:
										2.0%
		The remainer when dividing target sales $1,000,000 by 12 regions is $4
*/
class ShowRegionGrossProfitMargin
{
	public static void main (String[] args)
	{
		//Demonstrate the uses of String[] args
		System.out.println("Year: "+ args[0]);
		System.out.println("Region: "+ args[1]);
		
		//Demonstrate the escape sequences \t \n
		double GrossProfitMargin = 2000.0 / 100000.0;  //Gross Profit Margin Rate = Gross Profit / Net Sales
		System.out.println("Growth Profit Margin: \n\t\t\t\t" + GrossProfitMargin*100 + "%" );  
		
		//Demonstrate the modululus operator 
		System.out.println("The remainer when dividing target sales $1,000,000 by 12 regions is " + "$" + 1000000 % 12 );
	}
}