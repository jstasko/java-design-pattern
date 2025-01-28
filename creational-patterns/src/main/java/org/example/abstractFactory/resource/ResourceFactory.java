package org.example.abstractFactory.resource;

import org.example.abstractFactory.instance.Instance;
import org.example.abstractFactory.storage.Storage;

public interface ResourceFactory {
    Instance createInstance(Instance.Capacity capacity);
    Storage createStorage(int capMib);
}
