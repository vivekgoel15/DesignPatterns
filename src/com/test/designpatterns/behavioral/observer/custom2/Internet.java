package com.test.designpatterns.behavioral.observer.custom2;

class Internet implements Observer {
    @Override
    public void update(float interest) {
           System.out.println("Internet: Interest Rate updated, new Rate is: " + interest);
    }
}