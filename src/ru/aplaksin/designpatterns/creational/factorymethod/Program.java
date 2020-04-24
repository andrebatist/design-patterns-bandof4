package ru.aplaksin.designpatterns.creational.factorymethod;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperFactoryBySpeciality("php");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory createDeveloperFactoryBySpeciality(String speciality) {
            if (speciality.equalsIgnoreCase("java")) return new JavaDeveloperFactory();
            if (speciality.equalsIgnoreCase("c++")) return new CppDeveloperFactory();
            if (speciality.equalsIgnoreCase("php")) return new PhpDeveloperFactory();
            throw new RuntimeException(speciality + " is unknown");
        }

}
