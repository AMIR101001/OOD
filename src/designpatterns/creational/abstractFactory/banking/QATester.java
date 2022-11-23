package designpatterns.creational.abstractFactory.banking;

import designpatterns.creational.abstractFactory.Tester;

public class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QA tester testings banking code...");
    }
}
