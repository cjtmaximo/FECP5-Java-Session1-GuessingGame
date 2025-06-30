package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int secretNumber = (int)(Math.random() * 5) + 1;
        int numOfAttempts = 3;
        int guessCounter = 1;

        System.out.println("I'm thinking of a number between 1 and 5.");

        while (numOfAttempts > 0) {
            System.out.print("Guess " + guessCounter + ": ");
            int numToGuess = userInput.nextInt();

            if (numToGuess == secretNumber) {
                System.out.println("You guessed it!");
                System.out.println("You win!");
                break;
            } else {
                numOfAttempts--;
                guessCounter++;
                if (numOfAttempts == 0) {
                    System.out.println("You lose. The correct number was " + secretNumber + ".");
                } else {
                    System.out.println("Wrong guess.");
                }
            }
        }
    }
}