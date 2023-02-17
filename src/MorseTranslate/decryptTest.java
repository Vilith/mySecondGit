package MorseTranslate;



import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class decryptTest {


    @Test
    public void testConvertOneWordToMorse() {

        //Arrange
        morseHash mH = new morseHash();

        //Act
        String actual = mH.convertToMorse("hej");
        String expected = "**** * *---";

        //Assert
        assertEquals(expected, actual);

    }


    @Test
    public void testConvertTwoWordToMorse() {

        //Arrange
        morseHash mH = new morseHash();

        //Act
        String actual = mH.convertToMorse("hej abc");
        String expected = "**** * *--- / *- -*** -*-*";

        //Assert
        assertEquals(expected, actual);

    }


    @Test
    public void testConvertMorseToEnglish() {

        //Arrange
        morseHash mH = new morseHash();

        //Act
        String actual = mH.convertToEnglish("**** * *---");
        String expected = "hej";

        //Assert
        assertEquals(expected, actual);

    }


    @Test
    public void testSeparateMorseWords() {

        //Arrange
        morseHash mH = new morseHash();

        //Act
        String actual = mH.convertToEnglish("**** * *--- / *- -*** -*-*");
        String expected = "hej abc";

        //Assert
        assertEquals(expected, actual);

    }


    @Test
    public void testCapsSensitiveEnglishtoMorse() {

        //Arrange
        morseHash mH = new morseHash();

        //Act
        String actual = mH.convertToMorse("HEJ ABC");
        String expected = "**** * *--- / *- -*** -*-*";

        //Assert
        assertEquals(expected, actual);

    }


    @Test
    public void testSmallAndBigLetters() {

        //Arrange
        morseHash mH = new morseHash();

        //Act
        String actual = mH.convertToMorse("HeJ aBc");
        String expected = "**** * *--- / *- -*** -*-*";

        //Assert
        assertEquals(expected, actual);

    }
}


