package com.company;

public class KIA extends Car{
    private String color;

    public KIA(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName()+
                "\ncolor: " + color);
    }
}
