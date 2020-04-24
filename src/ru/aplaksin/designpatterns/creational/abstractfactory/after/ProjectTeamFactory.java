package ru.aplaksin.designpatterns.creational.abstractfactory.after;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}
