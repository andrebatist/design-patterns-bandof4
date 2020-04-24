package ru.aplaksin.designpatterns.creational.abstractfactory.after.banking;

import ru.aplaksin.designpatterns.creational.abstractfactory.after.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code...");
    }
}
