package com.keith.state;

public class Brush implements Tool {

	@Override
	public void mouseDown() {
		System.out.println("Brush Icon");
		
	}

	@Override
	public void mouseUp() {
		System.out.println("Brush draw a line");
		
	}
	

}
