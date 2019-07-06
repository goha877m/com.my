package com.my.pattern.builder;
class Car implements CarPlan {
	private String myWheel;
	private String myFrame;
	private String myEngine;
	private String myWidget;

	public void setWheel(String wheel) {
		myWheel = wheel;
	}

	public void setFrame(String frame) {
		myFrame = frame;
	}

	public void setEngine(String engine) {
		myEngine = engine;
	}

	public void setWidget(String widget) {
        myWidget = widget;
    }
	
	public String toString() {
		return "mycar is "  + "myWheel :[" + myWheel + " ],myEngine :[" + myEngine +  "], myFrame:[" + myFrame  + "], myWidget:[" + myWidget + "]";
	}
}