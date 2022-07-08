package com.patterns.state;

public class ConcreteStateA implements State {
	@Override
	public void handle() {
		System.out.println("ConcreteStateA handle method");
	}
}
