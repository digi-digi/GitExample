package com.company;

public class Dog {
    String name;
    private int numberOfLegs;

    public Dog(String name) {
        this();
        this.name = name;
    }

    public Dog() {
        this.numberOfLegs = 4;
    }

    public void bark(){
        System.out.println("hau hau");
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public static void sayHou (){
        System.out.println("Hou");
    }
}
