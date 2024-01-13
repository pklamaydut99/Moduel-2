package dsa_stack_queue.bai1.String;

import java.util.Scanner;

public class Reverse {
    public static String checkPalindrome(String inputString) {
        StringBuilder reversedString = new StringBuilder();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversedString.append(inputString.charAt(i));
        }
        return reversedString.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String inputString = scanner.nextLine();
        String reversedString = checkPalindrome(inputString);
        System.out.println("Chuỗi đảo ngược: " + reversedString);
    }
}
