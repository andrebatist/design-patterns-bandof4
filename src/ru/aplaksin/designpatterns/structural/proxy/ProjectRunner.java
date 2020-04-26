package ru.aplaksin.designpatterns.structural.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://www.github.com/andre/realProject");

        project.run();
    }
}
