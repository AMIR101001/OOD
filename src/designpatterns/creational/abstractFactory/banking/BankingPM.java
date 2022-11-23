package designpatterns.creational.abstractFactory.banking;

import designpatterns.creational.abstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void ManageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
