package ru.aplaksin.designpatterns.creational.abstractfactory.after.website;

import ru.aplaksin.designpatterns.creational.abstractfactory.after.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website...");
    }
}
