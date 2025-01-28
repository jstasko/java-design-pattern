package org.example.abstractFactory.storage.impl;

import org.example.abstractFactory.storage.Storage;

public class GoogleCloudStorage implements Storage {
    public GoogleCloudStorage(int capacityInMib) {
        // use GoogleCloud api
        System.out.println("Allocating " + capacityInMib + " MB on GoogleCloud storage");
    }

    @Override
    public String toString() {
        return "GoogleCloud storage";
    }

    @Override
    public String getId() {
        return "GoogleCloud1";
    }
}
