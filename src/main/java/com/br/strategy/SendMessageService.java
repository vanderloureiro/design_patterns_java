package com.br.strategy;

public class SendMessageService {

    public void send(SendMessageStrategy strategy, String message) {
        strategy.sendMessage(message);
    }
}
