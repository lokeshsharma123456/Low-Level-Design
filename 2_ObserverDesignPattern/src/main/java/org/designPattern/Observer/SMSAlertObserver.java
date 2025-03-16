package org.designPattern.Observer;

import org.designPattern.Observable.StockObservable;

public class SMSAlertObserver implements NotificationAlertObserver{
    String  mobileNumber;
    StockObservable stockObservable;

    public SMSAlertObserver(String mobileNumber, StockObservable stockObservable) {
        this.mobileNumber = mobileNumber;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendSMS(mobileNumber, "Stock fluctation", stockObservable.getData());
    }
    void sendSMS(String mobileNumber, String msg, int newVal){
        System.out.println("SMS send to mobile :"+mobileNumber+ " msg:" + msg + "--"+ newVal);

    }
}
