package com.br.factorymethod;

public class Factory {

    public static void main(String args[]) {
        Notificador notificador = NotificadorFactory.por("SMS");
        notificador.enviarNotificacao();
        Notificador notificador2 = NotificadorFactory.por("EMAIL");
        notificador2.enviarNotificacao();
        Notificador notificador3 = NotificadorFactory.por("NENHUM");
        notificador3.enviarNotificacao();
    }
}

class NotificadorFactory {

    public static Notificador por(String canal) {

        switch(canal) {
            case "EMAIL":
                return new NotificadorEmail();
            case "SMS":
                return new NotificadorSms();
            default:
                return new NotificadorSinalDeFumaca();
        }
    }
}

interface Notificador {

    void enviarNotificacao();
}

class NotificadorEmail implements Notificador {

    @Override
    public void enviarNotificacao() {
        System.out.println("Exemplo por EMAIL");
    }
}

class NotificadorSms implements Notificador {

    @Override
    public void enviarNotificacao() {
        System.out.println("Exemplo por SMS");
    }
}

class NotificadorSinalDeFumaca implements Notificador {

    @Override
    public void enviarNotificacao() {
        System.out.println("Exemplo por sinal de fumaça");
    }
}
