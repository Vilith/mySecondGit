package MorseTranslate;

import java.util.HashMap;

public class DecoderLogic {

    private static HashMap<String, String> aTM;
    private static HashMap<String, String> mTA;

    public DecoderLogic() {

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

        String[] alphabetCheck = input.toLowerCase().split("");
        String[] morseCheck = input.toLowerCase().split("\\s");
        boolean checkInput = false;

        if (numbInput == 1) {
            for (String atm : alphabetCheck)
                if (!aTM.containsKey(atm) && !atm.equals(" ")) {
                    checkInput = true;
                }
        } else if (numbInput == 2) {
            for (String mta : morseCheck)
                if (!mTA.containsKey(mta) && !mta.equals(" ")) {
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