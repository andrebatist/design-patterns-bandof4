package ru.aplaksin.designpatterns.creational.abstractfactory.after.website;

import ru.aplaksin.designpatterns.creational.abstractfactory.after.Developer;
import ru.aplaksin.designpatterns.creational.abstractfactory.after.ProjectManager;
import ru.aplaksin.designpatterns.creational.abstractfactory.after.ProjectTeamFactory;
import ru.aplaksin.designpatterns.creational.abstractfactory.after.Tester;

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
