package dsa_stack_queue.bai1.String_stack;
import java.util.Scanner;
import java.util.Stack;

public class Reserve {
    public static String reserveString(String inputString) {
        Stack<Character> stack =new Stack<>();
        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }
        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        return reversedString.toString();
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in) ;
        String inputString = scanner.nextLine();
        System.out.println("Chuoi ban dau la:"+inputString);
        String String= reserveString(inputString);
        System.out.println("chuoi luc sau la:"+String);
    }
}
