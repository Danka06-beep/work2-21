package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int SIZE = 8;
        int[][] colors = new int[SIZE][SIZE];
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {

                colors[i][j] = random.nextInt(256);
            }
        }
        print(colors);

        System.out.println("лялялял");

        int[][] rotatedColors = new int[SIZE][SIZE];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                rotatedColors[i][j] = colors[SIZE - 1 - j][i];
            }
        }
        print(rotatedColors);
    }

    static void print(int[][] colors) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                System.out.format("%4d", colors[i][j]);
            }
        }
        System.out.println();
    }
}


