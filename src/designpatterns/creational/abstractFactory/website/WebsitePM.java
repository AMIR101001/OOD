package designpatterns.creational.abstractFactory.website;

import designpatterns.creational.abstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void ManageProject() {
        System.out.println("Website PM manges Website project...");
    }
}
