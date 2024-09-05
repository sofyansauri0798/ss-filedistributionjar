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


public class VokalKonsonan {

    public static void main(String[] args) {
        String strHuruf = "j";

        if(
                strHuruf.equals("a") ||
                        strHuruf.equals("i") ||
                        strHuruf.equals("u") ||
                        strHuruf.equals("e") ||
                        strHuruf.equals("o")
        ){
            System.out.println("Ini adalah huruf Vokal ");
        }else {
            System.out.println("Ini adalah huruf Konsonan ");
        }

//        if(
//                strHuruf.equals("b") ||
//                        strHuruf.equals("c") ||
//                        strHuruf.equals("d") ||
//                        strHuruf.equals("f") ||
//                        strHuruf.equals("g") ||
//                        strHuruf.equals("h") ||
//                        strHuruf.equals("j") ||
//                        strHuruf.equals("k") ||
//                        strHuruf.equals("l") ||
//                        strHuruf.equals("m") ||
//                        strHuruf.equals("n") ||
//                        strHuruf.equals("p") ||
//                        strHuruf.equals("k")
//        ){
//            System.out.println("Ini adalah huruf Konsonan ");
//        }else {
//            System.out.println("Ini adalah huruf Vokal ");
//        }
    }
}