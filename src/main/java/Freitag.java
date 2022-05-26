import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Freitag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] passwordList = new String[10];
        Arrays.fill(passwordList, "");
        int i=0;

        System.out.println("Maximale Passwortanzahl = " + passwordList.length + "\nEingabe abbrechen mit leerer Eingabe und dann ENTER");
        while(i < 10) {
            System.out.println("Passwort " + (i+1) + ":");
            String line = scanner.nextLine();
            if (line == null || "".equals(line)){
                break;
            }
            passwordList[i] = line;
            i++;
        }


        for (int i1 = 0; i1 < passwordList.length; i1++) {
            if(passwordList[i1] != "") {
                System.out.println("Passwort " + (i1 + 1) + ":" + passwordList[i1] + "\nMindeslänge erfüllt: " +
                        passwordLeastLengthCheck(passwordList[i1], 4) +
                        "\nenthält Buchstaben und Zahlen: " + passwordContainsAtLeastOneLetterAndOneInt(passwordList[i1]) +
                        "\nenthält Klein- und Großbuchstaben: " + passwordContainsLowerCaseAndUpperCaseLetters(passwordList[i1]) +
                        "\n");
            }
        }
    }


    public static boolean passwordLeastLengthCheck(String password, int leastLength) {
        return password.length() >= leastLength;
    }

    public static boolean passwordContainsAtLeastOneLetterAndOneInt(String password) {
        boolean atLeastOneInt = false;
        boolean atLeastOneTimeLetter = false;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                atLeastOneInt = true;
            } else if (Character.isLetter(password.charAt(i))) {
                atLeastOneTimeLetter = true;
            }
        }
        return (atLeastOneInt && atLeastOneTimeLetter);
    }

    public static boolean passwordContainsLowerCaseAndUpperCaseLetters(String password) {
        boolean atLeastOneLowerCase = false;
        boolean atLeastOneUpperCase = false;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                atLeastOneLowerCase = true;
            } else if (Character.isUpperCase(password.charAt(i))) {
                atLeastOneUpperCase = true;
            }
        }
        return (atLeastOneLowerCase && atLeastOneUpperCase);
    }
}
