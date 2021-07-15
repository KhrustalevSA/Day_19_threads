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

    Car(String name,Bridge bridge){
        this.name = name;
        this.bridge = bridge;

    }
    public synchronized void run()  {
        while (randValue) {
            randRow = random.nextInt(2 + 1);
            randCol = random.nextInt(8 + 1);

            if ((bridge.bridge[randRow][randCol] == bridge.dot) || (bridge.bridge[randRow][randCol] == "---") ){
                randValue = false;


                bridge.bridge[randRow][randCol] = "~";

                if (randRow == 0 && randCol < 3)
                    name = "◄" + name;
                if (randRow == 0 && randCol > 5)
                    name = "◄" + name;
                if (randRow == 2 && randCol < 3)
                    name = name + "►";
                if (randRow == 2 && randCol > 5)
                    name = name + "►";
                if (randRow == 1 && (randCol > 2 && randCol < 6))
                    name = name + "►";

                try {
                    sleep( (long) (Math.random() * 10000) );
                } catch (InterruptedException e){
                    System.out.println("InterruptedException is catched");
                }

                bridge.bridge[randRow][randCol] = name;

            } else {
                randValue = true;
            }


        }





        bridge.printBridge();

    }
}
