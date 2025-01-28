package org.example.abstractFactory.instance;

import org.example.abstractFactory.storage.Storage;

public interface Instance {
    enum Capacity {micro, small, large}
    void start();
    void attachStorage(Storage storage);
    void stop();
}
