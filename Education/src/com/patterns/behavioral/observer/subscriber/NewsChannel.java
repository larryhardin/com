package com.patterns.behavioral.observer.subscriber;

public class NewsChannel implements Channel {
    private String news;
    public String callSign;
    
    public NewsChannel(String callSign) {
    	this.callSign = callSign;
    }
    @Override
    public void update(Object news) {
        this.setNews((String) news);
    } 
    
    public void setNews(String news) {
    	this.news = news;
    }
    
    public String getNews() {
    	return this.news;
    }
}