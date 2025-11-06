/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafidz_fop_lab4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hafz's.
 */
public class L4Q5 {
    
    public static void main(String[] args) {
        final int POINT_THRESHOLD = 100;
        Scanner scanner = new Scanner(System.in);
       
        int player1Point = 0;
        int player2Point = 0;
        int turnCount = 0;
        int player1TurnCount = 0;
        int player2TurnCount = 0;
        boolean isTurnActive = false;
        
        System.out.print(".'* Two-player Dice Gacha Game! *'.\n"
                + "How to play?\n"
                + "1. If you're player number 1, you can roll first! And please wait your turn ;)\n"
                + "2. Throw the dice by confirming with an input of 1\n"
                + "3. If you're lucky, you'll be getting an extra roll if you land on six!!\n"
                + "4. The winner is who accumulated more than (>) 100 total points!\n"
                + "\n"
                + "> Enter 1 to acknowldge and to play! or other key to cancel and close\n"
                + "| Player 1 & Player 2 |>: ");
        
        int acknowledge = scanner.nextInt();
        if (acknowledge == 1) {
            isTurnActive = true;
        } else {
            System.out.println("| Game |>: Oh you don't want to play? it's ok-- it's not like i want you to play or anything!!");
            System.exit(0);
        }
        
        while (isTurnActive) {
            turnCount++;
            if (player1Point > POINT_THRESHOLD || player2Point > POINT_THRESHOLD) {
                break;
            }

            String playerCallsign = turnCount % 2 == 0 ? "Player 2" : "Player 1";
            randomDialog();
            
            boolean isRolled = false;
            while (!isRolled) {
                System.out.println("| Game Instruction |>: Enter 1 to roll, 2 to skip turn");
                System.out.print("| " + playerCallsign + " |>: ");
                int input = scanner.nextInt();
                switch (input) {
                    case 1 -> isRolled = true;
                    case 2 -> {
                        int rollResult = rollDice();
                        System.out.printf("| Game |>: You skipping this? no takesies backsies! You could've gotten an additional %d point!\n\n", rollResult);
                        isRolled = true;
                        continue;
                    }
                    default -> {
                        System.out.println("| Game Instruction |>: Invalid Option\n");
                        continue;
                    }
                }
                int rollResult = rollDice();
                if (playerCallsign.equals("Player 2")) {
                    player2Point+= rollResult;
                    player2TurnCount++;
                    System.out.printf("| %s's Dice |>: You got a %d dice on your roll, total point is now %d\n", playerCallsign, rollResult, player2Point);
                }
                else {
                    player1Point+= rollResult;
                    player1TurnCount++;
                    System.out.printf("| %s's Dice |>: You got a %d dice on your roll, total point is now %d\n", playerCallsign, rollResult, player1Point);
                }
                if (rollResult == 6) {
                    isRolled = false;
                    System.out.println("| Game |>: You got a lucky 6, which means you got another chance at rolling!\n");
                }
            }
            if (turnCount % 2 == 0) {
                delay(1);
                clearScreen();
                showLeaderboard(player1Point, player1TurnCount, player2Point, player2TurnCount, turnCount);
            }
        }
        
        // announcement goes here
        clearScreen();
        showLeaderboard(player1Point, player1TurnCount, player2Point, player2TurnCount, turnCount);
        
        if (player1Point > player2Point) {
            System.out.printf("| Game Result |>: Player 1 won with %d leading point vs Player 2 (%d), ending with %d total point\n"
                    , (player1Point - player2Point), player2Point, player1Point);
        } else if (player1Point == player2Point) {
            System.out.println("| Game Result |>: It was a tie!");
        } else {
            System.out.printf("| Game Result |>: Player 2 won with %d leading point vs Player 1 (%d), ending with %d total point\n"
                    , (player2Point - player1Point), player1Point, player2Point);
        }
        
    }
    
    public static void clearScreen() {
        for (int i = 0; i < 7; i++) {
            System.out.println();
        }
    }
    
    public static int rollDice() {
        final int MAX_DICE_VALUE = 6;
        Random random = new Random(); 
        return random.nextInt(MAX_DICE_VALUE) + 1;
    }
    
    public static void showLeaderboard(int player1Score, int player1TurnCount, int player2Score, int player2TurnCount, int totalTurns) {
        System.out.printf("\n.*' Leaderboard of Dice Gacha Game — %d total table-moving turns '*.\n", (totalTurns / 2));

        if (player1Score > player2Score) {
            System.out.printf("1. Player 1, Total Point: %d (in %d turns)\n", player1Score, player1TurnCount);
            System.out.printf("2. Player 2, Total Dice: %d (in %d turns)\n", player2Score, player2TurnCount);
        } else if (player2Score > player1Score) {
            System.out.printf("1. Player 2, Total Dice: %d (in %d turns)\n", player2Score, player2TurnCount);
            System.out.printf("2. Player 1, Total Dice: %d (in %d turns)\n", player1Score, player1TurnCount );
        } else {
            System.out.printf("1. Player 1, Total Dice: %d (in %d turns)\n", player1Score, player1TurnCount);
            System.out.printf("1. Player 2, Total Dice: %d (in %d turns)\n", player2Score, player2TurnCount);
            System.out.println("| Leaderboard Verdict | >: It’s a tie!");
        }
    }
    
    public static void randomDialog() {
        Random random = new Random(); 
        int choice = random.nextInt(6);
        
        String text = switch (choice) {
            case 0 -> "whoa--did you actually roll that, or did I just saw a glitch? oh- not rolled yet?";
            case 1 -> "Hold up--my luck sensors are overheating... okay, now toss that die!";
            case 2 -> "Ah yes, the ancient art of cube prophecy—let’s see what destiny says!";
            case 3 -> "Wait, did the dice just wink at me? never mind, roll before it changes its mind!";
            case 4 -> "Alright, hero of chance, it’s you versus probability--go ahead, roll for glory";
            case 5 -> "okay so maybe luck isn’t real but like... roll it anyway, just to be sure.";
            default -> "Oh, wait- what? This text shouldn't be readable (?)-- anyways, now roll!";  
        };
        
        System.out.println("\n| Game Commentator |>: " + text + "\n");
    }
    
    public static void delay(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            System.out.println("| Game System |>: Something interrupted the delay");
        }
    }
}
