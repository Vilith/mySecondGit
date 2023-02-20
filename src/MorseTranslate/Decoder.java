package MorseTranslate;

import java.util.Scanner;

public class Decoder {

    static DecoderLogic dL = new DecoderLogic();
    static boolean language = true;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = "";
        int numbInput = 0;

        System.out.println("""
                Morse Translator!
                                
                You will now get 3 choices:

                (1) - English to Morse
                (2) - Morse to English
                (3) - Exit program""");

        while (!language)
            try {
                numbInput = Integer.parseInt(scan.nextLine());
                if (numbInput == 1) {
                    System.out.println("\n" + "Enter message to be translated: ");
                    language = false;
                } else if (numbInput == 2) {
                    System.out.println("""

                            Enter Morsecode to be translated\s
                            Separate words with a /""");
                    language = false;
                } else if (numbInput == 3) {
                    System.out.println("Shutting down program!");
                    System.exit(0);
                } else {
                    System.out.println("""
                            Please choose
                            (1) for English -> Morsecode
                            (2) for Morsecode -> English
                            (3) To quit program!""");
                }
            } catch (Exception e) {
                System.out.println("""
                        Please choose
                        (1) for English -> Morsecode
                        (2) for Morsecode -> English
                        (3) To quit program!""");
            }

        while (dL.check(input, numbInput)) {
            input = scan.nextLine();
        }

        if (numbInput == 1) {
            System.out.println(input + " in Morsecode is: ");
            System.out.println(dL.convertToMorse(input).replaceAll("\s", " ").trim());
        } else if (numbInput == 2) {
            System.out.println(input + " in English is: ");
            System.out.println(dL.convertToEnglish(input));
        } else {
            System.out.println("Shutting down program!");
            System.exit(0);
        }
    }
}
