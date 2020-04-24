package ru.aplaksin.designpatterns.creational.abstractfactory.after.banking;

import ru.aplaksin.designpatterns.creational.abstractfactory.after.Tester;

public class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QA tester tests banking code...");
    }
}
