package ru.aplaksin.designpatterns.creational.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "SuperProject","SourceCode src = new SourceCode();");

        System.out.println(master);

        //before
        Project masterClone = (Project) master.copy();
        System.out.println("\n====================================");
        System.out.println(masterClone);

        System.out.println("\n====================================\n");

        //after
        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone2 = factory.cloneProject();
        System.out.println("\n====================================\n");
        System.out.println(masterClone2);
    }
}
