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
public class L4Q7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principalAmount = scanner.nextDouble();
        System.out.print("Enter interest in %: ");
        double percentage = scanner.nextDouble();
        System.out.print("Enter total number of month(s): ");
        int month = scanner.nextInt();

        // calc
        double monthlyPayment = ( (principalAmount * (percentage / (12 * 100) )) 
                / ( 1 - Math.pow((1 + (percentage / (12 * 100))), -month)) );
        double totalInterest = 0;
        double unpaidBalance = principalAmount;
        
        // header
        System.out.printf("%-6s%20s%20s%20s%20s%20s\n",
                "Month", "Monthly Payment", "Principal", "Interest", "Unpaid Balance", "Total Interest");

        // content
        for (int i = 1; i <= month; i++) {
            for (int c = 0; c < 6; c++) {
                double principalDue = monthlyPayment * Math.pow((1 + (percentage / (12 * 100))), -(1 + month - i ));
                double interestDue = monthlyPayment - principalDue;
                double output = switch (c) {
                    case 0 -> i;
                    case 1 -> monthlyPayment;
                    case 2 -> principalDue;
                    case 3 -> interestDue;
                    case 4 -> unpaidBalance;
                    case 5 -> totalInterest;
                    default -> 0;
                };
                if (c == 2)
                    unpaidBalance-= output;
                if (c == 3)
                    totalInterest+= output;
                if (c == 0)
                    System.out.printf("%-6d", (int) output);
                else
                    System.out.printf("%20.2f", output);
            }
            System.out.println("");
        }
    }
}
