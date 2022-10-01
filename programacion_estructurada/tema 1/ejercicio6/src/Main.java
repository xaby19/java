

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
            Ejemplo n = 5
             _____*
             ____***
             ___*****
             __*******
             _*********
             ***********
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime un número y te pinto una pirámide de ese tamaño: ");
        int n = scanner.nextInt();
        int rows = n + 1;

        for (int row = 0; row < rows; row++) {
            printSpaces(n, row);
            printStars(row);
            System.out.println();
        }
    }

    private static void printSpaces(int n, int row) {
        System.out.print(" ".repeat(n - row));
    }

    private static void printStars(int row) {
        System.out.print("*".repeat(row) +  "*".repeat(row));
    }
}