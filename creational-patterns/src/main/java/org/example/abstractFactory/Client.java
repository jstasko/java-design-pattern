package org.example.abstractFactory;

import org.example.abstractFactory.instance.Instance;
import org.example.abstractFactory.resource.ResourceFactory;
import org.example.abstractFactory.resource.impl.AwsResourceFactory;
import org.example.abstractFactory.resource.impl.GoogleResourceFactory;
import org.example.abstractFactory.storage.Storage;

public class Client {

    private final ResourceFactory resourceFactory;

    public Client(ResourceFactory resourceFactory) {
        this.resourceFactory = resourceFactory;
    }

    public Instance createServer(Instance.Capacity capacity, int storageMib) {
        Instance instance = resourceFactory.createInstance(capacity);
        Storage storage = resourceFactory.createStorage(storageMib);
        instance.attachStorage(storage);
        return instance;
    }

    public static void main(String[] args) {
        Client client = new Client(new AwsResourceFactory());

        Instance clientAws = client.createServer(Instance.Capacity.micro, 20480);

        clientAws.start();
        clientAws.stop();
    }
}
