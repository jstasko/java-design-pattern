package org.example.factoryMethod;

import org.example.factoryMethod.message.Message;
import org.example.factoryMethod.message.TextMessage;

public class TextMessageCreator extends MessageCreator {
    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
