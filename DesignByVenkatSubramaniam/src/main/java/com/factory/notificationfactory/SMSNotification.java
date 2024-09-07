package com.factory.notificationfactory;

import com.factory.notificationfactory.Notification;

public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS notification");
    }
}


