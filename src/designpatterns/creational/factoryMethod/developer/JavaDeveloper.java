package designpatterns.creational.factoryMethod.developer;

import designpatterns.creational.factoryMethod.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code...");
    }
}
