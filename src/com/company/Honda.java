package com.company;

public class Honda extends Car{
    private String model;

    public Honda(String name, String model) {
        super(name);
        this.model = model;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName()+
                "\nmodel: " + model);
    }
}
