package com.interfaces;

public class TaxCalculator2019 implements TaxCalculator {
    //I wonder why the Override Annotation is added. Is it needed by the compiler?
	@Override
	public float calculateTax() {
		return 1;
	}
}
