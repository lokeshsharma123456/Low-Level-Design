package org.designPattern.Observable;

import org.designPattern.Observer.NotificationAlertObserver;

public interface StockObservable {
    void add(NotificationAlertObserver observer);

    void remove(NotificationAlertObserver observer);

    void sendAlert();

    void setData(int newFluctuation);

    int getData();
}
