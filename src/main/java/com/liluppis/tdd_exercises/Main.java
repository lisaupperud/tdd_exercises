package com.liluppis.tdd_exercises;

import com.liluppis.tdd_exercises.dependencyinversion.Bird;
import com.liluppis.tdd_exercises.dependencyinversion.Dog;
import com.liluppis.tdd_exercises.dependencyinversion.IAnimal;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {






        // ------------------ EXERCISE 4 -------------------

        Bird bird = new Bird("Crow");
        Dog dog = new Dog("Ellie");

        // the following lines of code do not work since the list is of 'Bird'
        /*List<Bird> animalList = new ArrayList<>();
        animalList.add(bird);
        animalList.add(dog);*/

        // by changing the datatype of the list to the interface 'IAnimal'
        // we can add instances of both Bird and Dog since they implement the IF
        List<IAnimal> animalList = new ArrayList<>();
        animalList.add(bird);
        animalList.add(dog);
        System.out.println(animalList);




    }


}
