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

public class BubbleSortASCProsedural {
    public class BubbleSortASCProsedural {
        static StringBuilder sBuild = new StringBuilder();

        public static void main(String[] args) {
//		int val[] = {99,76,87,69,80};
            int val[] = {15,22,3,10,1,44};
            String bef = "";
            String aft = "";
            int initz = 0;
            int intContainer = 0;
            int loopNext = 0;

            sBuild.setLength(0);
            //before
            System.out.println("\n==BEFORE==");

            for (int num:val)
            {
                bef = sBuild.append(num).append(",").toString();
            }
            System.out.print(bef.substring(0,bef.length()-1));

            //logic
            for (int i =0 ; i < val.length ; i++ )
            {
                loopNext = 1;
                for (int j=0 ; j < val.length-1 ; j++)
                {
                    //if the current value is greater than the next value
                    if(val[j]>val[loopNext])
                    {
                        //then swap
                        intContainer = val[j];
                        val[j]=val[loopNext];
                        val[loopNext] = intContainer;
                    }
                    loopNext++;
                }
            }

            sBuild.setLength(0);
            //after
            System.out.println("\n==AFTER==");
            for (int num:val)
            {
                aft = sBuild.append(num).append(",").toString();
            }
            System.out.print(aft.substring(0,aft.length()-1));
        }
    }
}
