package MorseTranslate;

import java.util.Scanner;

public class decryptMain {

    //  static boolean kewl = false;
    //  static engToMorse eTM = new engToMorse();
    //  static morseToEng mTE = new morseToEng();
    static morseHash mH = new morseHash();
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

        //  int number = Integer.parseInt(scan.nextLine());
        /*
        if (number == 1) {
            System.out.println("Please enter text to be translated:");
            scan.nextLine();
        } else if (number == 2) {
            System.out.println("2");
        } else {
            System.out.println("Bye bye");
        } */
        while (language)
            try {
                numbInput = Integer.parseInt(scan.nextLine());
                if (numbInput == 1 || numbInput == 2) {
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
            } catch (NumberFormatException e) {
                System.out.println("""
                        Please choose
                        (1) for English -> Morsecode
                        (2) for Morsecode -> English
                        (3) To quit program!""");
            }

        System.out.println("Enter message to be translated:");
        input = scan.nextLine();

        while (mH.check(input, numbInput)) {
            System.out.println("Invalid input!");
            input = scan.nextLine();
        }

        if (numbInput == 1) {
            System.out.println(input + " in Morsecode is: ");
            System.out.println(mH.convertToMorse(input).replaceAll("\s", " ").trim());
        } else if (numbInput == 2) {
            System.out.println(input + " in English is: ");
            System.out.println(mH.convertToEnglish(input));
        } else {
            System.out.println("Shutting down program!");
            System.exit(0);
        }
    }
}

/*


        System.out.println("Morse translator");
        System.out.println("\nYou will now get 3 choices");
        System.out.println("\n1 - English to Morse" + "\n2 - Morse to English" + "\n3 - Exit program");

        switch (Integer.parseInt(scan.nextLine())) {
            case 1:
                System.out.println(mH.convertToMorse().get("a"));

               // while (true)
                input = scan.nextLine();
                mH.inputWord(input);
             //   System.out.println(mH.outputWord);
                break;
            case 2:
                System.out.println("Placeholder2");
                break;
            case 3:
                System.out.println("Placeholder3");
                break;
            default:
                System.out.println("Something went wrong. Eligable values 1-3");

        }
    }
}


*/
