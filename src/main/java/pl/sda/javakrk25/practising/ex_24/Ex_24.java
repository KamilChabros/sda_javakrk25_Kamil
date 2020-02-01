package pl.sda.javakrk25.practising.ex_24;

import java.util.Scanner;

public class Ex_24 {
    /**
     * Pobieramy liczbę od użytkownika
     * obliczamy sumę cyfr
     * obliczamy osobno sumę cyfr parzystych i nieparzystych
     * obliczamy stosunek średniej arytmetycznej liczb parzystych od nieparzystych
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Popdaj liczbę...");
        int num = Scanner.nextInt();
        String numToString = num + "";
        char[] charTab = numToString.toCharArray();

        int sumOddNum = 0;
        int sumEvenNum = 0;
        int sum = 0;
        int oddCount = 0;
        int evenCount = 0;

        for (char c : charTab) {
            int i = Integer.valueOf(String.valueOf(c));
            sum += i;

            if (i % 2 == 0) {
                sumEvenNum += i;
                evenCount++;
            } else {
                sumOddNum += i;
                oddCount++;
            }
        }

        int averageEven = sumEvenNum / evenCount;
        int averageOdd = sumOddNum / oddCount;

        System.out.println(String.format("Suma liczb: %d", sum));
        System.out.println(String.format("Suma liczb parzystych: %d", sumEvenNum));
        System.out.println(String.format("Suma liczb nieparzystych: %d", sumOddNum));
        System.out.println(String.format("Srednia liczb parzystych: %d", averageEven));
        System.out.println(String.format("Srednia liczb nieparzystych: %d", averageOdd));

    }
}
