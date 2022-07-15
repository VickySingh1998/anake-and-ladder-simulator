package com.bridgelabz;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int position = 0;
        int diceRoll = (int) Math.floor(Math.random()*10) % 6 + 1;
        System.out.println("Player rolled the die and got "+diceRoll);
    }
}