package com.epam.loggingandlog4j;

public class SimpleCompoundInterest {

	public double simpleInterestCalculation(double principle, double rate, double time) {
		double simple;
		simple=(principle * time * rate)/100;
		return simple;
		
	}

	public double compoundInterestCalculation(double principle, double rate, double time) {
		double compound;
		compound=principle * Math.pow(1.0+rate/100.0,time) - principle;
		return compound;
		
	}
}
