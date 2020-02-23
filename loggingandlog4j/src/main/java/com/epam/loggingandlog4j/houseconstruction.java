package com.epam.loggingandlog4j;

public class houseconstruction {
	public double constructionCostCalculation(int material, double totalarea) {
		double cost = 0;
		switch (material){
			case 1:
				cost = 1200*totalarea;
				break;
			case 2:
				cost = 1500*totalarea;
				break;
			case 3:
				cost = 1800*totalarea;
				break;
			case 4:
				cost = 2500*totalarea;
				break;
			default:
				System.out.println("print correct material");
		}
		return cost;
	}


}
