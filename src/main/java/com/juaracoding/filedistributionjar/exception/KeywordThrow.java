package com.juaracoding.filedistributionjar.exception;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on August 19, 2024
@Author Sofyan Sauri a.k.a. Sofyan Sauri
Java Developer
Created on 05/09/2024 19:21
@Last Modified 05/09/2024 19:21
Version 1.0
*/
import java.util.Scanner;

public class KeywordThrow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the keyword: ");
        String strKeyword = sc.nextLine();
        if(strKeyword.contains("Saya")){
//            System.out.println("Anda Memasukkan Kata-kata Terlarang ... !!");
            throw new IllegalArgumentException("Anda Memasukkan Kata-kata Terlarang ... !!, yaitu "+strKeyword);
        }

//        double douX = 1.06 + 3.45;
//        System.out.println("DOUX NUMBER : "+douX);
    }

    // Aji
    public static void getData() throws ArithmeticException {
        //logic IO Handling
    }

    public static void catchData(){
        try{
            getData();
        }catch(ArithmeticException e){
            System.out.println(e);
            //file
            //log table
            //SMTP
        }
    }
}
