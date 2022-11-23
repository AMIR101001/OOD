package designpatterns.creational.factoryMethod.factory;

import designpatterns.creational.factoryMethod.Developer;
import designpatterns.creational.factoryMethod.DeveloperFactory;
import designpatterns.creational.factoryMethod.developer.JavaDeveloper;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();

    }
}
