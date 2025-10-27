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
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int seconds = scanner.nextInt();
        
        int hours = seconds / 3600;
        int remainingSecondsAfterHours = seconds % 3600;
        int minutes = remainingSecondsAfterHours / 60;
        int convertedSeconds = remainingSecondsAfterHours % 60;
        
        System.out.printf("%d seconds is %d hours, %d minutes and %d seconds\n", seconds, hours, minutes, convertedSeconds);
    }
}
