package mang_phuong_thuc_java;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap kich thuoc ma tran vuong");
        int n = Integer.parseInt(scanner.nextLine());
        int A[][]= new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.println("A ["+i+"]["+j+"]=");
                A[i][j]= Integer.parseInt(scanner.nextLine());
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += A[i][i];
        }
        System.out.println("tong cac so la: "+sum);
    }
}
