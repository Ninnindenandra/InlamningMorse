package EnglishAndMorse;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestEnglishAndMorse {


    @Test

    public void testLanguagecheckEnglish(){
        // Submit English character and receive answer it is English
        // Arrange
        String expected = "English";
        String testData = "H";
        EnglishArray eng = new EnglishArray();

        // Act
        String actual = eng.checkLetter(testData);

        // Assert
        assertEquals(expected, actual);

    }

    @Test

    public void testLanguagecheckMorse(){
        // Submit English character and receive answer it is English
        // Arrange
        String expected = "Morse";
        String testData = "*";
        MorseArray morse = new MorseArray();


        // Act
        String actual = morse.checkLetter(testData);

        // Assert
        assertEquals(expected, actual);

    }


    @Test

    public void testSearchEnglish(){
        // Submit English character and receive morse sign
        // Arrange
        String expected = "*-";
        String testData = "A";
        EnglishArray eng = new EnglishArray();


        // Act
        String actual = eng.searchEnglish(testData);

        // Assert
        assertEquals(expected, actual);

    }

    @Test
    public void testSplitMorse(){
        // Submit English character and receive morse sign
        // Arrange
        String expected = "---";
        String testData = "*** --- ***";
        MorseArray morse = new MorseArray();


        // Act
        String[] myArray = morse.splitMorse(testData);
        String actual = myArray[1];

        // Assert
        assertEquals(expected, actual);

    }

    @Test
    public void testSearchMorse(){
        // Submit English character and receive morse sign
        // Arrange
        String expected = "A";
        String testData = "*-";
        MorseArray morse = new MorseArray();


        // Act
        String actual = morse.searchMorse(testData);

        // Assert
        assertEquals(expected, actual);

    }

    @Test

    public void testSplitWord(){
        // Split the English string to letters
        // Arrange
        String expected = "E";
        String testData = "HEJ";
        EnglishArray eng = new EnglishArray();


        // Act
        String[] myArray = eng.splitWord(testData);
        String actual = myArray[1];

        // Assert
        assertEquals(expected, actual);

    }
}




