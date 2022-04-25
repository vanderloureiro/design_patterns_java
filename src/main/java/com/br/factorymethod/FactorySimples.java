package com.br.factorymethod;

public class FactorySimples {

    public static void main(String args[]) {
        NotificadorSimples notificador = NotificadorSimples.iniciarComEmail("teste@teste.com");
    }
}

class NotificadorSimples {

    private String email;

    public static NotificadorSimples iniciarComEmail(String email) {
        if (!email.contains("@")) {
            throw new IllegalArgumentException();
        }
        NotificadorSimples notificadorSimples = new NotificadorSimples();
        notificadorSimples.email = email;
        return notificadorSimples;
    }
}
