package com.pluralsight.util;

import java.util.Scanner;

public class Console {

    final static Scanner scanner = new Scanner(System.in);




    /**
     * ask user for a String type input
     *
     * @return String
     */
    public static String promptForString() {
        String value;
        try {
            value = scanner.nextLine().trim();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return value;
    }

    public static boolean promptForYesNo(String prompt) {
        System.out.print(prompt + " ( Y for Yes, N for No ) ?");
        String userinput = "";
        try {
            userinput = scanner.nextLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return (userinput.equalsIgnoreCase("Y") || userinput.equalsIgnoreCase("YES"));

    }

    public static short promptForShort(String prompt) {
        System.out.print(prompt);
        short userinput = 0;
        try {
            userinput = scanner.nextShort();
            scanner.nextLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return userinput;
    }

    public static byte promptForByte(String prompt) {
        System.out.print(prompt);
        byte userinput = 0;
        try {
            userinput = scanner.nextByte();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return userinput;
    }

}
