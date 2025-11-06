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
public class L4Q1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int x = scanner.nextInt();
        
        for(int i = 1; i <= (x/2); i++)
            if (x % i == 0)
                System.out.print(i + ", ");   
        System.out.println(x);
   
    }
}
