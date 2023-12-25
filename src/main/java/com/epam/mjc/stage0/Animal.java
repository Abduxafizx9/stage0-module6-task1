package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfRaws;
    private boolean hasFur;
    public Animal()
    {
        color = "red";
        numberOfRaws = 1;
        hasFur = true;
    }
    public Animal(String color,int numberOfRaws,boolean hasFur){
        this.color = color;
        this.numberOfRaws = numberOfRaws;
        this.hasFur = hasFur;
    }
    public String getDescription(){
        return "This animal is mostly " + color + ". It has " +  numberOfRaws + (numberOfRaws>1?" paws":" paw")+ " and " + (hasFur?'a':"no") +" fur.";
    }



}
