package com.teckos;

public class Mail extends Notification {
    @Override
    public void sendMessage(String msg) {
        System.out.println(msg + ", message envoyé par email");
    }
}
