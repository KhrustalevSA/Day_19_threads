package com.company;

import java.util.ArrayList;

public class Drive {
    Bridge bridge = new Bridge();
    ArrayList<Car> allCars = new ArrayList<>();
    Car car0 = new Car("0",bridge);
    Car car1 = new Car("1",bridge);
    Car car2 = new Car("2",bridge);
    Car car3 = new Car("3",bridge);
    Car car4 = new Car("4",bridge);
    Car car5 = new Car("5",bridge);
    Car car6 = new Car("6",bridge);
    Car car7 = new Car("7",bridge);
    Car car8 = new Car("8",bridge);
    Car car9 = new Car("9",bridge);

    Drive(){
        allCars.add(car0);
        allCars.add(car1);
        allCars.add(car2);
        allCars.add(car3);
        allCars.add(car4);
        allCars.add(car5);
        allCars.add(car6);
        allCars.add(car7);
        allCars.add(car8);
        allCars.add(car9);
        car0.start();
        car1.start();
        car2.start();
        car3.start();
        car4.start();
        car5.start();
    }
}
