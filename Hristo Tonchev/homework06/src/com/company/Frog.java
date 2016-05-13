package com.company;

/**
 * Created by Ico on 5/9/2016.
 */
public  class Frog extends Animals {


    public Frog(int age, String name, Gender sex) {
        super(age, name, sex);
    }


    @Override
    public void setSex(Gender sex) {
        super.setSex(sex);
    }

    @Override
    public Gender getSex() {
        return super.getSex();
    }
    @Override
    public void MakeSound()
    {
        System.out.println("Frog says malko kote sex ima li ! "+ this.getName());
    }
}

