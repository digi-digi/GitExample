package com.company;

import java.util.Random;

public class Dicer {
    private int number;
    private int rollDice;

    public static int rollDice(int number) {
        int count = 0;
        Random r = new Random();

        for (int i = 0; i < number; i++) {
            count += r.nextInt(6) + 1;

        }
        return count;
    }
}
