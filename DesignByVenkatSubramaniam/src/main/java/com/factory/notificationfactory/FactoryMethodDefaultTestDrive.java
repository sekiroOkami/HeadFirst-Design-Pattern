package com.factory.notificationfactory;

public class FactoryMethodDefaultTestDrive {
    public static void main(String[] args) {
        NotificationCreator creator = new NotificationService();

        Notification sms = creator.createNotification("sms");
        sms.notifyUser();

        Notification email = creator.createNotification("email");
        email.notifyUser();
    }

}
