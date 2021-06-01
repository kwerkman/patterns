package com.keith.state;

public class Selection implements Tool {

	@Override
	public void mouseDown() {
		System.out.println("Selection icon");
		
	}

	@Override
	public void mouseUp() {
		System.out.println("Draw dash rect");
		
	}
	

}
