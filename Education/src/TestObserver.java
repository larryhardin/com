import com.patterns.behavioral.observer.subscriber.NewsAgency;
import com.patterns.behavioral.observer.subscriber.NewsChannel;

public class TestObserver {
	/**********************************************
	 * This example is more of a subscriber      **
	 * example than an observer. In fact, the    **
	 * the observation is done by the NewsAgency **
	 * class. The NewsChannel class, through the **
	 * channel interface, provides the call back **
	 * method.                                   **
	 **********************************************/
	public static void main(String[] args) {
		NewsAgency observable  = new NewsAgency();
		NewsChannel observer   = new NewsChannel("WKRP");
		NewsChannel observer2  = new NewsChannel("WTFU");
		NewsChannel observer3  = new NewsChannel("WOLD");

		observable.addObserver(observer);
		observable.addObserver(observer2);
		observable.addObserver(observer3);
		
		observable.setNews("Biden to speak at kindergarten!");
		assertEquals(observer, observable);
		assertEquals(observer2, observable);		
		assertEquals(observer3, observable);
		
		observable.removeObserver(observer3);
		
		//update news
		observable.setNews("Biden can't remember ABCs, but smells all kids!");
		assertEquals(observer, observable);
		assertEquals(observer2, observable);		
		assertEquals(observer3, observable);
		
	}

	private static void assertEquals(NewsChannel observer, NewsAgency observable) {
		
		if (observable.getNews() == observer.getNews()){
			System.out.println(observer.callSign + " " + observer.getNews());
			System.out.println("They match.");
		} else {
			System.out.println("They DO NOT match.");
			System.out.println(observable.getNews() + " " + observer.callSign + " " + observer.getNews());
		}

	}
}
