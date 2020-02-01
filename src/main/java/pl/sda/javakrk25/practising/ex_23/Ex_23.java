//package pl.sda.javakrk25.practising.ex_23;
//
//import pl.sda.javakrk25.practising.ScannerUtil;
//
//import java.util.Scanner;
//
//public class Ex_23 {
//    public static void main(String[] args) {
//        String input = readUserInput().trim().toLowerCase();
//        char c = input.charAt(input.length() - 1);
//        int reps = countLetters(input, c);
//        System.out.println(String.format("Ilosc powtorzen litery %c w podanym tekscie %d", c, reps));
//
//    }
//
//    public static String readUserInput() {
//        System.out.println("Podaj tekst");
//        Scanner scanner = new Scanner(System.in);
//        return scanner.nextLine();
//    }
//
//    public static int countLetters(String input, char c) {
//        char[] letters = input.toCharArray();
//        int counter = 0;
//        for (char a : letters) {
//            if (a == c) {
//                counter++;
//            }
//        }
//        return counter;
//    }
//    public static char getLastLetter(String s) {
//        char[] check = s.toCharArray();
//        for (int i = check.length -1; i > 0; i--){
//            if (Character.isLetter(check[i])){
//                return check[i];
//            }
//        }
//        return "";
//    }
//}