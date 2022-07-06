package com.patterns.memento;

public class Editor {
	private String content;
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	//Returns the state object for the specified content
	public EditorState createState() {
		return new EditorState(content);
	}
	
	//The sets content to that of specified EditorState
	public void restore(EditorState state) {
		content = state.getContent();
	}
}
