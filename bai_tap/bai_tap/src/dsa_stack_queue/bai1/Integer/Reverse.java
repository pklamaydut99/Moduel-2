package dsa_stack_queue.bai1.Integer;
import java.util.Scanner;
import java.util.Stack;

public class Reverse {

    public static void reserveOfStack(int[] a) {

        Stack<Integer> stack = new Stack<>();

        for (int j : a) {
            stack.push(j);
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = stack.pop();
        }
    }

    public static void addElement(int[] a, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(scanner.nextLine());
        }
    }

    public static void printArray(int[] a) {
        for (int j : a) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] a = new int[n];
        addElement(a, n);
        System.out.println("Mảng ban đầu");
        printArray(a);
        reserveOfStack(a);
        System.out.println();
        System.out.println("Mảng lúc sau");
        printArray(a);

    }
}
