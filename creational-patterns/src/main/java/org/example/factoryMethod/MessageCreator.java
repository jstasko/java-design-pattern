package org.example.factoryMethod;

import org.example.factoryMethod.message.Message;

public abstract class MessageCreator {
    public Message getMessage() {
        Message msg = createMessage();

        msg.addDefaultHeaders();
        msg.encrypt();

        return msg;
    }

    // FactoryMethod
    public abstract Message createMessage();
}
