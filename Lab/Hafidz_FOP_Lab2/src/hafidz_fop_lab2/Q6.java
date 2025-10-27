/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafidz_fop_lab2;

import java.util.Scanner;

/**
 *
 * @author hafz's.
 */
public class Q6 {

    public static double fahrenheitToCelcius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double M, Q, initialTemp, finalTemp;

        System.out.print("Enter the amount of water in gram: ");
        M = scanner.nextDouble();
        M /= 1000;
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        initialTemp = scanner.nextDouble();
        System.out.print("Enter the final temperature in Fahrenheit: ");
        finalTemp = scanner.nextDouble();

        // fahrenheit -> celcius
        initialTemp = fahrenheitToCelcius(initialTemp);
        finalTemp = fahrenheitToCelcius(finalTemp);

        Q = M * (finalTemp - initialTemp) * 4184;
        System.out.printf("The energy needed is %.6e\n", Q);
    }
}
