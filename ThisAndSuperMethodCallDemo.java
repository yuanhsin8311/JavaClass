/*	Student: yh, Yuanhsin Huang
	Homework 7
	Usage:   javac ThisAndSuperMethodCallDemo.java
	         java  ThisAndSuperMethodCallDemo
	Sample Output:
	The cosmetics is the magic for women.
	Almost every woman has one lip color as her first cosmetics collection.
	Lipstick occupies the largest portion of lip color's sales.
	Avon: Most famous direct-selling brand in USA
	My favorite cosmetic brand is Loreal.
*/

abstract class AbstractCosmetics
{
	boolean isNatural;
	boolean hasEffect;

	AbstractCosmetics()
	{
		isNatural = false;
		hasEffect = true;
		System.out.println("The cosmetics is the magic for women.");
	}
	String getFavoriteBrand(String brandName)
	{
		return "Loreal";
	}
	//abstract String getYourFavoriteBrand(String brandName);
}
class LipColor extends AbstractCosmetics
{
	boolean hasGlitter;
	boolean isColorful;
	LipColor()
	{
		super(); // OK, A CALL TO THE SUPERCLASS CONSTRUCTOR
		hasGlitter = true;
		isColorful = true;
		System.out.println("Almost every woman has one lip color as her first cosmetics collection.");
	}
	String getYourFavoriteBrand(String brandName)
	{
		if(brandName == "Estee Lauder") return "Estee Lauder: The most popular cosmetics brand in USA";
		else if(brandName == "Avon") return "Avon: Most famous direct-selling brand in USA";
		else return "Others.";
	}
}
class LipStick extends LipColor
{
	LipStick()
	{
		System.out.println("Lipstick occupies the largest portion of lip color's sales.");
		super.getYourFavoriteBrand("Avon");
		this.getYourFavoriteBrand("Estee Lauder");
		// THIS CONSTRUCTOR CAN CALL THE SUPERCLASS VERSION OF getYourFavoriteBrand AND ALSO CALL THIS CLASS' VERSION OF THAT SAME METHOD NAME
	}
	// THIS SUBCLASS NEEDS TO OVERRIDE getYourFavoriteBrand
	final String getFavoriteBrand(String brandName)
	{
		String temp;
		temp = super.getYourFavoriteBrand("Avon");
		System.out.println(temp);
		if(brandName == "Loreal") {System.out.println("My favorite cosmetic brand is Loreal.");}
		return "";
	}
}

class ThisAndSuperMethodCallDemo
{
	public static void main(String[] args)
	{
		LipStick myLipStick = new LipStick();
		System.out.println(myLipStick.getFavoriteBrand("Loreal"));
	}
}