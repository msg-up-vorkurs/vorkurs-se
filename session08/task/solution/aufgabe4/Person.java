package session08.task.solution.aufgabe4;

public abstract class Person {
    int passNumber;
    String name;
    String surname;
    int age;
    float height;
    float weight;

    public Person(int passNumber, String name, String surname, int age, float height, float weight) {
        this.passNumber = passNumber;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    abstract void sayHello();

    void sayHelloTo(Person other) {
        System.out.println("Hello, " + other.name + "! My name is " + this.name + ".");
    }

    void celebrateBirthday() {
        this.age = this.age + 1;
    }

    float calculateBMI() {
        return this.weight / (this.height*this.height);
    }

    float heightInInch() {
        return this.height * 39.3700787F;
    }
}
