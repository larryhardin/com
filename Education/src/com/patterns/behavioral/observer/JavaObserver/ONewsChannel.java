package com.patterns.behavioral.observer.JavaObserver;
//From: https://www.baeldung.com/java-observer-pattern
import java.util.Observable;
import java.util.Observer;

public class ONewsChannel implements Observer {

    private String news;

	@Override 
	public void update(Observable o, Object arg) {
		this.setNews((String) news);
	}
	
	//Added to allow compilation...ommitted in example. 
	//Is this a no-longer working style?
    public void setNews(String news) {
    	this.news = news;
    }
    
    //Not implemented in example, needed for compile...
    public String getNews() {
    	return this.news;
    }
}