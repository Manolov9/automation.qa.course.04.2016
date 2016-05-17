package com.company;


public class Test {
    public static void main(String[] args) {

        //Create a hierarchy Dog, Frog, Cat, Kitten, Tomcat and define useful
        //constructors and methods. Dogs, frogs and cats are Animals. All animals
        //can produce sound (specified by the ISound interface). Kittens and
        //tomcats are cats. All animals are described by age, name and sex. Kittens
        //can be only female and tomcats can be only male. Each animal produces a specific
        //sound. Create arrays of different kinds of animals and calculate the average
        //age of each kind of animal using a static method

        //Make some animals and test their properties
        Kitten kitty = new Kitten(3, "Kitty");  //the sex is always female
        System.out.println(kitty.getName() + " - " + kitty.getAge() + " - " + kitty.getSex());
        kitty.ProduceSound();

        Tomkat tom = new Tomkat(5, "Tom");  //the sex is always male
        System.out.println(tom.getName() + " - " + tom.getAge() + " - " + tom.getSex());
        tom.ProduceSound();

        Dog dog = new Dog(6, "Doggy", Sex.male);
        System.out.println(dog.getName() + " - " + dog.getAge() + " - " + dog.getSex());
        dog.ProduceSound();

        Frog frog = new Frog(10, "Froggy", Sex.female);
        System.out.println(frog.getName() + " - " + frog.getAge() + " - " + frog.getSex());
        frog.ProduceSound();

        //Make array with different animals and calculate the average age for every animal type in the array
        Animals[] animals = {kitty, tom, frog, dog,
                            new Kitten(4, "Keit"),
                            new Tomkat(5, "Tomas"),
                            new Dog(11, "Rex", Sex.male),
                            new Frog(3, "Curmit", Sex.male)};
    }


}
