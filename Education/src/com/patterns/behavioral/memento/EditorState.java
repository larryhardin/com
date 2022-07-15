package com.patterns.behavioral.memento;

public class EditorState {
	//Set to private so as to make it not changeable
	//after initialization.
	//Question: Can this model work if the value is not set in the constructor?
	private final String content;
	
	public EditorState(String content) {
		this.content = content;
	}
	
	public String getContent() {
		return content;
	}
}
