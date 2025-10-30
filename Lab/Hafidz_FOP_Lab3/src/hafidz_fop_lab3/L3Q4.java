/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafidz_fop_lab3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hafz's.
 */
public class L3Q4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        final int MAX_TURN = 2;
        int current_turn = 0;
        final int MAX_DICE_FACE_VALUE = 6;
        int playerAValue = 0;
        int playerBValue = 0;
        System.out.print(",*' Dice Gacha! '*,");

        do {
            int whosTurn = current_turn % 2 == 0 ? 1 : 2;
            System.out.print("\n[P" + whosTurn + " Turn] | Enter 1 to roll!\n> Input: ");
            int input = scanner.nextInt();
            if (input != 1) {
                System.out.println("Invalid option!");
            }
            if (input == 1) {
                int dice = rand.nextInt(MAX_DICE_FACE_VALUE) + 1;

                if (whosTurn == 1)
                    playerAValue += dice;
                else
                    playerBValue += dice;

                System.out.println("[P" + whosTurn + "]: Dice | Got a " + dice);

                System.out.print("\n.*' Leaderboard of GACHA  '*.\n");

                if (playerAValue > playerBValue) {
                    System.out.printf("1. Player 1, Total Dice: %d\n", playerAValue);
                    System.out.printf("2. Player 2, Total Dice: %d\n", playerBValue);
                } else if (playerBValue > playerAValue) {
                    System.out.printf("1. Player 2, Total Dice: %d\n", playerBValue);
                    System.out.printf("2. Player 1, Total Dice: %d\n", playerAValue);
                } else {
                    System.out.printf("1. Player 1, Total Dice: %d\n", playerAValue);
                    System.out.printf("1. Player 2, Total Dice: %d\n", playerBValue);
                    System.out.println("Leaderboard | It’s a tie!");
                }

                current_turn++;
            }
        } while (current_turn < (MAX_TURN * 2));
        
        if (playerAValue > playerBValue) {
            System.out.println("\nGame: | Player 1 won with the total Dice of " + playerAValue);
        } else if (playerAValue == playerBValue) {
             System.out.println("\nGame: | It was a tie!");
        } else {
            System.out.println("\nGame: | Player 2 won with the total Dice of " + playerBValue);
        }

    }
}
