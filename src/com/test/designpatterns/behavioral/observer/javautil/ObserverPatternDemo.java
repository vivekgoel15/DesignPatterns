package com.test.designpatterns.behavioral.observer.javautil;

import java.util.Observable;

/**
 * The observer pattern is a software design pattern in which an object, called
 * the subject, maintains a list of its dependents, called observers, and
 * notifies them automatically of any state changes, usually by calling one of
 * their methods.
 * 
 * e.g. twitter, facebook
 * 
 * @author vigoel
 *
 */
public class ObserverPatternDemo extends Observable {
	public static void main(String[] args) {
		MessageBoard board = new MessageBoard();
		Student bob = new Student("Bob");
		Student joe = new Student("Joe");
		board.addObserver(bob);
		board.addObserver(joe);
		board.changeMessage("More Homework!");
	}
}
