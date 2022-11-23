package designpatterns.creational.factoryMethod.factory;

import designpatterns.creational.factoryMethod.Developer;
import designpatterns.creational.factoryMethod.DeveloperFactory;
import designpatterns.creational.factoryMethod.developer.PnpDeveloper;

public class PhpDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PnpDeveloper();
    }
}
