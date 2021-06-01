package com.keith.state;

public class Main {

	public static void main(String[] args) {
		var canvas = new Canvas();
		
		canvas.setCurrentTool(new Selection());
		canvas.mouseDown();
		canvas.mouseUp();


		canvas.setCurrentTool(new Brush());
		canvas.mouseDown();
		canvas.mouseUp();

		canvas.setCurrentTool(new Eraser());
		canvas.mouseDown();
		canvas.mouseUp();
	}

}
