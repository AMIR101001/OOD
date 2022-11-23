package designpatterns.creational.abstractFactory.banking;

import designpatterns.creational.abstractFactory.Developer;
import designpatterns.creational.abstractFactory.ProjectManager;
import designpatterns.creational.abstractFactory.ProjectTeamFactory;
import designpatterns.creational.abstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
