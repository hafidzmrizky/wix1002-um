/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l1q3;

/**
 *
 * @author hafz's.
 */
public class L1Q3 {

    public static void rectangleMeow(int line) {
        final int MAX_HEIGHT = 9;
        final int WIDTH = 9;
        if (line == 1 || line == MAX_HEIGHT) {
            for (int x = 0; x < WIDTH; x++) {
                System.out.print("*");
            }
            return;
        }
        if (line > 0 && line < MAX_HEIGHT) {
            System.out.print("*");
            for (int x = 0; x < WIDTH - 2; x++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }
    }

    public static void circle(int line) {
        final int MAX_HEIGHT = 9;
        final int MAX_WIDTH = 9;

        if (MAX_WIDTH % 2 != 1 && MAX_WIDTH < 7) {
            return;
        }

        if (line == 1 || line == MAX_HEIGHT) {
            for (int i = 0; i < 2; i++) {
                for (int x = 0; x < (MAX_WIDTH - 3) / 2; x++) {
                    System.out.print(" ");
                }
                if (i == 0) {
                    System.out.print("***");
                }
            }
            return;
        }
        if (line == 2 || line == MAX_HEIGHT - 1) {
            System.out.print(" *");
            for (int i = 0; i < MAX_WIDTH - 4; i++) {
                System.out.print(" ");
            }
            System.out.print("* ");
            return;
        }
        if (line < MAX_HEIGHT) {
            System.out.print("*");
            for (int i = 0; i < MAX_WIDTH - 2; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
            return;
        }

    }

    public static void arrowUp(int line) {
        final int MAX_HEIGHT = 9;
        final int MAX_WIDTH = 5;

        if (line <= 3) {
            int stars = line * 2 - 1;
            int spaces = (MAX_WIDTH - stars) / 2;
            for (int x = 0; x < spaces; x++) {
                System.out.print(" ");
            }
            for (int y = 0; y < stars; y++) {
                System.out.print("*");
            }
            for (int z = 0; z < spaces; z++) {
                System.out.print(" ");
            }
        }

        if (line > 3 && line <= MAX_HEIGHT) {
            for (int a = 0; a < MAX_WIDTH / 2; a++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int a = 0; a < MAX_WIDTH / 2; a++) {
                System.out.print(" ");
            }
        }
    }

    public static void diamond(int line) {
        final int MAX_HEIGHT = 9;
        final int MAX_WIDTH = 9;
        int stars;
        if (line <= (MAX_HEIGHT / 2)) {
            stars = line * 2 - 1;
        } else {
            stars = (2 * (MAX_HEIGHT / 2) + 1 - line) * 2 + 1;
        }
        int outerPadding = (MAX_WIDTH - stars) / 2;
        int innerPadding = 0;
        if (stars > 2) {
            innerPadding = stars - 2;
        }

        for (int i = 0; i < 3; i++) {
            if (i == 1) {
                for (int inner = 0; inner < innerPadding; inner++) {
                    System.out.print(" ");
                }
            } else {
                for (int outer = 0; outer < outerPadding; outer++) {
                    System.out.print(" ");
                }
            }
            if (i < 2) {
                if (stars >= 1) {
                    System.out.print("*");
                    stars--;
                }
            }
        }
    }

    public static void spacing(int spacing) {
        for (int x = 0; x < spacing; x++) {
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        final int HEIGHT_LIMIT = 11;
        final int PER_OBJ_SPACING = 7;

        for (int i = 0; i < HEIGHT_LIMIT; i++) {
            if (i == 0 || HEIGHT_LIMIT - i == 1) {
                System.out.println(" ");
                continue;
            }
            rectangleMeow(i);
            spacing(PER_OBJ_SPACING);
            circle(i);
            spacing(PER_OBJ_SPACING);
            arrowUp(i);
            spacing(PER_OBJ_SPACING);
            diamond(i);
            spacing(PER_OBJ_SPACING);
            System.out.println("");
        }
    }
}
