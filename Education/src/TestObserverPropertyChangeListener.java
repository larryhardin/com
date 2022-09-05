import com.patterns.behavioral.observer.propertyChange.PCLNewsAgency;
import com.patterns.behavioral.observer.propertyChange.PCLNewsChannel;

public class TestObserverPropertyChangeListener {

	public static void main(String[] args) {
		PCLNewsAgency  observable = new PCLNewsAgency();
		PCLNewsChannel observer   = new PCLNewsChannel();

		//In this example, the observable object will manage the linkage
		//by registering the observer. It also handles firing the change
		//event.
		observable.addPropertyChangeListener(observer);
		observable.setNews("news");

		assertEquals(observer.getNews(), "news");
	}

	private static void assertEquals(String news, String string) {
		if ( news == string) {
			System.out.println("Match");
		} else {
			System.out.println("Not matched!");
		}
	}

}
