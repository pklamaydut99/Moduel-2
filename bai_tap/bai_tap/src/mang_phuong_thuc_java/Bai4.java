package mang_phuong_thuc_java;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        int m,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của ma trận: ");
        m = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào số cột của ma trận: ");
        n = Integer.parseInt(sc.nextLine());

        int A[][] = new int[m][n];

        System.out.println("nhập các phần tử cho ma trận");
        for (int i =0 ; i < m; i++){
            for (int j=0; j < n; j++){
                System.out.println("A ["+i+"]["+j+"]=");
                A[i][j]= Integer.parseInt(sc.nextLine());
            }
        }

        int max = A[0][0];
         for (int i = 0; i < m ; i++){
             for (int j = 0; j < n; j++){
                 if (max < A[i][j]){
                     max = A[i][j];
                 }
             }
         }
        System.out.println("phần tử lớn nhất trong ma trận là: "+max);
    }
}
