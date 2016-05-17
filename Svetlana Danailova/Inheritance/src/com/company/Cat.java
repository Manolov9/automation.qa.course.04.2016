package com.company;


public abstract class Cat extends Animals
        implements ISound {

    //Constructor
    public Cat(int age, String name, Sex sex) {
        super(age, name, sex);
    }

    //Interface method
    public void ProduceSound()
    {
        System.out.println("Miauu");
    }
}

