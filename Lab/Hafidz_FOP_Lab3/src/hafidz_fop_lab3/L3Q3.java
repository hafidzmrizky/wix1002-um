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
public class L3Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Sales Volume: ");
        int salesVolume = scanner.nextInt();
        double result = salesVolume > 1000 ? salesVolume * 12.5/100 : 
                        salesVolume > 500 ? salesVolume * 10/100 :
                        salesVolume > 100 ? salesVolume * 7.5/100 :
                        salesVolume * 5/100;
        System.out.printf("Commission on %d Sales Volume is: %.2f\n", salesVolume, result);
    }
}
