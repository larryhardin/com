package com.patterns.state;

public class Context {
	private State currentState;

	public State getCurrentState() {
		return currentState;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	} 

	public void request() {
		this.currentState.handle();
	}
}
