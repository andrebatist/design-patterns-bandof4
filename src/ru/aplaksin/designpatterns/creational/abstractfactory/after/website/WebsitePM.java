package ru.aplaksin.designpatterns.creational.abstractfactory.after.website;

import ru.aplaksin.designpatterns.creational.abstractfactory.after.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project...");
    }
}
