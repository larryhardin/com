import com.linkedlists.IntArray;

public class ArrayDemos {

	public static void main(String[] args) {
		IntArray numbers = new IntArray(0);
		numbers.insert(10);
		numbers.insert(20);
		numbers.insert(30);
		numbers.insert(40);
		numbers.insert(50);
		numbers.insert(60);
		numbers.insert(70);
		numbers.insert(80);
		numbers.insert(90);
		System.out.println(numbers.getLength());
		numbers.removeAt(2);  //Removes 30
		numbers.removeAt(0); //Remove First, or 10
		numbers.removeAt(numbers.getLength() -1 ); //Remove last or 90
		numbers.print();
		//numbers.removeAt(-1); //will receive exception, as planned.
		//numbers.removeAt(100); //will receive exception, as planned.
		System.out.println(numbers.getLength());
	}
}
