package LabTest1;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return String.format("%s (age=%s)", this.name, this.age);
    }
}
