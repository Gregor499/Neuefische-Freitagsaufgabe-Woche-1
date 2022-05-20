import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FreitagTest {

    @Test
    void tooShortPasswordAtLeast8Signs() {
        assertEquals(false, Freitag.passwordLeastLengthCheck("test",8));
    }

    @Test
    void LongEnoughPasswordAtLeast8Signs() {
        assertEquals(true, Freitag.passwordLeastLengthCheck("testtest",8));
    }

    @Test
    void LongEnoughPasswordAtLeastMinus5Signs() {
        assertEquals(true, Freitag.passwordLeastLengthCheck("testtest", -5));
    }


    @Test
    void passwordWithAtLeastOneLetterAndOneInt() {
        assertEquals(true, Freitag.passwordContainsAtLeastOneLetterAndOneInt("test1234"));
    }

    @Test
    void passwordWithOnlyLetters() {
        assertEquals(false, Freitag.passwordContainsAtLeastOneLetterAndOneInt("test"));
    }

    @Test
    void passwordWithOnlyInts() {
        assertEquals(false, Freitag.passwordContainsAtLeastOneLetterAndOneInt("1234"));
    }

    @Test
    void emptyPassword() {

        assertEquals(false, Freitag.passwordContainsAtLeastOneLetterAndOneInt(""));
    }


    @Test
    void passwordWithLowerCaseAndUpperCase() {
        assertEquals(true, Freitag.passwordContainsLowerCaseAndUpperCaseLetters("aA"));
    }

    @Test
    void passwordWithOnlyLowerCase() {
        assertEquals(false, Freitag.passwordContainsLowerCaseAndUpperCaseLetters("aa"));
    }

    @Test
    void passwordWithOnlyUpperCase() {
        assertEquals(false, Freitag.passwordContainsLowerCaseAndUpperCaseLetters("AA"));
    }

    @Test
    void emptyPassword2() {
        assertEquals(false, Freitag.passwordContainsLowerCaseAndUpperCaseLetters(""));
    }

    @Test
    void digitsAndLetters() {
        assertEquals(false, Freitag.passwordContainsLowerCaseAndUpperCaseLetters("52252a"));
    }
}