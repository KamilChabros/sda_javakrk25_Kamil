package pl.sda.javakrk25.practising.ex_20;

import pl.sda.javakrk25.practising.ScannerUtil;

public class Ex_20 {

    /**
     * program który pobiera od użytkownika 2 liczby (A,B),
     * a następnie liczy sumę liczb pomiędzy A,A+1,...,B
     *
     * @param args
     */
    public static void main(String[] args) {
        int A = ScannerUtil.getNaturalNumber();
        int B = ScannerUtil.getNaturalNumber();
        System.out.println(sumInRange(A, B));
    }

    public static int sumInRange(int A, int B) {
        if (A > B) {
            return sumInValideRange(B, A);
        } else {
            return sumInValideRange(A, B);
        }
    }

    public static int sumInValideRange(int A, int B) {
        int sum = 0;
        for (int i = A; i <= B; i++) {
            sum += i;
        }
        return sum;
    }

}