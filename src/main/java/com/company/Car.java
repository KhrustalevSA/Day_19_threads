package com.company;

        import java.util.ArrayList;
        import java.util.Random;

public class Car extends Thread{
    String name;
    Bridge bridge;
    String previosDot;
    int count;
    int drive = 0;
    Random random = new Random();
    int randRow;
    int randCol;
    boolean randValue = true;
    ArrayList<Car> allCars;
    Go go = new Go();
    String num;

    Car(String name,Bridge bridge,ArrayList<Car> allCars){
        this.name = name;
        this.num = name;
        this.bridge = bridge;
        this.allCars = allCars;

    }
    public synchronized void run()  {
        while (randValue) {

            randRow = random.nextInt(2 + 1);
            randCol = random.nextInt(8 + 1);

            if ((bridge.bridge[randRow][randCol] == bridge.dot) || (bridge.bridge[randRow][randCol] == "---") ){
                randValue = false;


                bridge.bridge[randRow][randCol] = "~";

                if (randRow == 0 && randCol < 3)        // Присвоение имени машине
                    name = "◄" + name;
                if (randRow == 0 && randCol > 5)
                    name = "◄" + name;
                if (randRow == 2 && randCol < 3)
                    name = name + "►";
                if (randRow == 2 && randCol > 5)
                    name = name + "►";
                if (randRow == 1 && (randCol > 2 && randCol < 6))
                    name = name + "►";


                bridge.bridge[randRow][randCol] = name;

            } else {
                randValue = true;
            }


        }
        bridge.printBridge();
        while (drive != 300000000) {
            try {
                sleep(2200);
                go.go(allCars, name);
            } catch (InterruptedException e) {
                System.out.println("Exception catched");
            }


            drive++;
        }

    }
}
