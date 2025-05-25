package com.oops.factoryinterface;

public class SMSNotification implements Notification {

    @Override
    public void send(){
        System.out.println("Sending SMS Notification");
    }
}
