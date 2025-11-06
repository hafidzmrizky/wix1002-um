/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafidz_fop_lab4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hafz's.
 */
public class L4Q3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum;
        int sum = 0;
        int count = 0;
        int min = 0;
        int max = 0;
        double sumSquared = 0;

        do {
            System.out.print("Enter a score [negative score to quit]: ");
            inputNum = scanner.nextInt();
            if (inputNum < 0)
                break;
            if (count == 0) {
                min = inputNum; 
                max = inputNum;
            }
            if (inputNum < min && count > 0)
                min = inputNum;
            if (inputNum > max && count > 0)
                max = inputNum;
            
            sum+=inputNum;
            sumSquared+= Math.pow(inputNum, 2);
            count++;
        } while (inputNum > 0);
        
        double average = sum / count;
        double standardDeviation = Math.sqrt((sumSquared - (Math.pow(sum, 2) / count)) / (count - 1));
        System.out.printf( 
                "Minimum Score: %d\n"
                + "Maximum Score: %d\n"
                + "Average Score: %.2f\n"
                + "Standard Deviation: %.2f"
                + "\n", min, max, average, standardDeviation
        );
    }
}
