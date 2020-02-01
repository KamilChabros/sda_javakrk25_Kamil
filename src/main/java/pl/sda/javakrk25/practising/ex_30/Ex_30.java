package pl.sda.javakrk25.practising.ex_30;

public class Ex_30 {
    public static void main(String[] args) {

        for (int i = 1; i < 50; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}
