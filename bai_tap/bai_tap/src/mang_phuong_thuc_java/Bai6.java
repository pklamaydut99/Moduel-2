package mang_phuong_thuc_java;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        int m,n,x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của ma trận: ");
        m = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào số cột của ma trận: ");
        n = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số cột cần tính tổng");
        x = Integer.parseInt(sc.nextLine());

        int A[][] = new int[m][n];

        System.out.println("nhập các phần tử cho ma trận");
        for (int i =0 ; i < m; i++){
            for (int j=0; j < n; j++){
                System.out.println("A ["+i+"]["+j+"]=");
                A[i][j]= Integer.parseInt(sc.nextLine());
            }
        }

        int sum = A[0][0];
        for (int i = 0; i < A.length; i++){
            sum += A[i][x];
        }
        System.out.println("Tổng của cột thứ "+x+"là: "+sum);
    }
}
