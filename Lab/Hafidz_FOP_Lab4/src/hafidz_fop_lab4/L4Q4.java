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
public class L4Q4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year, firstDay;
        System.out.print("Enter the year: ");
        year = scanner.nextInt();
        do {
                System.out.print("Days: \n"
                        + "0. Sunday\n"
                        + "1. Monday\n"
                        + "2. Tuesday\n"
                        + "3. Wednesday\n"
                        + "4. Thursday\n"
                        + "5. Friday\n"
                        + "6. Saturday\n"
                        + "Enter the first day of the year (Number Only): ");
                firstDay = scanner.nextInt();
                if (firstDay < 0 || firstDay > 6)
                    System.out.println("Invalid input! Please enter a value between 0 and 6.");
        } while (firstDay < 0 || firstDay > 6);
        
        printCalendar(2, firstDay,year);
        printCalendar(8, firstDay,year);
    }
    
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 !=0 )|| year % 400 == 0;
    }
    
    public static String getMonthFromNumber(int month) {
        String monthStr = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid Month";
        };
        return monthStr;
    }
    
    public static int getFirstDay(int firstDay, int month, int[] daysInAMonth) {
        int day = firstDay; 
        for (int c = 0; c < (month - 1); c++)
            day = (day + daysInAMonth[c]) % 7;
        return day;
    }
    
    public static void printCalendar(int month, int firstDay, int year) {
        int[] daysInAMonth  = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (isLeapYear(year))
            daysInAMonth[1] = 29;
        
        final int MAXIMUM_WIDTH = 28;
        int monthFirstDay = getFirstDay(firstDay, month, daysInAMonth);
        String monthName = getMonthFromNumber(month);
        // for header
        for (int a = 0; a < 2; a++) {
            for (int b = 0; b < ((MAXIMUM_WIDTH - (monthName.length() + String.valueOf(year).length()))/2); b++) {
                System.out.print(" ");
            }
            if (a == 0)
                System.out.print(monthName + " " + year);
            if (a == 1) 
                System.out.println("\n---------------------------\nSun Mon Tue Wed Thu Fri Sat");
        }
        
        // for spacing
        for (int i = 0; i < monthFirstDay; i++)
            System.out.print(i == 6 ? "   " : "    ");
       
        //for date
        for (int day = 1; day <= daysInAMonth[month - 1]; day++) {
            System.out.printf(" %2d ", day);

            if ((monthFirstDay + day) % 7 == 0)
                System.out.println("");
        }
        System.out.println("\n");
    }
}
