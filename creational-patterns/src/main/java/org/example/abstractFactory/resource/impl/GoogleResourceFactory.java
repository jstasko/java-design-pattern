package org.example.abstractFactory.resource.impl;

import org.example.abstractFactory.instance.Instance;
import org.example.abstractFactory.instance.impl.GoogleComputeInstance;
import org.example.abstractFactory.resource.ResourceFactory;
import org.example.abstractFactory.storage.Storage;
import org.example.abstractFactory.storage.impl.S3Storage;

// Factory that implements Google resources
public class GoogleResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeInstance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new S3Storage(capMib);
    }
}
