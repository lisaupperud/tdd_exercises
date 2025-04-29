package com.liluppis.tdd_exercises.dependencyinversion;

public class Bird implements IAnimal {

    private String birdType;

    public Bird(String birdType) {
        this.birdType = birdType;
    }

    @Override
    public void eat() {
        System.out.println("The " + birdType + " is eating...");

    }

    @Override
    public void sleep() {
        System.out.println("The " + birdType + " is sleeping...");
    }

    public void fly() {
        System.out.println("The " + birdType + " is flying!..");
    }

    @Override
    public String toString() {
        return birdType;
    }
}
