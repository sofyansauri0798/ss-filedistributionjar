package com.juaracoding.filedistributionjar.method;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on August 19, 2024
@Author Sofyan Sauri a.k.a. Sofyan Sauri
Java Developer
Created on 05/09/2024 19:31
@Last Modified 05/09/2024 19:31
Version 1.0
*/

import com.juaracoding.filedistributionjar.exception.SampleMethod;

public class PanggilMethod extends SampleMethod{

    public static void main(String[] args) {
//        SampleMethod sampleMethod = new SampleMethod();
    }

    public void init(){
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
    }

    public void init(String strNull){
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
    }

    public void methodBiasa(){
        init(null);
    }

    public void methodLuarBiasa(){
        init();
    }

    public void methodBiasaLuar(){
        init();
    }
}