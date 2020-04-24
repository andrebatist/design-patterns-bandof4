package ru.aplaksin.designpatterns.creational.abstractfactory.after.banking;

import ru.aplaksin.designpatterns.creational.abstractfactory.after.Developer;
import ru.aplaksin.designpatterns.creational.abstractfactory.after.ProjectManager;
import ru.aplaksin.designpatterns.creational.abstractfactory.after.ProjectTeamFactory;
import ru.aplaksin.designpatterns.creational.abstractfactory.after.Tester;

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
