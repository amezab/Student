package org.example;

public class Dog {
    String name;
    int age;
    String breed;
    String color;
    String ownerName;

    public Dog(String name, int age, String breed, String color, String ownerName) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
        this.ownerName = ownerName;
    }
    // Getter and Setter for name
    // encapsulation example
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
