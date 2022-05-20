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
    void passwordWithBothAtLeastOneNonIntAndOneInt() {
        assertEquals(true, Freitag.passwortIfNonIntAndInt("test1234"));
    }

    @Test
    void passwordWithOnlyNonInts() {
        assertEquals(false, Freitag.passwortIfNonIntAndInt("test"));
    }

    @Test
    void passwordWithOnlyInts() {
        assertEquals(false, Freitag.passwortIfNonIntAndInt("1234"));
    }

    @Test
    void emptyPasswort() {
        assertEquals(false, Freitag.passwortIfNonIntAndInt(""));
    }
}