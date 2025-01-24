package org.example.factoryMethod;

import org.example.factoryMethod.message.JSONMessage;
import org.example.factoryMethod.message.Message;

public class JSONMessageCreator extends MessageCreator {
    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
