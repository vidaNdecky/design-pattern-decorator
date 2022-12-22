package com.teckos;

public class Client {
    public static void main(String[] args) {
        Notification notify = new Mail();
        notify = new Sms(notify);
        notify = new Whatsapp(notify);
        notify.sendMessage("Bonjour cher client :)");
    }
}
