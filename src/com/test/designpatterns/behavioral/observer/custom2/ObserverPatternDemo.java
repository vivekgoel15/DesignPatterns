package com.test.designpatterns.behavioral.observer.custom2;

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

	public static void main(String args[]) {
		// this will maintain all loans information
		Newspaper printMedia = new Newspaper();
		Internet onlineMedia = new Internet();

		Loan personalLoan = new Loan("Personal Loan", 12.5f, "Standard Charterd");
		personalLoan.registerObserver(printMedia);
		personalLoan.registerObserver(onlineMedia);
		personalLoan.setInterest(3.5f);
	}
}
