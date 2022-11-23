package designpatterns.creational.factoryMethod.developer;

import designpatterns.creational.factoryMethod.Developer;

public class PnpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer write code Php...");
    }
}
