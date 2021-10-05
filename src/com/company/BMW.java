package com.company;

public class BMW extends Car{
    private int volume;

    public BMW(String name, int volume) {
        super(name);
        this.volume = volume;
    }


    @Override
    public void print() {
        System.out.println("Name: " + getName()+
                "\nVolume: " + volume);
    }
}
