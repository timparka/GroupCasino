package com.github.zipcodewilmington.casino.games.chuckluck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ChuckLuck {
   public void playGame() {
       Scanner scanner = new Scanner();
       Random rand = new Random();

       System.out.println("Welcome to Chuck Luck");
       System.out.println("Please put your wager down, enter amount ");
       int bet = scanner.nextInt();
       System.out.println("Thank you for your wager");

       ArrayList<Integer> playerRoll = new ArrayList<>();
   }
       public void displayRoll() {
           for (int i = 0; i < 3; i++) {
               playerRoll.add(rand.nextInt(6) + 1);
           }
           // this is creating three random dice rolls (set)


       Dice dice = new (Dice);


       System.out.println("Please choose a number between 1,2,3,4,5,6");
       int number = scanner.nextInt();
       System.out.println("You chose number" + number);

       int[] dice = new int[3];

       Random rand = new Random();
       for (int i = 0; i < 3; i++) {
           dice[i] = rand.nextInt(6) + 1;
       }

       int count = 0;
       for (int i = 0; i < 3; i++) {
           if (dice[i] == bet) {
               count++;
           }

       }
       int payout = 0;
       if (count == 1) {
           payout = 1;
       } else if (count == 2) {
           payout = 2;
       } else if (count == 3) {
           payout = 10;
       }
       System.out.println(Arrays.toString(dice) + "dice equal your guess.");
       System.out.println("Payout:" + payout);


       public static void main (String[]args){
           Scanner scanner = new Scanner(System.in);
           ChuckLuck game = new ChuckLuck();
           game.playGame();
           boolean keepPlaying = true;
           while (keepPlaying) {
               System.out.println("Would you like to play again? yes/no:");
               String response = scanner.next();
               if (response.equals("yes")) {
                   game.playGame();
               } else {
                   keepPlaying = false;
               }
           }
       }

   }
