/*	Student: yh, Yuanhsin Huang
	Homework 6
	Usage:   javac InventoryManagementDemo.java 
	         java InventoryManagementDemo 
	Sample Output: 
	This category provides laptop.
	The system assigns a specific code for this category: Category@2a139a55
	The total inventory value for this category is
	2500000
	Please consider to discontinue to develop this category.

	This category provides charger.
	The system assigns a specific code for this category: Category@15db9742
	The total inventory value for this category is
	150000
	This category is worthy to develop.
*/

class Category
{
	boolean hasStock;
	boolean activeSellingStatus;
	String categoryName;
	
	Category()
	{
		hasStock = true;
		activeSellingStatus = true;
	}
	Category(String categoryName)
	{
		this.categoryName = categoryName;
		System.out.println("This category provides " + categoryName + ".");
	}
}
class CategoryManagement
{
	int quantity,pricePerQuantity;
	
	CategoryManagement(Category c)
	{
		System.out.println("The system assigns a specific code for this category: " + c.toString());
	}
	int calculateInventoryValue(int quantity, int pricePerQuantity)
	{
		this.quantity = quantity;
		this.pricePerQuantity = pricePerQuantity;
		System.out.println("The total inventory value for this category is ");
		return quantity * pricePerQuantity;
	}
	String calculateInventoryValue(int breakEvenPoint)
	{
		if ((quantity * pricePerQuantity) > breakEvenPoint) return "This category is worthy to develop.";
		else return "Please consider to discontinue to develop this category.";
	}
}

class CategoryManagementDemo
{
	public static void main(String[] args)
	{
		Category firstCategory = new Category("laptop");
		CategoryManagement c1 = new CategoryManagement(firstCategory);
		System.out.println(c1.calculateInventoryValue(5000,500));
		System.out.println(c1.calculateInventoryValue(100000000));
		System.out.println();
		Category secondCategory = new Category("charger");
		CategoryManagement c2 = new CategoryManagement(secondCategory);
		System.out.println(c2.calculateInventoryValue(3000,50));
		System.out.println(c2.calculateInventoryValue(5000));
	}
}