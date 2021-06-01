package com.keith.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
	private String[] urls = new String[10];
	private int count;
	

	public void setUrls(List<String> urls) {
		this.urls = urls;
	}

	public void push(String url) {
		urls[count] = url;
		count++;
	}
	
	public String pop() {
		count--;
		return urls[count];
	}

	public String[] getUrls() {
		return urls;
	}
	
	public Iterator createIterator() {
		return new ArrayIterator(history: this);
	}
	
	public class ArrayIterator implements Iterator {
		private BrowserHistory history;
		private int index;
		
		public ArrayIterator(BrowserHistory history) {
			this.history = history;
		}

		@Override
		public boolean hasNext() {
			return (index<history.count);
		}

		@Override
		public String current() {
			return history.urls[index]''
		}

		@Override
		public void next() {
			index++;
			
		}
		
		
	}
	
}
