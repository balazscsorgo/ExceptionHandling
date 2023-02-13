//you have to comment one of the run methods

package com.prog.exeptionhandlingtutorial;


public class Main {
    public static void main(String[] args) {

        TryCatchHandling.run(); // ArithmeticException handled by tray-catch

        UncheckedException.run(); // ArithmeticException handled with 'DivisorIsZero' exception
    }

}