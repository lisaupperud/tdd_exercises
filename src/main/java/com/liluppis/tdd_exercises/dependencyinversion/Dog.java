package com.liluppis.tdd_exercises.dependencyinversion;

public class Dog implements IAnimal {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating...");
    }

    @Override
    public void sleep() {
        System.out.println( name + " is sleeping...");
    }

    public void bark(){
        System.out.println( name + " says 'Woff woff!'");
    }

    @Override
    public String toString() {
        return name;
    }
}
