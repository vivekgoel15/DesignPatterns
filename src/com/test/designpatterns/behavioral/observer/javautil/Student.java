package com.test.designpatterns.behavioral.observer.javautil;

import java.util.Observable;
import java.util.Observer;

class Student implements Observer {
	private String name;

	public Student(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println(name + "'s feeds:");
		System.out.println("Message board changed: " + arg);
	}
}