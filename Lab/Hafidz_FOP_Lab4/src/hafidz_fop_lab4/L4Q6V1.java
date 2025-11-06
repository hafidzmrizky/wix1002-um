/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafidz_fop_lab4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hafz's.
 */
public class L4Q6V1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(5) == 0 ? random.nextInt(9) : 
                random.nextInt(5) == 1 ? random.nextInt(99) :
                random.nextInt(5) == 2 ? random.nextInt(999) :
                random.nextInt(5) == 3 ? random.nextInt(9999) : random.nextInt(99999);
        
        System.out.printf("%d has %d digits\n", num, String.valueOf(num).length());
    }
}
