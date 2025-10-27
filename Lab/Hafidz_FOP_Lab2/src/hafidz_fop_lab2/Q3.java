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
public class Q3 {

    public static void main(String[] args) {
        Random random = new Random();
        final int MAX_NUMBER = 40 + 1;
        int num1 = random.nextInt(MAX_NUMBER) + 10;
        int num2 = random.nextInt(MAX_NUMBER) + 10;
        int num3 = random.nextInt(MAX_NUMBER) + 10;
        int sum = num1 + num2 + num3;
        System.out.printf("The random number generated are:%3d,%3d,%3d\n", num1, num2, num3);
        System.out.println("The sum of the three numbers are: " + sum);
        System.out.printf("With the average of: %.2f\n", (sum)/3.0);
    }
}