package org.example.factoryMethod.message;

public class TextMessage extends Message {
    @Override
    public String getContent() {
        return "Text Message";
    }
}
