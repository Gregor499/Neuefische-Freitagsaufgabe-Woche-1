import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Freitag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] passwordList = new String[100];
        Arrays.fill(passwordList, "");
        int i=0;

        System.out.println("Eingabe abbrechen mit leerer Eingabe und dann ENTER");
        while(true) {
            System.out.println("Passwort " + (i+1) + ":");
            String line = scanner.nextLine();
            if (line == null || "".equals(line)){
                break;
            }
            passwordList[i] = line;
            i++;
        }


        for (int i1 = 0; i1 < passwordList.length; i1++) {
            System.out.println("Passwort " + (i1+1) + ":" + passwordList[i1] + "\nMindeslänge erfüllt: " +
                    passwordLeastLengthCheck(passwordList[i1], 4)+
                     "\nenthält Buchstaben und Zahlen: " + passwordContainsAtLeastOneLetterAndOneInt(passwordList[i])+
                    "\nenthält Klein- und Großbuchstaben: " + passwordContainsLowerCaseAndUpperCaseLetters(passwordList[i]) +
                    "\n");
        }
    }


    public static boolean passwordLeastLengthCheck(String password, int least_length) {
        return password.length() >= least_length;
    }

    public static boolean passwordContainsAtLeastOneLetterAndOneInt(String password) {
        char[] letters = password.toCharArray();
        boolean a = false;
        boolean atLeastOneInt = false;
        boolean atLeastOneTimeLetter = false;

        for (int i = 0; i < password.length(); i++) {
            if (a = Character.isDigit(letters[i])) {
                atLeastOneInt = true;
            } else if (a = Character.isLetter(letters[i])) {
                atLeastOneTimeLetter = true;
            }
        }
        return (atLeastOneInt && atLeastOneTimeLetter);
    }

    public static boolean passwordContainsLowerCaseAndUpperCaseLetters(String password) {
        char[] letters = password.toCharArray();
        boolean a = false;
        boolean atLeastOneLowerCase = false;
        boolean atLeastOneUpperCase = false;

        for (int i = 0; i < password.length(); i++) {
            if (a = Character.isLowerCase(letters[i])) {
                atLeastOneLowerCase = true;
            } else if (a = Character.isUpperCase(letters[i])) {
                atLeastOneUpperCase = true;
            }
        }
        return (atLeastOneLowerCase && atLeastOneUpperCase);
    }
}
