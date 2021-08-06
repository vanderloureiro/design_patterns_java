package com.br.strategy;

public class MainStrategy {

    public MainStrategy() {
        SendMessageService sender = new SendMessageService();

        sender.send(new SendEmailMessage(), "Example by email");
        sender.send(new SendPhoneMessage(), "Example by phone");
    }
}
