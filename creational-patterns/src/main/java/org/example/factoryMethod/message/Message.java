package org.example.factoryMethod.message;

public abstract class Message {
    public abstract String getContent();

    public void addDefaultHeaders() {
        // add something
    }

    public void encrypt() {
        // encryption logic
    }
}
