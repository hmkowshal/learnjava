package com.oops.factoryinterface;

public class EmailNotification implements Notification {

    @Override
    public void send(){
        System.out.println("Sending Email Notification");
    }
}
