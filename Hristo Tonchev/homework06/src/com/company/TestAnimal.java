package com.company;

import com.sun.javafx.css.CalculatedValue;

import java.util.*;

public class TestAnimal {

    public static void main(String[] args) {
	Dog[] dogsArray ={
            new Dog(8,"Sharo", Gender.Male),
            new Dog(1,"Maro", Gender.Male),
            new Dog(7,"Sara", Gender.Female),
            new Dog(4,"Mara", Gender.Female)
    };
        Cat[] catsArray = {
                new Kitten(7, "Maria",Gender.Female),
                new Kitten( 1,"Penka",Gender.Female ),
                new Tomcat( 8,"Ivo" ,Gender.Male ),
                new Tomcat( 6,"Tom" ,Gender.Male )
        };
        Frog[] frogsArray = {
                new Frog( 7, "Maria",Gender.Female),
                new Frog(2, "Desi",Gender.Female),
                new Frog(232, "Shaso",Gender.Male)
        };
        List<Animals> allAnimals = new List<Animals>() {

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Animals> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Animals animals) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Animals> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Animals> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public Animals get(int index) {
                return null;
            }

            @Override
            public Animals set(int index, Animals element) {
                return null;
            }

            @Override
            public void add(int index, Animals element) {

            }

            @Override
            public Animals remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Animals> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Animals> listIterator(int index) {
                return null;
            }

            @Override
            public List<Animals> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        Collections.addAll(allAnimals, dogsArray);
        Collections.addAll(allAnimals, catsArray);
        Collections.addAll(allAnimals, frogsArray);

        System.out.println("\"Average age of dogs in the array is "+ dogsArray);
        System.out.println("\"Average age of dogs in the array is "+ catsArray);
        System.out.println("\"Average age of dogs in the array is "+ frogsArray);

        dogsArray[0].MakeSound();
        catsArray[0].MakeSound();
        frogsArray[0].MakeSound();

    }
    }

