package com.prog.exeptionhandlingtutorial;

import java.util.Scanner;

public class UncheckedException {

    public UncheckedException() {
    }

    public static void example(Scanner scanner) {
        System.out.println("Dividend: ");
        int dividend = Integer.parseInt(scanner.nextLine());
        System.out.println("Divisor: ");
        int divisor = Integer.parseInt(scanner.nextLine());

        try {
            int quotient = dividend / divisor;
            System.out.println(("The quotient is: ") + quotient);
        } catch (OwnException ownException) {
            System.out.println("ERROR: " + ownException.getMessage());
        }

//        if (divisor == 0) {
//            throw new com.prog.exeptionhandlingtutorial.OwnException();
//        }
    }

    public static void run() {
        Scanner sc = new Scanner(System.in);
        UncheckedException.example(sc);
    }
}