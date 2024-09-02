package com.juaracoding.filedistributionjar;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
                // Meminta input dari pengguna
                System.out.print("Masukkan nilai: ");
        int nilai = scanner.nextInt();

                // Menentukan grade berdasarkan nilai
                if (nilai < 50) {
                    System.out.println("Tidak Lulus");
                } else if (nilai >= 50 && nilai < 70) {
                    System.out.println("Grade: D");
                } else if (nilai >= 70 && nilai < 80) {
                    System.out.println("Grade: C");
                } else if (nilai >= 80 && nilai < 90) {
                    System.out.println("Grade: B");
                } else if (nilai >= 90 && nilai <= 100) {
                    System.out.println("Grade: A");
                } else {
                    System.out.println("Nilai tidak valid. Masukkan nilai antara 0 dan 100.");
                }

                scanner.close();
            }

    }