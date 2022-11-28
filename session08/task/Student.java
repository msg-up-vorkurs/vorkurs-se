package session08.task;

public class Student {
    int passNumber;
    String name;
    String surname;
    int age;
    float height;
    float weight;

    String studyProgramme;
    int currentSemester;

    public Student(int passNumber, String name, String surname, int age, float height, float weight, String studyProgramme, int currentSemester) {
        this.passNumber = passNumber;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.weight = weight;

        this.studyProgramme = studyProgramme;
        this.currentSemester = currentSemester;
    }

    void sayHello() {
        System.out.println("Hello, my name is " + this.name + " " + this.surname);
    }

    // Aufgabe 2: Nachdem Sie Vererbung implementiert haben: Gibt es eine Möglichkeit, die folgenden 4 Methoden zu vereinfachen?
    void sayHelloTo(Person other) {
        System.out.println("Hello, " + other.name + "! My name is " + this.name + ".");
    }

    void sayHelloTo(Employee other) {
        System.out.println("Hello, " + other.name + "! My name is " + this.name + ".");
    }

    void sayHelloTo(Student other) {
        System.out.println("Hello, " + other.name + "! My name is " + this.name + ".");
    }

    void sayHelloTo(Teacher other) {
        System.out.println("Hello, " + other.name + "! My name is " + this.name + ".");
    }

    // Aufgabe 3:
    // Überladen Sie die sayHelloTo-Methoden in den KLassen Employee, Student und Teacher.
    // Der Employee soll anschließend neben "Hallo" auch seine Abteilung bekannt geben.
    // Der Student soll neben "Hallo" das eigene Studienfach ausgeben.
    // Zu guter Letzt soll der Teacher sein Lehrfach ausgeben.

    void celebrateBirthday() {
        this.age = this.age + 1;
    }

    float calculateBMI() {
        return this.weight / (this.height*this.height);
    }

    float heightInInch() {
        return this.height * 39.3700787F;
    }

    void changeStudyProgramme(String studyProgramme) {
        this.studyProgramme = studyProgramme;
    }

    void advanceSemester() {
        this.currentSemester += 1;
    }
}
