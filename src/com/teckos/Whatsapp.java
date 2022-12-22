package com.teckos;

public class Whatsapp extends Decorator{
    public Whatsapp(Notification notification) {
        super(notification);
    }

    @Override
    public void sendMessage(String msg) {
        super.sendMessage(msg);
        sendWhatsapp(msg);
    }

    private void sendWhatsapp(String msg) {
        System.out.println(msg + ", message envoyé par Whatsapp");
    }
}
