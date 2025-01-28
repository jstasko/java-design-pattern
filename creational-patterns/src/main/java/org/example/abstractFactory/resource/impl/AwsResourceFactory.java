package org.example.abstractFactory.resource.impl;

import org.example.abstractFactory.instance.Instance;
import org.example.abstractFactory.instance.impl.Ec2Instance;
import org.example.abstractFactory.resource.ResourceFactory;
import org.example.abstractFactory.storage.Storage;
import org.example.abstractFactory.storage.impl.S3Storage;
// Factory that implements Aws resources
public class AwsResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new S3Storage(capMib);
    }
}
