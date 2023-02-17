package MorseTranslate;

import java.util.HashMap;

public class morseHash {

    private static HashMap<String, String> aTM;
    private static HashMap<String, String> mTA;

    public morseHash() {

        aTM = new HashMap<>();
        mTA = new HashMap<>();

        String[] alphabet = new String[]
                {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                        "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
                        "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", ",", "?", " ",
                };

        String[] morse = new String[]
                {"*-", "-***", "-*-*", "-**", "*", "**-*", "--*", "****", "**",
                        "*---", "-*-", "*-**", "--", "-*", "---", "*--*", "--*-", "*-*", "***", "-", "**-",
                        "***-", "*--", "-**-", "-*--", "--**", "*----", "**---", "***--", "****-", "*****", "-****",
                        "--***", "---**", "----*", "-----", "*-*-*-", "--**--", "**--**", "/",
                };

        for (int i = 0; i < alphabet.length; i++) {
            aTM.put(alphabet[i], morse[i]);
            mTA.put(morse[i], alphabet[i]);
        }
    }

    public boolean check(String input, int numbInput) {
        // input.replaceAll("\\s", " ");
        String[] alphabetCheck = input.toLowerCase().split("");
        String[] morseCheck = input.toLowerCase().split("\\s");
        boolean checkInput = false;

        if (numbInput == 1) {
            for (String item : alphabetCheck)
                if (!aTM.containsKey(item) && !item.equals(" ")) {
                    checkInput = true;
                }
        } else if (numbInput == 2) {
            for (String item : morseCheck)
                if (!mTA.containsKey(item) && !item.equals(" ")) {
                    checkInput = true;
                } else
                    break;
        }
        return checkInput;
    }

    public String convertToMorse(String input) {
        String inputEnglish = input.replaceAll("\s", " ").trim();

        String[] charToConverts = inputEnglish.toLowerCase().split("");
        StringBuilder convertedToMorse = new StringBuilder();

        for (int i = 0; i < charToConverts.length; i++) {
            if (i == (charToConverts.length - 1)) {
                convertedToMorse.append(aTM.get(charToConverts[i]));
            } else {
                convertedToMorse.append(aTM.get(charToConverts[i])).append(" ");
            }
        }
        return convertedToMorse.toString();
    }

    public String convertToEnglish(String input) {

        String[] charToConvert = input.split(" ");
        StringBuilder convertedToEnglish = new StringBuilder();

        for (int i = 0; i < charToConvert.length; i++) {

            convertedToEnglish.append(mTA.get(charToConvert[i]));
        }
        return convertedToEnglish.toString();
    }
}



/*    public String convertToEnglish(String input) {
        String[] wordsInMorse = input.split("/"); // assuming words are separated by a forward slash
        StringBuilder output = new StringBuilder();
        for (String wordInMorse : wordsInMorse) {
            String[] charsInMorse = wordInMorse.split(" "); // assuming characters are separated by a space
            for (String charInMorse : charsInMorse) {
                String englishChar = mTA.get(charInMorse);
                output.append(englishChar);
            }
            output.append(" ");
        }
        return output.toString();
    }*/


/*    public String convertToEnglish(String input) {
        String morseInput = input.trim();

        String[] charToConvert = morseInput.split("\\s+");
        StringBuilder convertedToEnglish = new StringBuilder();

        for (String morse : charToConvert) {
            if (mTA.containsKey(morse)) {
                convertedToEnglish.append(mTA.get(morse));
            } else {
                convertedToEnglish.append(" ");
            }
        }
        return convertedToEnglish.toString();
    }
} */

// public void setMorse() {
//    translate = input;

//  }

//   public static void setMorse(String text) {
//      input = text;

//  }

//  public String getMorse() {
//     return input;

// }
// }


// }}


// public static void main (String[]args){

// Scanner scan = new Scanner(System.in);


//  HashMap <String, String> morse = new HashMap<>();
/*
        morse.put("A", "*-");       morse.put("*-", "A");
        morse.put("B", "-***");     morse.put("-***", "B");
        morse.put("C", "-*-*");     morse.put("-*-*", "C" );
        morse.put("D", "-**");      morse.put("-**", "D");
        morse.put("E", "*");        morse.put("*", "E");
        morse.put("F", "**-*");     morse.put("**-*", "F");
        morse.put("G", "--*");      morse.put("--*", "G");
        morse.put("H", "****");     morse.put("****", "H");
        morse.put("I", "**");       morse.put("**", "I");
        morse.put("J", "*---");     morse.put("*---", "J");
        morse.put("K", "-*-");      morse.put("-*-", "K");
        morse.put("L", "*-**");     morse.put("*-**", "L");
        morse.put("M", "--");       morse.put("--", "M");
        morse.put("N", "-*");       morse.put("-*", "N");
        morse.put("O", "---");      morse.put("---", "O");
        morse.put("P", "*--*");     morse.put("*--*", "P");
        morse.put("Q", "--*-");     morse.put("--*-", "Q");
        morse.put("R", "*-*");      morse.put("*-*", "R");
        morse.put("S", "***");      morse.put("***", "S");
        morse.put("T", "-");        morse.put("-", "T");
        morse.put("U", "**-");      morse.put("**-", "U");
        morse.put("V", "***-");     morse.put("***-", "V");
        morse.put("W", "*--");      morse.put("*--", "W");
        morse.put("X", "-**-");     morse.put("-**-", "X");
        morse.put("Y", "-*--");     morse.put("-*--", "Y");
        morse.put("Z", "--**");     morse.put("--**", "Z");
        morse.put("1", "*----");    morse.put("*----", "1");
        morse.put("2", "**---");    morse.put("**---", "2");
        morse.put("3", "***--");    morse.put("***--", "3");
        morse.put("4", "****-");    morse.put("****-", "4");
        morse.put("5", "*****");    morse.put("*****", "5");
        morse.put("6", "-****");    morse.put("-****", "6");
        morse.put("7", "--***");    morse.put("--***", "7");
        morse.put("8", "---**");    morse.put("---**", "8");
        morse.put("9", "----*");    morse.put("----*", "9");
        morse.put("0", "-----");    morse.put("-----", "0");
        morse.put(".", "*-*-*-");   morse.put("*-*-*-", ".");
        morse.put(",", "--**--");   morse.put("--**--", ",");
        morse.put("?", "**--**");   morse.put("**--**", "?");

        } */
       /* String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
                "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", ",", "?"};

        String[] morse = {".- ", "-... ", "-.-. ", "-.. ", ". ", "..-. ", "--. ", ".... ", ".. ",
                ".--- ", "-.- ", ".-.. ", "-- ", "-. ", "--- ", ".--. ", "--.- ", ".-. ", "... ", "- ", "..- ",
                "...- ", ".-- ", "-..- ", "-.-- ", "--.. ", "*----", "**---", "***--", "****-", "*****", "-****",
                "--***", "---**", "----*", "-----", "*-*-*-", "--**--", "**--**"};

        HashMap<String, String> decryptConvert = new HashMap<>();*/
       /* {
            for (int i = 0; i < alphabet.length; i++) {
                decryptConvert.put(alphabet[i], morse[i]);
                decryptConvert.put(morse[i], alphabet[i]);

                System.out.println(decryptConvert.get(scan.nextLine()));
                System.out.println(decryptConvert.get(morse[i]));


            }
        }
    }
    }

*/
