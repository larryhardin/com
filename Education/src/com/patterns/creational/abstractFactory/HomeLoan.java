package com.patterns.creational.abstractFactory;

public class HomeLoan extends Loan{

	@Override
	void getInterestRate(double r) {
		rate=r;
	}
}
