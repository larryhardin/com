package com.patterns.behavioral.observer.JavaObserver;

import java.util.Observable;
@SuppressWarnings("deprecation")
public class ONewsAgency extends Observable {
    private String news;

    public void setNews(String news) {
        this.news = news;
        setChanged();
        notifyObservers(news);
    }
    //Not implemented in example, needed for compile...
    public String getNews() {
    	return this.news;
    }
}