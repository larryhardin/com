import com.interfaces.TaxCalculator;
import com.interfaces.TaxCalculator2020;
import com.patterns.memento.Editor;
import com.patterns.memento.History;
import com.patterns.state.ConcreteStateA;
import com.patterns.state.ConcreteStateB;
import com.patterns.state.Context;

public class Main {
	public static void main(String[] args) {
		showMemento();
		showInterfaces();
		showState();
		
	}	
	public static void showInterfaces() {
		TaxCalculator myCalc = getCalculator();
		Float myFloat = myCalc.calculateTax();
		System.out.println(myFloat.toString());
	}
	
	public static TaxCalculator getCalculator() {
		return new TaxCalculator2020();
	}
	//Illustrate how the memento pattern works.
	public static void showMemento() {
		//Originator Memento     Caretaker
		//Editor     EditorState History
		
		var editor  = new Editor();
		var history = new History();

		//The order of operations to set the content and retain it in history
		//is to execute the Editor class' setContent method and then the 
		//History class' push, using the value from the editor class' getState method		
		editor.setContent("A");				//Set content.
		history.push(editor.createState());	//add Editor's new EditorState to history
		System.out.println(editor.getContent());
		
		editor.setContent("B");
		history.push(editor.createState());
		System.out.println(editor.getContent());
		
		editor.setContent("C");
		history.push(editor.createState());
		System.out.println(editor.getContent());
		
		editor.restore(history.pop());
		System.out.println(editor.getContent());
		editor.restore(history.pop());
		System.out.println(editor.getContent());
		editor.restore(history.pop());
		System.out.println(editor.getContent());
	}

	//Illustrate state pattern
	public static void showState() {
		var context = new Context();
		context.setCurrentState(new ConcreteStateA());
		context.request();
		
		context.setCurrentState(new ConcreteStateB());
		context.request();
		
	}
}