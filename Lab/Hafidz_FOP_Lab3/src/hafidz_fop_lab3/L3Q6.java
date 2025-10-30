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
public class L3Q6 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the radius of the circle: ");
        int r = scanner.nextInt();   
        System.out.print("Enter coordinate of x : ");
        int x = scanner.nextInt();
        System.out.print("Enter coordinate of y : ");
        int y = scanner.nextInt();
        
        double calc = Math.sqrt(x * x + y * y);
        if (calc < r) {
            System.out.printf("Circle with r of %d, at (%d, %d) is inside the circle\n", r, x, y);
        }
        else if (calc > r) {
            System.out.printf("Circle with r of %d, at (%d, %d) is outside the circle\n", r, x, y);
        }
        else if (calc == r) {
            System.out.printf("Circle with r of %d, at (%d, %d) is on the circle\n", r, x, y);
        }
    }
    
}
