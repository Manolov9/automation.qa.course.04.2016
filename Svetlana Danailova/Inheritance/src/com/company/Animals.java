package com.company;

public abstract class Animals {


    //Fields
    private int age;
    private String name;
    private Sex sex;

    //Constructor
    public Animals (int age, String name, Sex sex)
    {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    //Properties

    public int getAge() {
        return this.age;
    }

    public void setAge(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }

        this.age = value;
    }

    public String getName()
    {
        return this.name;
    }

    public Sex getSex()
    {
        return this.sex;
    }




}
