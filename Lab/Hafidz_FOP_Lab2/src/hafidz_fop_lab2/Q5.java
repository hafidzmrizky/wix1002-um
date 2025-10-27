/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafidz_fop_lab2;

import java.util.Random;

/**
 *
 * @author hafz's.
 */
public class Q5 {

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10001);

        System.out.println("Generated Random Number: " + randomNumber);

        int sumOfDigits = 0;
        int tempNumber = randomNumber;

        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            tempNumber /= 10;
            sumOfDigits += digit;
        }

        System.out.println("Sum of Digits: " + sumOfDigits);
    }
}
