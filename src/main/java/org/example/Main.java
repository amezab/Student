package org.example;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Car myCar = new Corolla();
        myCar.start();
        myCar.drive();
        myCar.honk();
        myCar.stop();
        System.out.println(myCar);




        Student student1 = new Student("Bob", 22, "Male", "123 Main St", 5551234);
        Student student = new Student("Alice", 20,  "female", "456); Oak St", 5555678);
        System.out.println("Student Name: " + student.getName() + ", Age: " + student.getAge() + " Address: " + student.getAddress() + ", Phone Number: " + student.getPhoneNumber());
        System.out.println("Student Age: " + student.getAge());
        System.out.println("Student1 Name: " + student1.getName());
        System.out.println("Student1 Age: " + student1.getAge());

    }
}