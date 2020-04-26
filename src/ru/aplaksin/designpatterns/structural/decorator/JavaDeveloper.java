package ru.aplaksin.designpatterns.structural.decorator;

public class JavaDeveloper implements Developer{
    @Override
    public String makeJob() {
        return "Write Java Code";
    }
}
