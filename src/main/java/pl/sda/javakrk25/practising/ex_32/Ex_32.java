package pl.sda.javakrk25.practising.ex_32;

public class Ex_32 {

    /**
     * Metoda do sprawdzania, czy liczba jest liczbą pierwszą
     * Wypisać liczby pierwsze mniejsze od podanego n
     *
     * @param args
     */

    public static void main(String[] args) {
        System.out.println("Liczba 10: " + isPrime(10));
        System.out.println("Liczba 7: " + isPrime(7));
//        printPrime(100);
        printMaxPrime(1000);
    }

    public static boolean isPrime(int x) {

        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrime(int n) {
        for (int i = 0; i < n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static int printMaxPrime(int a) {
        for (int i = a; i > 1; i--) {
            if (isPrime(i)) {
                System.out.println(i);
                return i;
            }
        }
        return -1;
    }
}
