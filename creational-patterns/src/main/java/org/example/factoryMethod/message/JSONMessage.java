package org.example.factoryMethod.message;

public class JSONMessage extends Message {
    @Override
    public String getContent() {
        return "{\"JSON]\":[]}";
    }
}
