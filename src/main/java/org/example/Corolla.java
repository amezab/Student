package org.example;

public class Corolla implements Car{

    @Override
    public void start() {
        System.out.println("Corolla started.");

    }

    @Override
    public void stop() {
        System.out.println("Corolla stopped.");

    }

    @Override
    public void drive() {

        System.out.println("Corolla is driving.");

    }

    @Override
    public void honk() {
        System.out.println("Corolla honked.");


    }


}