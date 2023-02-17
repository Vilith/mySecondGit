package MorseTranslate;


import static org.junit.Assert.assertEquals;

public class Test {


    @org.junit.jupiter.api.Test
    public void testConvertOneWordToMorse() {

        //Arrange
        DecoderLogic mH = new DecoderLogic();

        //Act
        String actual = mH.convertToMorse("hej");
        String expected = "**** * *---";

        //Assert
        assertEquals(expected, actual);

    }


    @org.junit.jupiter.api.Test
    public void testConvertTwoWordToMorse() {

        //Arrange
        DecoderLogic mH = new DecoderLogic();

        //Act
        String actual = mH.convertToMorse("hej abc");
        String expected = "**** * *--- / *- -*** -*-*";

        //Assert
        assertEquals(expected, actual);

    }


    @org.junit.jupiter.api.Test
    public void testConvertMorseToEnglish() {

        //Arrange
        DecoderLogic mH = new DecoderLogic();

        //Act
        String actual = mH.convertToEnglish("**** * *---");
        String expected = "hej";

        //Assert
        assertEquals(expected, actual);

    }


    @org.junit.jupiter.api.Test
    public void testSeparateMorseWords() {

        //Arrange
        DecoderLogic mH = new DecoderLogic();

        //Act
        String actual = mH.convertToEnglish("**** * *--- / *- -*** -*-*");
        String expected = "hej abc";

        //Assert
        assertEquals(expected, actual);

    }


    @org.junit.jupiter.api.Test
    public void testCapsSensitiveEnglishtoMorse() {

        //Arrange
        DecoderLogic mH = new DecoderLogic();

        //Act
        String actual = mH.convertToMorse("HEJ ABC");
        String expected = "**** * *--- / *- -*** -*-*";

        //Assert
        assertEquals(expected, actual);

    }


    @org.junit.jupiter.api.Test
    public void testSmallAndBigLetters() {

        //Arrange
        DecoderLogic mH = new DecoderLogic();

        //Act
        String actual = mH.convertToMorse("HeJ aBc");
        String expected = "**** * *--- / *- -*** -*-*";

        //Assert
        assertEquals(expected, actual);

    }
}


