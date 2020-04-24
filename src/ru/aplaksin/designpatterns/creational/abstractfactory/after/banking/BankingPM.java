package ru.aplaksin.designpatterns.creational.abstractfactory.after.banking;

import ru.aplaksin.designpatterns.creational.abstractfactory.after.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
