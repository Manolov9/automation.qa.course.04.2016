package com.company;

/**
 * Created by Ico on 5/9/2016.
 */
public class Tomcat extends Cat {

    public Tomcat(int age, String name, Gender sex) {
        super(age, name, sex);
    }

    @Override
    public Gender getSex() {
        return super.getSex();
    }

    @Override
    public void setSex(Gender sex) {
        super.setSex(Gender.Male);
    }
}
