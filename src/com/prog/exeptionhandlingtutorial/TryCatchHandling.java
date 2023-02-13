//one version of exception handling is with try-catch methods

package com.prog.exeptionhandlingtutorial;

import java.util.Scanner;

public class TryCatchHandling {

    public TryCatchHandling() {
    }

    public static void example(Scanner scanner) {
        try {
            System.out.println("Dividend: ");
            int dividend = Integer.parseInt(scanner.nextLine());
            System.out.println("Divisor: ");
            int divisor = Integer.parseInt(scanner.nextLine());
            int quotient = dividend / divisor;
            System.out.println(("The quotient is: ") + quotient);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("ERROR: " + arithmeticException.getMessage());
        }
    }

    public static void run() {
        Scanner sc = new Scanner(System.in);
        TryCatchHandling.example(sc);
    }
}