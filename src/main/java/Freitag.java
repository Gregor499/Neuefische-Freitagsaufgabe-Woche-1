import org.apache.commons.lang3.StringUtils;

public class Freitag {
    public static void main(String[] args) {
        System.out.println(passwortContainsAtLeastOneLetterAndOneInt("test1234"));
    }

    public static boolean passwortLeastLengthCheck(String passwort, int least_length) {
        return passwort.length() >= least_length;
    }

    public static boolean passwortContainsAtLeastOneLetterAndOneInt(String passwort) {
        char[] letters = passwort.toCharArray();
        boolean a = false;
        boolean atLeastOneInt = false;
        boolean atLeastOneTimeLetter = false;

        for (int i = 0; i < passwort.length(); i++) {
            if (a = Character.isDigit(letters[i])) {
                atLeastOneInt = true;
            } else if (a = Character.isLetter(letters[i])) {
                atLeastOneTimeLetter = true;
            }
        }
        return (atLeastOneInt && atLeastOneTimeLetter);
    }

    public static boolean passwortContainsLowerCaseAndUpperCaseLetters(String passwort) {
        char[] letters = passwort.toCharArray();
        boolean a = false;
        boolean atLeastOneLowerCase = false;
        boolean atLeastOneUpperCase = false;

        for (int i = 0; i < passwort.length(); i++) {
            if (a = Character.isLowerCase(letters[i])) {
                atLeastOneLowerCase = true;
            } else if (a = Character.isUpperCase(letters[i])) {
                atLeastOneUpperCase = true;
            }
        }
        return (atLeastOneLowerCase && atLeastOneUpperCase);
    }
}
