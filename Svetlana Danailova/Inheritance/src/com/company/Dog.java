package com.company;

public class Dog extends Animals
        implements ISound {

    //Constructor
    public Dog(int age, String name, Sex sex) {
        super(age, name, sex);
    }

    //Interface method
    public void ProduceSound()
    {
        System.out.println("Bau");
    }
}
