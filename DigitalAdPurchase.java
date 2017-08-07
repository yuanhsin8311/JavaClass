/*	Student: yh, Yuanhsin Huang
	Homework 3
	Usage:   javac DigitalAdPurchaseEvaluation.java 
	         java DigitalAdPurchaseEvaluation 
	Sample Output: 
	I. Basic information for further evaluation.

	What is your budget?
	1000

	What is your Cost Per Thousand Impressions (CPM)?
	0.003

	What is final clicks?
	10000

	What is your Product Revenue?
	12000

	What is your total Cost plus ad budget?
	4000

	II. Impression Evaluation
    The Click Through Rate is low and necessary to be improved advertisement quality
.
    III. Rate of Investment

    Please suggest your Targeted ROI.
    0.02
    The ROI is: 2.0and higher than expectation -1.98
	
    IV. User Feedback

    Please score your experience when using this evaluation system.
    The score range is 1-5.
    5 shows your high satisfaction and 1 presents your terrible feedback.
    3
    Thanks for your feedback.
    We will keep upgrade our service.

    Thank you.
*/

//Help business customer evaluates whether digital advertising is worth investing. 

import java.util.Scanner;

class ClickThroughRate{
	double ClickThroughRate(double Impressions,double clicks)
	{ return clicks/Impressions;    }
}

class ROICalculation{
	double ROICalculation(double cost,double revenue)
	{ return (revenue - cost)/cost; }
}

class DigitalAdPurchase{
	public static void main(String args[]){
		
		Scanner myScanner = new Scanner(System.in);
		ClickThroughRate myClickThroughRate = new ClickThroughRate();
		ROICalculation myROICalculation = new ROICalculation();
		
		System.out.println("I. Basic information for further evaluation.");
		System.out.println();
		
		System.out.println("What is your budget?");
		double budget = myScanner.nextDouble();
		System.out.println();
		
		System.out.println("What is your Cost Per Thousand Impressions (CPM)?");
		double CostPerThousandImpression = myScanner.nextDouble();
		double myImpressions = budget * (1000/CostPerThousandImpression);
		System.out.println();		
		
		System.out.println("What is final clicks?");
		double myClicks = myScanner.nextDouble();
		System.out.println();
		
		double finalCTR = myClickThroughRate.ClickThroughRate(myImpressions,myClicks);
		
		System.out.println("What is your Product Revenue?");
		double ProductRevenue = myScanner.nextDouble();
		System.out.println();
		
		System.out.println("What is your total Cost plus ad budget?");
		double ProductCost = myScanner.nextDouble();
		System.out.println();
		
		double PayPerClick = (ProductRevenue-ProductCost)/myClicks;
		double myROI = myROICalculation.ROICalculation(ProductCost,ProductRevenue);
		
		System.out.println("II. Impression Evaluation");
		System.out.println();
	
		if (finalCTR > 0.05)
		{ 
			System.out.println("The Click Through Rate is: "+ finalCTR);
			System.out.println("Ihe ad performs excellent in increasing impressions.");
		}    
		else if((finalCTR > 0.01)&(finalCTR <0.05))
		{ 
				System.out.println("The Click Through Rate is: "+ finalCTR);
				System.out.println("Ihe ad performs unsignificantly in increasing impressions.");
		}    
		else
		System.out.println("The Click Through Rate is low and necessary to be improved advertisement quality.");
	
	
		System.out.println("III. Rate of Investment");
		System.out.println();
	
		do
		{
			System.out.println("Please suggest your Targeted ROI.");
			double TargetedROI = myScanner.nextDouble();
			if ((myROI > TargetedROI) & (myROI > 0.5)) System.out.println("The ROI is: " + myROI + "and higher than expectation " + (TargetedROI - myROI));
			else if ((myROI > TargetedROI) & (myROI < 0.5)) 
			{ 
		      System.out.println("The ROI is: " + myROI);
			  System.out.println("Though a little higher than expectation, its ROI is not good enough.");
			}                                  
			else System.out.println("The ROI is: " + myROI + " and the result shows low feedback from this ad investment.");
			break;
		} while(myROI >= 0);
	    
		System.out.println();
		
		System.out.println("IV. User Feedback");
		System.out.println();
		System.out.println("Please score your experience when using this evaluation system.");
		System.out.println("The score range is 1-5.");
		System.out.println("5 shows your high satisfaction and 1 presents your terrible feedback.");
		int Score = myScanner.nextInt();
		
	    int i;
		
		for(i=0; i<1; i++){
		switch(Score)
		{
			case 5:
			case 4:
			System.out.println("Thanks for your satisfaction!");
			System.out.println("Please help us recommend this service to your business partners!");
			break;
			case 3:
			System.out.println("Thanks for your feedback.");
			System.out.println("We will keep upgrade our service.");
			break;
			case 2:
			case 1:
			System.out.println("Apologoze if any poor experience.");
			System.out.println("Please leave your suggestions if we can do more improvement for this service.");
			String Comment = myScanner.next();
			break;
		}
		}
		System.out.println();
		System.out.println("Thank you.");
	}
}



