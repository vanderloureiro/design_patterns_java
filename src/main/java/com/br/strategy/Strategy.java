package com.br.strategy;

public class Strategy {

    public static void main(String[] args) {
        SendMessageService sender = new SendMessageService();

        sender.send(new SendEmailMessage(), "Example by email");
        sender.send(new SendPhoneMessage(), "Example by phone");
    }
}

interface SendMessageStrategy {

    void sendMessage(String message);
}

class SendPhoneMessage implements SendMessageStrategy {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending by phone ==> " + message);
    }
}

class SendEmailMessage implements SendMessageStrategy {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending by email ==> " + message);
    }
}

class SendMessageService {

    public void send(SendMessageStrategy strategy, String message) {
        strategy.sendMessage(message);
    }
}
