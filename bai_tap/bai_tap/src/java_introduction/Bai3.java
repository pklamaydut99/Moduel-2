package java_introduction;

import java.util.Scanner;

public class Bai3 {
    public static String docMotSo(int num){
        switch (num){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 10:
                System.out.println("Ten");
            break;
        }
        return "";
    };
    public static  String docHaiSo(int num){
        switch (num){
            case
        }
    };
    public static void main(String[] args) {
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap so");
        num = sc.nextInt();
        if (num < 0 || num > 999) {
            System.out.println("out of ability");
        }
        if (num < 10) {
            System.out.println(docMotSo(num));
        } else if (num < 20) {
            System.out.println(docHaiSo(num));
        } else if (num < 100) {
            System.out.println(docBaSo(num));
        } else {
            System.out.println(num);
        }

        }
}
