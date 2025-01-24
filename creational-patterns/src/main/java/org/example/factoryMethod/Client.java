package org.example.factoryMethod;

import org.example.factoryMethod.message.Message;

public class Client {
    public static void main(String[] args) {
        printMessage(new JSONMessageCreator());
        printMessage(new TextMessageCreator());
    }

    public static void printMessage(MessageCreator messageCreator) {
        Message msg = messageCreator.createMessage();
        System.out.println(msg.toString());
    }
}
