/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafidz_fop_lab4;

import java.util.Scanner;

/**
 *
 * @author hafz's.
 */
public class L4Q2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter end n : ");
        int n = scanner.nextInt();
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            if (i > 1)
                System.out.print("(");
            for (int j = 1; j <= i; j++) {
                sum+= j;
                System.out.print(j);
                if (j < i)
                    System.out.print(" + ");
            }
            if (i > 1)
                System.out.print(")");
            if (i < n)
                System.out.print(" + ");
            else
                System.out.print(" = ");
        }
        
        System.out.printf("\nSum: %d\n", sum);
        scanner.close();
    }
}
