package session03.course;

public class Person {

    String firstName;
    String lastName;
    int age;
    float height;
    float weight;

    public Person(String firstName, String lastName, int age, float height, float weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    void sayHelloTo(Person somebody) {
        System.out.println("Hello " + somebody.firstName + ", I am " + this.fullName() + "!");
    }

    void sayHello() {
        System.out.println("Hello, my name is " + this.fullName() + " and I am " + this.age + " years old.");
    }

    String fullName() {
        return this.firstName + " " + this.lastName;
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

    public static void main(String[] args) {

        Person bob = new Person("Bob", "Doe", 26, 1.78F, 75.0F);
        Person alice = new Person("Alice", "Doe", 28, 1.65F, 55.0F);

        bob.sayHello();
        alice.sayHelloTo(bob);

        bob.celebrateBirthday();
        bob.sayHello();

        System.out.println("BMI of Bob: " + bob.calculateBMI());
        System.out.println("BMI of Alice: " + alice.calculateBMI());

        System.out.println("Bob's height in inches: " + bob.heightInInch());
    }
}
