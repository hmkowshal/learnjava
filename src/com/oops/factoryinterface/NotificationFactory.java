package com.oops.factoryinterface;

public class NotificationFactory {

    public static Notification createNotification(String type) {

        if(type == null || type.isEmpty())
            return null;

        String notificationType = type.toLowerCase();

        switch(notificationType) {
            case "email":
                return new EmailNotification();
            case "sms":
                return new SMSNotification();
            case "push":
                return new PushNotification();
            default:
                throw new IllegalArgumentException();
        }
    }

    public static void main(String[] args) {
        try {
            Notification smsNotification = NotificationFactory.createNotification("sms");
            smsNotification.send();
            Notification emailNotification = NotificationFactory.createNotification("email");
            emailNotification.send();
            Notification pushNotification = NotificationFactory.createNotification("push");
            pushNotification.send();
            Notification pushNotification1 = NotificationFactory.createNotification("push1");
            pushNotification1.send();
        }catch(IllegalArgumentException ex){
            System.out.println("Invalid notification type: " + NotificationFactory.class.getName());
        }

    }
}
