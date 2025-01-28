package org.example.abstractFactory.instance.impl;

import org.example.abstractFactory.instance.Instance;
import org.example.abstractFactory.storage.Storage;

public class GoogleComputeInstance implements Instance {
    public GoogleComputeInstance(Capacity capacity) {
        // Map capacity to GoogleCompute instance types . use GoogleCompute API to provision
        System.out.println("Created GoogleCompute instance");
    }

    @Override
    public void start() {
        System.out.println("Starting GoogleCompute instance");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attaching " + storage + " Storage to GoogleCompute instance");
    }

    @Override
    public void stop() {
        System.out.println("Stopping GoogleCompute instance");
    }

    @Override
    public String toString() {
        return "GoogleComputeInstance";
    }
}
