package com.company;

import java.util.ArrayList;

public class Bridge {
    String dot = ".";
    String spaceZero = "";
    String lines = "---";
    String[][] bridge = new String[][]{{dot,dot,dot,"╚══","═══","══╝",dot,dot,dot},
                                      {spaceZero,spaceZero,spaceZero,lines,lines,lines,spaceZero,spaceZero,spaceZero},
                                      {dot,dot,dot,"╔══","═══","══╗",dot,dot,dot}};

    public synchronized void printBridge(){

        System.out.println("-----------------------------------------------------");

        for (int i = 0; i != 3; i++ ) {
            for (int j = 0; j != 9; j++)
                System.out.print("\t" + bridge[i][j] );
            System.out.println("");

            System.out.println("");
        }
    }
    public boolean bridgeIsEmpty(){
        if (bridge[1][3] == "---" && bridge[1][4] == "---" && bridge[1][5] == "---"){
            return true;
        }
        return false;
    }

    public String someCarOnBridge() {
        if (!bridgeIsEmpty()) {
            if (bridge[1][3].contains("►") || bridge[1][4].contains("►") || bridge[1][5].contains("►")){
                return "Right";
            } else {
                return "Left";
            }
        }
        return "";
    }

}
