package com.example.SpringBootJQueryAjax.model;

public class Messenger {

    private String username;
    private String message;

    public  Messenger(){}

    public Messenger(String username, String message){
        this.username = username;
        this.message = message;
    }

    // username
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    // message
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}



