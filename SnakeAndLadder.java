package com.bridgelabz;

import java.util.*;
public class SnakeAndLadder {

    static final int NO_PLAY = 0;
    static final int LADDER = 1;
    static final int SNAKE = 2;
    public static void main(String[] args) {
        int position = 0;

        while (position < 100) {

            Random ran = new Random();
            int dice = ran.nextInt(6) + 1;
            System.out.println("dice: " + dice);
            int optionCheck = ran.nextInt(3);
            System.out.println("Option Check : " + optionCheck);

            if (optionCheck == LADDER) {
                System.out.println("Ladder");
                position = position + dice;
            } else if (optionCheck == SNAKE) {
                System.out.println("Snake");
                position = position - dice;
            } else {
                System.out.println("No Play");
            }
            if (position < 0)
                position = 0;
            System.out.println("new position: " + position);
        }
        System.out.println("");
        System.out.println(" **You Won** ");
    }
}