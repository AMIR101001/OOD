package designpatterns.creational.factoryMethod;

public class PhpDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new PnpDeveloper();
    }
}
