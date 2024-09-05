package com.juaracoding.filedistributionjar.logikapemrograman;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on August 19, 2024
@Author Sofyan Sauri a.k.a. Sofyan Sauri
Java Developer
Created on 05/09/2024 19:26
@Last Modified 05/09/2024 19:26
Version 1.0
*/

import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sebuah kata : ");
        String strInput = sc.nextLine();
        //kodok --> str1
        //kodok --> str2
        // str1 equals str2

        String strDariKanan = "";
        char [] chArr = strInput.toCharArray();
        int intChArr = chArr.length;
        for (int i = 0; i < intChArr; i++) {
            strDariKanan = strDariKanan + chArr[(intChArr-1)-i];
        }
        System.out.println("Nilai STR Dari Kanan adalah : "+strDariKanan);
        if(strDariKanan.equalsIgnoreCase(strInput)){
            System.out.println("Ini Palindrom");
        }else {
            System.out.println("Bukan Palindrom");
        }
    }
}

