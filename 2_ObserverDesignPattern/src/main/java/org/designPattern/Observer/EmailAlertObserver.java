package org.designPattern.Observer;

import org.designPattern.Observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver{

    String email;
    StockObservable stockObservable;

    public EmailAlertObserver(String email, StockObservable stockObservable) {
        this.email = email;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendMail(email, "Stock Price changed", stockObservable.getData());

    }
    public void sendMail(String email, String msg, int newValue){
        System.out.println("Mail sent to " + email + " msg:" + msg + "\n New stockPrice" + newValue);
    }
}
