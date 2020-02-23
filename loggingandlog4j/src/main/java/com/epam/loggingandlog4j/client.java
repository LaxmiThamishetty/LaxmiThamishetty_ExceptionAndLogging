package com.epam.loggingandlog4j;

import org.apache.logging.log4j.*;

import java.util.Scanner;
import java.util.logging.Logger;


public class client {
	static Logger log = Logger.getLogger(Logger.class.getName());
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		log.info("Enter 1 for simple and compound interest 2 for house construction cost");
		int choice = sc.nextInt(); 		
		if(choice == 1){
			double principle, rate, time;
			log.info("Enter amount");
			principle=sc.nextDouble();
			log.info("Enter the No.of years:");
			time=sc.nextDouble();
			log.info("Enter the Rate of  interest");
			rate=sc.nextDouble();
			SimpleCompoundInterest simplecompoundinterest = new SimpleCompoundInterest();
			double simple = simplecompoundinterest.simpleInterestCalculation(principle,rate,time);
			double compound = simplecompoundinterest.compoundInterestCalculation(principle,rate,time);
			log.info("Simple interest: "+simple);
			log.info("Compound interest: "+compound);
		}else{
			houseconstruction housecost = new houseconstruction();
			log.info("Enter 1)standard materials 2)above standard materials 3)high standard material 4)high standard material and fully automated home");
			int material = sc.nextInt();
			log.info("enter total area");
			double totalarea = sc.nextDouble();
			double cost = housecost.constructionCostCalculation(material,totalarea);
			log.info(cost+"INR");
			
		}
	}
}
