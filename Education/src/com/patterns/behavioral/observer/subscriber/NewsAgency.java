package com.patterns.behavioral.observer.subscriber;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
	private String news;
	
	//The observers which will register
	//It is worth noting that the Channel specified in the 
	//generic is actually an interface and that all objects
	//which will register are the concrete class NewsChannel
	//which implement the Channel interface.
	private List<Channel> channels = new ArrayList<>();

    //Register method.
    public void addObserver(Channel channel) { 
        this.channels.add(channel);
    }

    public void removeObserver(Channel channel) {
        this.channels.remove(channel);
    }

    public void setNews(String news) {
        this.news = news;
        //Update all who have registered.
        for (Channel channel : this.channels) {
        	//Here is the call to the method defined in the interface
        	//Channel. The API is used to specify the callBackMethod.
            channel.update(this.news);
        }
    }
    
    public String getNews() {
    	return this.news;
    }
}