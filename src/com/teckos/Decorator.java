package com.teckos;

public abstract class Decorator extends Notification {
    protected Notification notification;

    public Decorator(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void sendMessage(String msg) {
        notification.sendMessage(msg);
    }
}
