package com.br.strategy;

public class SendPhoneMessage implements SendMessageStrategy {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending by phone ==> " + message);
    }
}
