package com.app.namkchat.model;

import java.util.Map;

public class MessageSend extends Message {
    public Map getHora() {
        return hora;
    }

    public void setHora(Map hora) {
        this.hora = hora;
    }

    private Map hora;

    public MessageSend(){}


}
