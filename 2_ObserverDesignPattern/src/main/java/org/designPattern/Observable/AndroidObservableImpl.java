package org.designPattern.Observable;

import org.designPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class AndroidObservableImpl implements StockObservable{

    List<NotificationAlertObserver>observerList = new ArrayList<>();
    int dataValue = 0;
    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void sendAlert() {
        for(NotificationAlertObserver observer : observerList){
            observer.update();
        }
    }

    @Override
    public void setData(int fluctuation) {
        this.dataValue += fluctuation;
    }

    @Override
    public int getData() {
        return this.dataValue;
    }
}
