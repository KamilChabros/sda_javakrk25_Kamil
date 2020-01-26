package pl.sda.javakrk25.practising.ex_21;

import pl.sda.javakrk25.practising.ScannerUtil;

public class Ex_21 {
    public static void main(String[] args) {

        int z = ScannerUtil.getNaturalNumber();
        printPowers(z);
    }

    public static void printPowers(int a) {
        int x = 0;
        while (Math.pow(2, x) < a) {
            System.out.println(String.format("2 power x: %d = %.0f", x, Math.pow(2, x)));
            x++;
        }
    }
}
