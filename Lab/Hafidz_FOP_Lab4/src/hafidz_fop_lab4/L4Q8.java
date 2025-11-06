/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafidz_fop_lab4;

import java.util.Random;

/**
 *
 * @author hafz's.
 */
public class L4Q8 {
    
    public static void main(String[] args) {
        Random rand = new Random();
        final int MAX_NUM = 100;
        int n = rand.nextInt(MAX_NUM + 1);
        int primeCount = 0;
        System.out.printf("Range of 0 to n (Random Max of %d) of %d\n", MAX_NUM, n);
        for (int i = 2; i <= n; i++) {
            boolean isPrimeNum = true;
            
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrimeNum = false;
                    break;
                }
            }
            if (isPrimeNum) {
                primeCount++;
                System.out.print(primeCount == 1 ? "" + i : ", " + i);
            }
        }
        System.out.printf("\nTotal Prime Number : %d\n", primeCount);
    }
}
