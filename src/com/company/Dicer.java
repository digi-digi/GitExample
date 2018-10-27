package com.company;

public class Dicer {
private int number;
private int rollDice;

    public static int rollDice(int number) {
        int count = 0;
        for (int i = 0; i < number; i++){
            count +=(int)(Math.random())+1;

        }
        return count;
    }




}
