package mang_phuong_thuc_java;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int SIZE = Integer.parseInt(sc.nextLine());
        int[] mang = new int[SIZE];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < SIZE; i++) {
            System.out.printf("array[%d] = ", i);
            mang[i] = Integer.parseInt(sc.nextLine());
        }

        int min = mang[0];
        for (int i = 0; i< mang.length;i++){
            if(mang[i] <= 0){
                min = mang[i];
            }
        }
        System.out.println("số nhỏ nhất trong mảng là: "+min);
    }
}
