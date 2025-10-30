/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hafidz_fop_lab3;

/**
 *
 * @author hafz's.
 */
import java.util.Scanner;

public class L3Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char operand;
        System.out.print("Enter two integer number: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.print("Enter the operand: ");
        operand = scanner.next().charAt(0);
        String result = switch (operand) {
            case '+' -> String.valueOf(a + b);
            case '-' -> String.valueOf(a - b);
            case '*' -> String.valueOf(a * b);
            case '/' -> String.valueOf(a / b);
            case '%' -> String.valueOf(a % b);
            default -> "unidentified_operand";
        };
        if (result.equals("unidentified_operand")) {
            System.out.println("Operand of " + operand + " is not yet supported");
        } else {
            System.out.println(a + " " + operand + " "+ b + " = " + result);
        }
    }
    
}
