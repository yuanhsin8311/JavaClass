/*	Student: yh, Yuanhsin Huang
	Homework 4
	Usage:   javac Gardening.java 
	         java Gardening 
	Sample Output: 
	The plants in Cindy's garden are roses.
    In this spring, there are around 14.0 flowers in the garden.
    The soil PH value is 0.7 and the fertilizer grade is D.
    Thus, the garden should be watered more;1.0 acres garden needs 3.0 amount of water.
*/

// Brief introduction of Cindy's garden.
class Plant
{
	int numberOfBulbs; //instance variable
	static final int NUMBER_OF_BEES = 2;  //static field is class variable
	String breed;
	
	Plant(int numberOfFlowerBulbs, String flowerBreed)   // define a constructor that takes a formal parameter
	{
		numberOfBulbs = numberOfFlowerBulbs;
		breed = flowerBreed;
	}
	
	double calculateDensity( double failureProbability ) //compute the number of flowers in the garden; parameterized method
	{
		return numberOfBulbs*NUMBER_OF_BEES*(1-failureProbability);
	}
	
	String getVariety()  //define a method that is parameterless
	{
		return "The plants in Cindy's garden are " + breed +".";
	}
}

class FertilizedSoil
{
	static final double ACRES_OF_GARDEN = 1.0;  //static field is class variable
	double soilPh;    // instance variable; like noun
	String fertilizerGrade;
	
	FertilizedSoil(double newSoilPh, String newFertilizerGrade)   // formal parameter gets runtime argument values ; constructor: capital 
	{
		soilPh = newSoilPh;  //assign the value of the formal parameter to the field
		fertilizerGrade = newFertilizerGrade;
	}
	
	String getWaterRecommendation(double newSoilPh, String newFertilizerGrade) //consider the garden's soil ph value and fertilizer level, this parameterized method determines if the water is necessary or not.
	{
		if ((newSoilPh > 0.5)|(newFertilizerGrade != "A")) 
			return "Thus, the garden should be watered more;" + ACRES_OF_GARDEN + " acres garden needs " + (ACRES_OF_GARDEN*3) + " amount of water.";
		else  return "Thus, the garden should be watered less.";
	}
	
	String controlSoilCondition() //define a method that is parameterless; method: verb-like
	{
		return "The soil PH value is " + soilPh + " and the fertilizer grade is " + fertilizerGrade + ".";
	}
}

class Gardening{
	public static void main(String[] args){
		Plant cindyRoseGarden = new Plant(10,"roses");
		FertilizedSoil cindyFertilizedSoil = new FertilizedSoil(0.7, "D");
		System.out.println(cindyRoseGarden.getVariety());
		System.out.println("In this spring, there are around " + cindyRoseGarden.calculateDensity(0.3) + " flowers in the garden.");
		System.out.println(cindyFertilizedSoil.controlSoilCondition());
		System.out.println(cindyFertilizedSoil.getWaterRecommendation(0.7, "D"));
	}
}