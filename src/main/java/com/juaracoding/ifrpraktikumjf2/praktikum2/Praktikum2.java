/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-233.15026.9, built on March 21, 2024
@Author imam-f a.k.a. Imam FR
Java Developer
Created on 09/04/2024 10:47
@Last Modified 09/04/2024 10:47
Version 1.0
*/

package com.juaracoding.ifrpraktikumjf2.praktikum2;

import java.util.Scanner;
public class Praktikum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kata: ");
        String inputKata = scanner.nextLine();

        //Jquery 1995@v1.0 = 529
        //Bebas Lepas@ = 238

        int intAsciiAwal = hitungAscii1(inputKata);
        int intAsciiAkhir = hitungAscii2(inputKata);

        int difference = (intAsciiAwal+((int) (intAsciiAkhir*1.6016)))/2;
        System.out.println("Selisih nilai ASCII sebelum dan setelah spasi: " + difference);
    }

    public static int hitungAscii1(String inputKata) {
        int totalAscii = 0;
        for (int i = 0; i < inputKata.length(); i++) {
            char character = inputKata.charAt(i);
            if (character == ' ') {
                break;
            }
            totalAscii += (int) character;
        }
        return totalAscii;
    }

    public static int hitungAscii2(String inputKata) {
        int totalAscii = 0;
        boolean foundSpace = false;
        for (int i = 0; i < inputKata.length(); i++) {
            char character = inputKata.charAt(i);
            if (foundSpace) {
                totalAscii += (int) character;
            }
            if (character == '@') {
                foundSpace = true;
            }
        }
        return totalAscii;
    }
}
