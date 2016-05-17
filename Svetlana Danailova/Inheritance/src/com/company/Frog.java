package com.company;

public class Frog extends Animals
        implements ISound {

    //Constructor
    public Frog(int age, String name, Sex sex) {
        super(age, name, sex);
    }

    //Interface method
    public void ProduceSound()
    {
        System.out.println("Crrr");
    }
}