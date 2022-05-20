import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FreitagTest {

    @Test
    void tooShortPasswordAtLeast8Signs() {
        assertEquals(false, Freitag.passwortLeastLengthCheck("test",8));
    }

    @Test
    void LongEnoughPasswordAtLeast8Signs() {
        assertEquals(true, Freitag.passwortLeastLengthCheck("testtest",8));
    }

    @Test
    void LongEnoughPasswordAtLeastMinus5Signs() {
        assertEquals(true, Freitag.passwortLeastLengthCheck("testtest", -5));
    }


    @Test
    void passwordWithAtLeastOneLetterAndOneInt() {
        assertEquals(true, Freitag.passwortContainsAtLeastOneLetterAndOneInt("test1234"));
    }

    @Test
    void passwordWithOnlyLetters() {
        assertEquals(false, Freitag.passwortContainsAtLeastOneLetterAndOneInt("test"));
    }

    @Test
    void passwordWithOnlyInts() {
        assertEquals(false, Freitag.passwortContainsAtLeastOneLetterAndOneInt("1234"));
    }

    @Test
    void emptyPassword() {
        assertEquals(false, Freitag.passwortContainsAtLeastOneLetterAndOneInt(""));
    }


    @Test
    void passwordWithLowerCaseAndUpperCase() {
        assertEquals(true, Freitag.passwortContainsLowerCaseAndUpperCaseLetters("aA"));
    }

    @Test
    void passwordWithOnlyLowerCase() {
        assertEquals(false, Freitag.passwortContainsLowerCaseAndUpperCaseLetters("aa"));
    }

    @Test
    void passwordWithOnlyUpperCase() {
        assertEquals(false, Freitag.passwortContainsLowerCaseAndUpperCaseLetters("AA"));
    }

    @Test
    void emptyPassword2() {
        assertEquals(false, Freitag.passwortContainsLowerCaseAndUpperCaseLetters(""));
    }

    @Test
    void digitsAndLetters() {
        assertEquals(false, Freitag.passwortContainsLowerCaseAndUpperCaseLetters("52252a"));
    }
}