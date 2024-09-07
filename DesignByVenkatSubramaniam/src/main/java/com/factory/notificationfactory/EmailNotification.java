package com.factory.notificationfactory;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending an Email notification");
    }
}
