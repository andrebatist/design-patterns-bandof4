package ru.aplaksin.designpatterns.creational.factorymethod;

public class PhpDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("Php developer writes Php code...");
    }
}
