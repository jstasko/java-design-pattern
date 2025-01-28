package org.example.abstractFactory.storage.impl;

import org.example.abstractFactory.storage.Storage;

public class S3Storage implements Storage {
    public S3Storage(int capacityInMib) {
        // use aws S3 api
        System.out.println("Allocating " + capacityInMib + " MB on S3 storage");
    }

    @Override
    public String toString() {
        return "S3 storage";
    }

    @Override
    public String getId() {
        return "S31";
    }
}
