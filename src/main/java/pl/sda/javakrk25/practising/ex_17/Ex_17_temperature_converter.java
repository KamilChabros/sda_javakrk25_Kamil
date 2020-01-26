package pl.sda.javakrk25.practising.ex_17;

public class Ex_17_temperature_converter {

    public static void main(String[] args) {

        double cel = 39.5;
        double f = getFahrentheit(cel);
        double c = getCel(f);
        System.out.printf(String.format("Temperatura po przeliczeniu z Celsjusza na Fahrentheit: %.2f F", f));
        System.out.println();
        System.out.printf(String.format("Temperatura po przeliczeniu z Fahrentheit na Celsjusza: %.2f C", c));

    }

    public static double getFahrentheit(double cel) {
        double x = 1.8 * cel + 32;
        return x;
    }

    public static double getCel(double fahr) {
        double z = (fahr - 32) / 1.8;
        return z;
    }
}
