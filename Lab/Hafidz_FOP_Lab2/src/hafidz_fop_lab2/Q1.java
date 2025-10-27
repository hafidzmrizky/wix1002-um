/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hafidz_fop_lab2;

import java.util.Scanner;

/**
 *
 * @author hafz's.
 */
public class Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit, celcius;
        System.out.print("Enter temperature in Fahrenheit: ");
        fahrenheit = scanner.nextDouble();
        celcius = (fahrenheit - 32) / 1.8;
        System.out.printf("The temperature in Celcious is: %.2f\n", celcius);
    }
}
