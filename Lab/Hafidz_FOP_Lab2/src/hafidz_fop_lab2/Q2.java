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
public class Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double P, D, R, M;
        int Y;
        System.out.print("Enter the price of the car: ");
        P = scanner.nextDouble();
        System.out.print("Enter the down payment: ");
        D = scanner.nextDouble();
        System.out.print("Enter the Interest Rate (%): ");
        R = scanner.nextDouble();
        System.out.print("Enter the loan duration (Year): ");
        Y = scanner.nextInt();
        M = (P - D) * (1 + R * Y / 100) / (Y * 12);
        System.out.printf("Monthly car payment is: %.2f\n", M);
    }
}
