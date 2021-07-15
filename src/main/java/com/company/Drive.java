package com.company;

import java.util.ArrayList;

public class Drive {
    Bridge bridge = new Bridge();
    ArrayList<Car> allCars = new ArrayList<>();
    Car car0 = new Car("0",bridge,allCars,0,0);
    Car car1 = new Car("1",bridge,allCars,2,1);
    Car car2 = new Car("2",bridge,allCars,1,5);
    Car car3 = new Car("3",bridge,allCars,0,2);
    Car car4 = new Car("4",bridge,allCars,2,8);
    Car car5 = new Car("5",bridge,allCars,0,7);


    Drive(){
        allCars.add(car0);
        allCars.add(car1);
        allCars.add(car2);
        allCars.add(car3);
        allCars.add(car4);
        allCars.add(car5);
        car0.start();
        car1.start();
        car2.start();
        car3.start();
        car4.start();
        car5.start();
    }
}
