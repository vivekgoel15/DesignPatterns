package com.test.designpatterns.behavioral.observer.custom;

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
public class ObserverPatternDemo {
	public static void main(String[] args) {
		Subject subject = new Subject();

		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);

		System.out.println("First state change: 15");
		subject.setState(15);
		System.out.println("Second state change: 10");
		subject.setState(10);
	}
}
