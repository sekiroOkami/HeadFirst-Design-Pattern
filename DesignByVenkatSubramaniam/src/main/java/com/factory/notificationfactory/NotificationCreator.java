package com.factory.notificationfactory;

public interface NotificationCreator {

    // default factory method to create notifications
    default Notification createNotification(String type) {
        switch (type.toLowerCase()) {
            case "sms":
                return new SMSNotification();
            case "email":
                return new EmailNotification();
            default:
                throw new IllegalArgumentException("Unknow notification type: " + type);
        }
    }
}
