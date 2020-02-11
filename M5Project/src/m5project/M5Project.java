/*
Author: Ivan Cledera
 */
package m5project;

import java.util.Scanner;

public class M5Project {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int dni;
        System.out.println("Tell me your number of ID: ");
        dni = keyboard.nextInt();
        char letter = DNIletter(dni);
        System.out.println(dni + ":" + letter);       
    }

    private static char DNIletter(int dni) {
        char letter = 'Z';
        String letters="TRWAGMYFPDXBNJZSQVHLCKE";
        int res = dni%23;
        letter = letters.charAt(res);
        return letter;
    }
}
