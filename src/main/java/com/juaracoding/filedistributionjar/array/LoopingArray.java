package com.juaracoding.filedistributionjar.array;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on August 19, 2024
@Author Sofyan Sauri a.k.a. Sofyan Sauri
Java Developer
Created on 05/09/2024 19:13
@Last Modified 05/09/2024 19:13
Version 1.0
*/

import java.util.Random;

public class LoopingArray {

    public static void main(String[] args) {
        Random rand = new Random();
        int intArr [] = new int[10];
        int arrLength = intArr.length;
        int intAssign = 0;
        for (int i = 0; i < arrLength; i++) {
            intAssign = rand.nextInt(100);
            System.out.println(intAssign);
            intArr[i] = intAssign;
        }

        for (int i = 0; i < arrLength; i++) {
            System.out.println("Nilai intArr index ke "+i+" : "+intArr[i]);
        }

    }
}
