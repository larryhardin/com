package com.patterns.behavioral.observer.propertyChange;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PCLNewsChannel implements PropertyChangeListener {
	private String news;
	
	//Required by interface
	@Override 
	public void propertyChange(PropertyChangeEvent evt) {
	    this.setNews((String) evt.getNewValue());	
	}
	
	public void setNews(String news) {
		this.news = news;
	}
	
	public String getNews() {
		return this.news;
	}
}
