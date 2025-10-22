/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l1q4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hafz's.
 */
public class L1Q4 {

    public static class ProductSales {

        private String monthYear;
        private int amount;

        public ProductSales(String monthYear, int amount) {
            this.monthYear = monthYear;
            this.amount = amount;
        }

        public String getMonthYear() {
            return monthYear;
        }

        public int getAmount() {
            return amount;
        }

    }

    public static void main(String[] args) {
        final int PEAK_GRAPH_SIZE = 24;
        final int SPACING_BEFORE_GRAPH = 5;

        List<ProductSales> productASales = new ArrayList<>();
        productASales.add(new ProductSales("January 2016", 2500));
        productASales.add(new ProductSales("February 2016", 1600));
        productASales.add(new ProductSales("March 2016", 2000));
        productASales.add(new ProductSales("April 2016", 2700));
        productASales.add(new ProductSales("May 2016", 3200));
        productASales.add(new ProductSales("June 2016", 800));

        int peakSalesAmount = productASales.stream().mapToInt(sale -> sale.amount).max().orElse(0);
        int longestCharacter = productASales.stream().mapToInt(sale -> sale.monthYear.length()).max().orElse(0) + SPACING_BEFORE_GRAPH;
        
        System.out.print("\n.*'Horizontal Bar Chart of Product A Sales'*.\n\n");
        System.out.print("Month");
        for (int space = 0; space < longestCharacter; space++) {
            System.out.print(" ");
            if (longestCharacter - space == 1) {
                System.out.println("| Amount");
            }
        }
        for (int i = 0; i < productASales.size(); i++) {
            ProductSales data = productASales.get(i);
            System.out.print(data.getMonthYear());

            // in order to make it cleaner, first, make it symmetrical A   | B
            for (int x = 0; x < (longestCharacter - data.monthYear.length()) + SPACING_BEFORE_GRAPH; x++) {
                System.out.print(" ");
            }
            System.out.print("| ");
            
            // now for the graph!!! showw
            for (int graph = 0; graph < (PEAK_GRAPH_SIZE * data.amount / peakSalesAmount); graph++) {
                System.out.print("|");
                if (graph + 1 >= (PEAK_GRAPH_SIZE * data.amount / peakSalesAmount)) {
                    for (int spacing = PEAK_GRAPH_SIZE + 2; spacing > (PEAK_GRAPH_SIZE * data.amount / peakSalesAmount); spacing-- ) {
                        System.out.print(" ");
                    }
                    System.out.print("(" + data.amount + ")");
                }
            }

            System.out.println("");
        }
    }

}
