/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafidz_fop_lab3;

import java.util.Random;

/**
 *
 * @author hafz's.
 */
public class L3Q2 {
    
    public static void main(String[] args) {
        Random rand = new Random();
        final int MAX_NUMBER = 5;
        int randNumber = rand.nextInt(MAX_NUMBER + 1);
        String toWord = switch (randNumber) {
            case 0 -> "Zero";
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";   
            case 5 -> "Five";
            default -> "Invalid Number (>5, Not In Case)";
        };
        System.out.printf("%d is %s\n", randNumber, toWord);
    }
}
