package com.patterns.state;

public class ConcreteStateB implements State {
	@Override
	public void handle() {
		System.out.println("ConcreteStateB handle method");
	}
}
