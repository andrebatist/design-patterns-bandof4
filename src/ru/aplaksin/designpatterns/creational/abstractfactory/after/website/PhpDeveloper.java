package ru.aplaksin.designpatterns.creational.abstractfactory.after.website;

import ru.aplaksin.designpatterns.creational.abstractfactory.after.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
