package org.designPattern;

import org.designPattern.Observable.AndroidObservableImpl;
import org.designPattern.Observable.StockObservable;
import org.designPattern.Observer.EmailAlertObserver;
import org.designPattern.Observer.NotificationAlertObserver;
import org.designPattern.Observer.SMSAlertObserver;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        StockObservable stockObservable = new AndroidObservableImpl();
        NotificationAlertObserver observer1 = new SMSAlertObserver("8126449754", stockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserver("Lokesh", stockObservable);

        stockObservable.add(observer1);
        stockObservable.add(observer2);
        stockObservable.setData(506);
        stockObservable.sendAlert();

        stockObservable.setData(-59);
        stockObservable.sendAlert();
    }
}