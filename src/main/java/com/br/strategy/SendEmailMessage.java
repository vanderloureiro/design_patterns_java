package com.br.strategy;

public class SendEmailMessage implements SendMessageStrategy {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending by email ==> " + message);
    }
}
