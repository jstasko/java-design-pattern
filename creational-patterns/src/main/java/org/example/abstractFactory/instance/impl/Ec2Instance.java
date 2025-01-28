package org.example.abstractFactory.instance.impl;

import org.example.abstractFactory.instance.Instance;
import org.example.abstractFactory.storage.Storage;

// Represent a concrete product in a family "Amazon web services"
public class Ec2Instance implements Instance {
    public Ec2Instance(Capacity capacity) {
        // Map capacity to ec2 instance types . use aws API to provision
        System.out.println("Created Ec2 instance");
    }

    @Override
    public void start() {
        System.out.println("Starting Ec2 instance");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attaching " + storage + " Storage to Ec2 instance");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Ec2 instance");
    }

    @Override
    public String toString() {
        return "Ec2Instance";
    }
}
