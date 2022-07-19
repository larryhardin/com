package com.patterns.creational.abstractFactory;

public class BusinessLoan extends Loan{

	@Override
	void getInterestRate(double r) {
		rate=r;
	}	
}
