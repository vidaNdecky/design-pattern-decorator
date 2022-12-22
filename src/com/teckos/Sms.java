package com.teckos;

public class Sms extends Decorator {
    public Sms(Notification notification) {
        super(notification);
    }

    @Override
    public void sendMessage(String msg) {
        super.sendMessage(msg);
        sendSMS(msg);
    }

    private void sendSMS(String msg) {
        System.out.println(msg + ", message envoyé par SMS");
    }
}
