package com.test.designpatterns.behavioral.observer.javautil;

import java.util.Observable;

public class MessageBoard extends Observable {
	public String message;

	public void changeMessage(String message) {
		this.message = message;
		// Below code notifies the observers about the change
		setChanged();
		notifyObservers(message);
	}
}
