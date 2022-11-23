package designpatterns.creational.factoryMethod.factory;

import designpatterns.creational.factoryMethod.Developer;
import designpatterns.creational.factoryMethod.DeveloperFactory;
import designpatterns.creational.factoryMethod.developer.CppDeveloper;

public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
