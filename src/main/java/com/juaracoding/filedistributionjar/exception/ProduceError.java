package com.juaracoding.filedistributionjar.exception;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on August 19, 2024
@Author Sofyan Sauri a.k.a. Sofyan Sauri
Java Developer
Created on 05/09/2024 19:22
@Last Modified 05/09/2024 19:22
Version 1.0
*/
public class ProduceError {

    public static void main(String[] args) {
        String strToArr = "Ini ; Saya ... ";
        char [] chArr = strToArr.toCharArray();
        System.out.println(chArr.length);
        int intTampung = 0;
        for (int i = 0; i < chArr.length; i++) {
            intTampung = chArr[i];
            if(intTampung>=58 && intTampung<=64) {
                throw new IllegalArgumentException("Karakter Tidak Diperbolehkan ... "+chArr[i]);
            }
        }
        System.out.println("Berhasil kesini ....");
    }
}