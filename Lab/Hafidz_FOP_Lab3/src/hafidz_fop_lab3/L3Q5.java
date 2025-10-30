/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafidz_fop_lab3;

import java.util.Scanner;

/**
 *
 * @author hafz's.
 */
public class L3Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of a : ");
        double a = scanner.nextDouble();
        System.out.print("Enter the value of b : ");
        double b = scanner.nextDouble();
        System.out.print("Enter the value of c : ");
        double c = scanner.nextDouble();
        System.out.print("Enter the value of d : ");
        double d = scanner.nextDouble();
        System.out.print("Enter the value of e : ");
        double e = scanner.nextDouble();
        System.out.print("Enter the value of f : ");
        double f = scanner.nextDouble();
        
        double determinant = (a * d) - (b * c);
        if (determinant == 0) {
            System.out.println("The equation has no solution");
        } else {
           double x = ((e * d) - (b * f)) / determinant;
           double y = ((a * f) - (e * c)) / determinant;
           System.out.printf("The equation result:\nx = %f\ny = %f\n", x, y);
        }
    }
}
