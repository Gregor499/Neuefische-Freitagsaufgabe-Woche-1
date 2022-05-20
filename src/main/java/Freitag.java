import org.apache.commons.lang3.StringUtils;

public class Freitag {
    public static void main(String[] args) {
        System.out.println(passwortIfNonIntAndInt("test"));
    }

    public static boolean passwortLeastLengthCheck(String passwort, int least_length) {
        return passwort.length() >= least_length;
    }

    public static boolean passwortIfNonIntAndInt(String passwort) {
        char[] letters = passwort.toCharArray();
        boolean a = false;
        boolean result =  false;
        boolean atLeastOneTimeFalse = false;

        for(int i = 0; i < passwort.length(); i++){
            a = Character.isDigit(letters[i]);
            if (a == true) {
                result = true;
                break;
            }
            atLeastOneTimeFalse = true;
        }
        return (result && atLeastOneTimeFalse);
    }
}
