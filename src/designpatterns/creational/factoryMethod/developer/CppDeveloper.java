package designpatterns.creational.factoryMethod.developer;

import designpatterns.creational.factoryMethod.Developer;

public class CppDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("C++ developer write C++ code... ");
    }
}
