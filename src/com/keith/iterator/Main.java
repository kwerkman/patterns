package com.keith.iterator;

import com.keith.iterator.BrowseHistory;

public class Main {

	public static void main(String[] args) {
		var history = new BrowseHistory();

		history.push("a");
		history.push("b");
		history.push("c");
		
//		for(var i=0; i<history.getUrls().size(); i++) {
//			var url = history.getUrls().get(i);
//			System.out.println(url);
//       }

		Iterator iterator = history.createIterator();
		while (iterator.hasNext()) {
			var url = iterator.current();
			System.out.println(url);
			iterator.next();
		}
			
	}

}
