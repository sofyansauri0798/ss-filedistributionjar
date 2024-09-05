package com.juaracoding.filedistributionjar.array;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on August 19, 2024
@Author Sofyan Sauri a.k.a. Sofyan Sauri
Java Developer
Created on 05/09/2024 19:06
@Last Modified 05/09/2024 19:06
Version 1.0
*/

import java.util.Random;

public class Array2Dimensi {
    Random rand = new Random();
    int [][] intArr2 = {{1,2,3,4},{5,6,7}};
        System.out.println(intArr2[1][2]);
        for(int i=0; i<intArr2.length; i++){
        for (int j = 0; j < intArr2[i].length; j++) {
            System.out.print(intArr2[i][j]+" -- ");
        }
        System.out.println();
    }

    intArr2 = new int[5][5];
    int intPrint = 0;
        for(int i=0; i<intArr2.length; i++){
        for (int j = 0; j < intArr2[i].length; j++) {
            intPrint = rand.nextInt(100);
            System.out.print(intPrint+" --");
            intArr2[i][j] = intPrint;
        }
        System.out.println();
    }

        System.out.println("======================");
        for(int i=0; i<intArr2.length; i++){
        for (int j = 0; j < intArr2[i].length; j++) {
            System.out.print(intArr2[i][j]+" -- ");
        }
        System.out.println();
    }
}

