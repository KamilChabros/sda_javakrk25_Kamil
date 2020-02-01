package pl.sda.javakrk25.practising.ex_27;

public class Ex_27 {

    // SILNIA!!!

    public static void main(String[] args) {
        System.out.println(factorial(5));

    }

    public static long factorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
