package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;  // Update field name to numberOfPaws
    private boolean hasFur;

    public Animal() {
        color = "red";
        numberOfPaws = 1;  // Update field initialization
        hasFur = true;
    }

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;  // Update parameter assignment
        this.hasFur = hasFur;
    }

    public String getDescription() {
        return "This animal is mostly " + color + ". It has " +  numberOfPaws + (numberOfPaws > 1 ? " paws" : " paw") + " and " + (hasFur ? 'a' : "no") + " fur.";
    }
}
