import com.patterns.memento.Editor;
import com.patterns.memento.History;

public class Main {
	//Originator Memento     Caretaker
	//Editor     EditorState History
	public static void main(String[] args) {
		var editor  = new Editor();
		var history = new History();

		//The order of operations to set the content and retain it in 
		//history is to execute the Editor class' setContent method
		//and then the History class' push, using the value from
		//the editor class' getState method.
		editor.setContent("A");				//Set content.
		history.push(editor.createState());	//add Editor's new EditorState to history
		System.out.println(editor.getContent().toString());
		
		editor.setContent("B");
		history.push(editor.createState());
		System.out.println(editor.getContent().toString());
		
		editor.setContent("C");
		history.push(editor.createState());
		System.out.println(editor.getContent().toString());
		
		editor.restore(history.pop());
		System.out.println(editor.getContent().toString());
		editor.restore(history.pop());
		System.out.println(editor.getContent().toString());
		editor.restore(history.pop());
		System.out.println(editor.getContent().toString());
	}	
	
}