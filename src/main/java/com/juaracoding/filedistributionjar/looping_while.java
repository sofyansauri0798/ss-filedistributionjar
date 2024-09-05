package com.juaracoding.filedistributionjar;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on August 19, 2024
@Author Sofyan Sauri a.k.a. Sofyan Sauri
Java Developer
Created on 03/09/2024 19:55
@Last Modified 03/09/2024 19:55
Version 1.0
*/

import java.util.Scanner;

public class looping_while {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array: ");
        int jumlahElemen = sc.nextInt();

        // Membuat array dengan ukuran yang ditentukan oleh pengguna
        int[] array = new int[jumlahElemen];

        // Meminta pengguna untuk memasukkan elemen-elemen array
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        // Menampilkan elemen-elemen yang telah dimasukkan
        System.out.println("Elemen-elemen dalam array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Elemen ke-" + (i + 1) + ": " + array[i]);
        }

        System.out.println("masukkan nilai : ");
        int target = sc.nextInt();
        boolean found = false;
        int i = 0;

        // Loop while untuk mencari angka dalam array
        while (i < array.length) {
            if (array[i] == target) {
                found = true;
                System.out.println("Angka " + target + " ditemukan pada indeks " + i);
                break; // Keluar dari loop setelah menemukan angka
            }
            i++;
        }

        if (!found) {
            System.out.println("Angka " + target + " tidak ditemukan.");
        }
    }
}
