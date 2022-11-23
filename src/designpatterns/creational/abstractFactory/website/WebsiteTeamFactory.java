package designpatterns.creational.abstractFactory.website;

import designpatterns.creational.abstractFactory.Developer;
import designpatterns.creational.abstractFactory.ProjectManager;
import designpatterns.creational.abstractFactory.ProjectTeamFactory;
import designpatterns.creational.abstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
