package com.company;

/**
 * Created by Ico on 5/9/2016.
 */
public  class Cat extends Animals {


    public Cat(int age, String name, Gender sex) {
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
       System.out.println("Cat says Cherni kotaracii s lyskavi mustacii Meauww! "+ this.getName());
   }
}