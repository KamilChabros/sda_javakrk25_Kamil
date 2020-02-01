package pl.sda.javakrk25.practising.ex_34;

import pl.sda.javakrk25.practising.ScannerUtil;

import java.util.ArrayList;
import java.util.List;

public class Ex_34 {

    /**
     * Napisać program, który odkrywa przed użytkownikiem litery słowa przez niego wpisane.
     * Program kończy się, gdy użytkownik wpisze poprawnie hasło
     *
     * @param args
     */

    public static void main(String[] args) {
        List<Character> userGuess = new ArrayList<>();
        String userInput = "";
        String text = "stokrotka";
        do {
            show(userGuess, text);
            userInput = ScannerUtil.readUserInput();
            if (userInput.length() == 1 && !userGuess.contains(userInput.charAt(0))) {
                userGuess.add(userInput.charAt(0));
            }

        } while (!userInput.equals(text));
        System.out.println("Bingo!");
    }

    public static void show(List<Character> userGuess, String text) {
        for (char c : text.toCharArray()) {
            if (userGuess.contains(c)) {
                System.out.print(c);
            } else {
                System.out.print(" _ ");
            }
        }
    }

}
