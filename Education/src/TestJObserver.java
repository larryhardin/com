import com.patterns.behavioral.observer.JavaObserver.ONewsAgency;
import com.patterns.behavioral.observer.JavaObserver.ONewsChannel;


public class TestJObserver {
	//Does not work, probably because JavaObserver has been deprecated since version 9
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		ONewsAgency observable = new ONewsAgency();
		ONewsChannel observer = new ONewsChannel(); 

		observable.addObserver(observer);
		observable.setNews("news");
		if (observer.getNews() == "news") {
			System.out.println("Matched");
		} else {
			System.out.println("Not Matched!");
		}
	}

}
