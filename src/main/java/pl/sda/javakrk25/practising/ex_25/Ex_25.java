package pl.sda.javakrk25.practising.ex_25;

public class Ex_25 {
    /**
     * Zdefiniować funkcję int strToInt(String str) , która zamienia liczbę całkowitą zapisaną w postaci
     * łańcucha na liczbę całkowitą typu int. Funkcja powinna przerywać konwersję w momencie napotkania
     * pierwszego znaku nie należącego do zapisu liczby, zatem np. dla strToInt("-13krowa") wynikiem powinno być -13
     *
     * @param args
     */

    public static void main(String[] args) {
//        System.out.println(strToInt("13467"));
        System.out.println(strToBinary("10101010"));
        System.out.println(anyStringToInt("-145900lovekrove"));
    }

    public static int anyStringToInt(String str) {
        char[] chars = str.toCharArray();
        String digits = "";
        for (char c : chars) {
            if (Character.isDigit(c)) {
                digits += c;
            }
        }
        int liczba = strToInt(digits);
        if (str.startsWith("-")) { // sprawdzamy, czy zaczyna się od minusa "-"
            return liczba * -1;
        } else {
            return liczba;
        }
    }

    public static int strToInt(String str) {

        char[] tab = str.toCharArray();
        int exp = tab.length - 1;
        int num = 0;
        for (char c : tab) {
            int i = Integer.valueOf(String.valueOf(c)); //zamienia stringa do inta
            num += Math.pow(10, exp) * i;

            exp--;
        }
        return num;
    }

    public static int strToBinary(String str) {

        char[] tab = str.toCharArray();
        int exp = tab.length - 1;
        int num = 0;
        for (char c : tab) {
            int i = Integer.valueOf(String.valueOf(c)); //zamienia stringa do inta
            num += Math.pow(2, exp) * i;

            exp--;
        }
        return num;
    }
}
