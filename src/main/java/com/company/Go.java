package com.company;

import java.util.ArrayList;

public class Go {

    public synchronized void go(ArrayList<Car> allCars,String name) throws InterruptedException {
        for (int i=0; i != allCars.size(); i++){
            if(allCars.get(i).name == name){
                Car car = allCars.get(i);
                int row = car.randRow;
                int col = car.randCol;
                int locked = 0;





                if (row == 0 && col == 0){
                    Thread.sleep( (long) (locked) );

                    while (car.bridge.bridge[2][0] != car.bridge.dot) {
                        wait();
                    }

                    if (car.bridge.bridge[2][0] == car.bridge.dot) {
                        car.randRow = 2;
                        car.randCol = 0;
                        car.name = car.num + "►";
                        car.bridge.bridge[row][col] = car.bridge.dot;
                        car.bridge.bridge[car.randRow][car.randCol] = car.name;

                    }
                    car.bridge.printBridge();
                    notify();
                }

                if (row == 2 && col == 0 ) {
                    Thread.sleep((long) (locked));

                    while (car.bridge.bridge[2][1] != car.bridge.dot) {
                        wait();
                    }

                    if (car.bridge.bridge[2][1] == car.bridge.dot) {
                        car.randRow = 2;
                        car.randCol = 1;
                        car.bridge.bridge[row][col] = car.bridge.dot;
                        car.bridge.bridge[car.randRow][car.randCol] = car.name;
                    }
                    car.bridge.printBridge();
                    notify();
                }

                if (row == 2 && col == 1 ) {
                    Thread.sleep((long) (locked));

                    while (car.bridge.bridge[2][2] != car.bridge.dot) {
                        wait();
                    }

                    if (car.bridge.bridge[2][2] == car.bridge.dot) {
                        car.randRow = 2;
                        car.randCol = 2;
                        car.bridge.bridge[row][col] = car.bridge.dot;
                        car.bridge.bridge[car.randRow][car.randCol] = car.name;
                    }
                    car.bridge.printBridge();
                    notify();
                }

                if (row == 2 && col == 2 ) {
                    Thread.sleep((long) (locked));

                    if (car.bridge.someCarOnBridge() == "Right" || car.bridge.bridgeIsEmpty()){

                        while (car.bridge.bridge[1][3] != car.bridge.lines) {
                            wait();
                        }

                        if (car.bridge.bridge[1][3] == car.bridge.lines) {
                            car.randRow = 1;
                            car.randCol = 3;
                            car.bridge.bridge[row][col] = car.bridge.dot;
                            car.bridge.bridge[car.randRow][car.randCol] = car.name;
                        }
                        car.bridge.printBridge();
                        notify();
                    }
                }



                if (row == 1 && col == 3 && name.contains("►")) {
                    Thread.sleep((long) (locked));

                    if (car.bridge.someCarOnBridge() == "Right"){

                        while (car.bridge.bridge[1][4] != car.bridge.lines) {
                            wait();
                        }

                        if (car.bridge.bridge[1][4] == car.bridge.lines) {
                            car.randRow = 1;
                            car.randCol = 4;
                            car.bridge.bridge[row][col] = car.bridge.lines;
                            car.bridge.bridge[car.randRow][car.randCol] = car.name;
                        }
                        car.bridge.printBridge();
                        notify();
                    }
                }

                if (row == 1 && col == 4) {
                    Thread.sleep((long) (locked));

                    if (car.bridge.someCarOnBridge() == "Right"){

                        while (car.bridge.bridge[1][5] != car.bridge.lines) {
                            wait();
                        }

                        if (car.bridge.bridge[1][5] == car.bridge.lines) {
                            car.randRow = 1;
                            car.randCol = 5;
                            car.bridge.bridge[row][col] = car.bridge.lines;
                            car.bridge.bridge[car.randRow][car.randCol] = car.name;
                        }
                        car.bridge.printBridge();
                        notify();
                    }

                    if (car.bridge.someCarOnBridge() == "Left" ){

                        while (car.bridge.bridge[1][3] != car.bridge.lines) {
                            wait();
                        }

                        if (car.bridge.bridge[1][3] == car.bridge.lines) {
                            car.randRow = 1;
                            car.randCol = 3;
                            car.bridge.bridge[row][col] = car.bridge.lines;
                            car.bridge.bridge[car.randRow][car.randCol] = car.name;
                        }
                        car.bridge.printBridge();
                        notify();
                    }
                }


                if (row == 1 && col == 5 && name.contains("►")) {
                    Thread.sleep((long) (locked));

                    while (car.bridge.bridge[2][6] != car.bridge.dot) {
                        wait();
                    }

                    if (car.bridge.bridge[2][6] == car.bridge.dot) {
                        car.randRow = 2;
                        car.randCol = 6;
                        car.bridge.bridge[row][col] = car.bridge.lines;
                        car.bridge.bridge[car.randRow][car.randCol] = car.name;
                    }
                    car.bridge.printBridge();
                    notify();

                }

                if (row == 2 && col == 6 ) {
                    Thread.sleep((long) (locked));

                    while (car.bridge.bridge[2][7] != car.bridge.dot) {
                        wait();
                    }

                    if (car.bridge.bridge[2][7] == car.bridge.dot) {
                        car.randRow = 2;
                        car.randCol = 7;
                        car.bridge.bridge[row][col] = car.bridge.dot;
                        car.bridge.bridge[car.randRow][car.randCol] = car.name;
                    }
                    car.bridge.printBridge();
                    notify();

                }


                if (row == 2 && col == 7 ) {
                    Thread.sleep((long) (locked));

                    while (car.bridge.bridge[2][8] != car.bridge.dot) {
                        wait();
                    }

                    if (car.bridge.bridge[2][8] == car.bridge.dot) {
                        car.randRow = 2;
                        car.randCol = 8;
                        car.bridge.bridge[row][col] = car.bridge.dot;
                        car.bridge.bridge[car.randRow][car.randCol] = car.name;
                    }
                    car.bridge.printBridge();
                    notify();

                }

                if (row == 2 && col == 8){
                    Thread.sleep( (long) (locked) );

                    while (car.bridge.bridge[0][8] != car.bridge.dot) {
                        wait();
                    }

                    if (car.bridge.bridge[0][8] == car.bridge.dot) {
                        car.randRow = 0;
                        car.randCol = 8;
                        car.name = "◄" + car.num;
                        car.bridge.bridge[row][col] = car.bridge.dot;
                        car.bridge.bridge[car.randRow][car.randCol] = car.name;

                    }
                    car.bridge.printBridge();
                    notify();
                }

                if (row == 0 && col == 8){
                    Thread.sleep( (long) (locked) );

                    while (car.bridge.bridge[0][7] != car.bridge.dot) {
                        wait();
                    }

                    if (car.bridge.bridge[0][7] == car.bridge.dot) {
                        car.randRow = 0;
                        car.randCol = 7;
                        car.bridge.bridge[row][col] = car.bridge.dot;
                        car.bridge.bridge[car.randRow][car.randCol] = car.name;

                    }
                    car.bridge.printBridge();
                    notify();
                }

                if (row == 0 && col == 7 ){
                    Thread.sleep( (long) (locked) );

                    while (car.bridge.bridge[0][6] != car.bridge.dot) {
                        wait();
                    }

                    if (car.bridge.bridge[0][6] == car.bridge.dot) {
                        car.randRow = 0;
                        car.randCol = 6;
                        car.bridge.bridge[row][col] = car.bridge.dot;
                        car.bridge.bridge[car.randRow][car.randCol] = car.name;

                    }
                    car.bridge.printBridge();
                    notify();
                }


                if (row == 0 && col == 6 && name.contains("◄")) {
                    Thread.sleep((long) (locked));

                    if (car.bridge.someCarOnBridge() == "Left" || car.bridge.bridgeIsEmpty()){

                        while (car.bridge.bridge[1][5] != car.bridge.lines) {
                            wait();
                        }

                        if (car.bridge.bridge[1][5] == car.bridge.lines) {
                            car.randRow = 1;
                            car.randCol = 5;
                            car.bridge.bridge[row][col] = car.bridge.dot;
                            car.bridge.bridge[car.randRow][car.randCol] = car.name;
                        }
                        car.bridge.printBridge();
                        notify();
                    }
                }

                if (row == 1 && col == 5 && name.contains("◄")) {
                    Thread.sleep((long) (locked));

                    if (car.bridge.someCarOnBridge() == "Left" ){

                        while (car.bridge.bridge[1][4] != car.bridge.lines) {
                            wait();
                        }

                        if (car.bridge.bridge[1][4] == car.bridge.lines) {
                            car.randRow = 1;
                            car.randCol = 4;
                            car.bridge.bridge[row][col] = car.bridge.lines;
                            car.bridge.bridge[car.randRow][car.randCol] = car.name;
                        }
                        car.bridge.printBridge();
                        notify();
                    }
                }

                if (row == 1 && col == 3 && name.contains("◄")) {
                    Thread.sleep((long) (locked));

                    while (car.bridge.bridge[0][2] != car.bridge.dot) {
                        wait();
                    }

                    if (car.bridge.bridge[0][2] == car.bridge.dot) {
                        car.randRow = 0;
                        car.randCol = 2;
                        car.bridge.bridge[row][col] = car.bridge.lines;
                        car.bridge.bridge[car.randRow][car.randCol] = car.name;
                    }
                    car.bridge.printBridge();
                    notify();
                }

                if (row == 0 && col == 2 ) {
                    Thread.sleep((long) (locked));

                    while (car.bridge.bridge[0][1] != car.bridge.dot) {
                        wait();
                    }

                    if (car.bridge.bridge[0][1] == car.bridge.dot) {
                        car.randRow = 0;
                        car.randCol = 1;
                        car.bridge.bridge[row][col] = car.bridge.dot;
                        car.bridge.bridge[car.randRow][car.randCol] = car.name;
                    }
                    car.bridge.printBridge();
                    notify();
                }

                if (row == 0 && col == 1 ) {
                    Thread.sleep((long) (locked));

                    while (car.bridge.bridge[0][0] != car.bridge.dot) {
                        wait();
                    }

                    if (car.bridge.bridge[0][0] == car.bridge.dot) {
                        car.randRow = 0;
                        car.randCol = 0;
                        car.bridge.bridge[row][col] = car.bridge.dot;
                        car.bridge.bridge[car.randRow][car.randCol] = car.name;
                    }
                    car.bridge.printBridge();
                    notify();
                }

                notify();
            }
            notify();

        }
    }
}
