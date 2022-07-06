package com.patterns.memento;
import java.util.ArrayList;
import java.util.List;
public class History {
	//Important note: List is an interface which, in this case, is implemented by
	//the ArrayList class. Here, were are programming to an interface.
	private List<EditorState> states = new ArrayList<>();	
	
	public void push(EditorState state) {
		//Adds state to the end of the object.
		states.add(state);
	}	
	
	//Removes the last one...
	public EditorState pop() {
		var lastIndex = states.size() -1 ;
		var lastState = states.get(lastIndex);
		states.remove(lastIndex);
		return lastState;
	}	
	
	private Integer getIndexOf(EditorState state){
		return states.indexOf(state);
	}	
	
	public void deleteState(EditorState state){		
		int objAt = getIndexOf(state); 
		if ( objAt >= 0 ) {
			states.remove(objAt);
		}
	}
}