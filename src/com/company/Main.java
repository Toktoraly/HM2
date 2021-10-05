package com.company;

public class Main {

    private static final BMW bmw = new BMW("BMW", 5);
    private static final KIA kia = new KIA("KIA", "Green");
    private static final Honda honda =new Honda("HONDA", "Fit");
    private static Car [] cars = {bmw, kia, honda};

    public static void main(String[] args) {
    for (Car car: cars){
        car.print();
    }
    }

    public static Car createObject(String className) {
        switch (className) {
            case "BMW" -> {
                return bmw;
            }
            case "KIA" -> {
                return kia;
            }
            case "Honda" -> {
                return honda;
            }
            default -> {
                return kia;
            }
        }
    }
}
