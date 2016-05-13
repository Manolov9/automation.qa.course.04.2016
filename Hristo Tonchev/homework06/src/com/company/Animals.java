package com.company;

/**
 * Created by Ico on 5/9/2016.
 */
public abstract class Animals implements sound
{
    private int age;
    private String name;
    private Gender sex;

    public Animals(int age,String name){
        this.age=age;
        this.name=name;

    }
    public Animals(int name, String age, Gender sex)
    {
        this.sex=sex;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Gender getSex(){
        return sex;
    }
    public    void setSex(Gender sex)
    {
        this.sex=sex;
    }
    public abstract void MakeSound();






}
