package mang_phuong_thuc_java;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng 1: ");
        int N = Integer.parseInt(sc.nextLine());
        int[] mang1 = new int[N];

        System.out.println("Nhập các phần tử của mảng 1:");
        for (int i = 0; i < N; i++) {
            System.out.printf("array[%d] = ", i);
            mang1[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.print("Nhập số phần tử của mảng 2: ");
        int N2 = Integer.parseInt(sc.nextLine());
        int[] mang2 = new int[N2];

        System.out.println("Nhập các phần tử của mảng 2 :");
        for (int i = 0; i < N2; i++) {
            System.out.printf("array[%d] = ", i);
            mang2[i] = Integer.parseInt(sc.nextLine());
        }

        int[] dst = new int[mang1.length + mang2.length];

        System.arraycopy(mang1, 0, dst, 0, mang1.length);
        System.arraycopy(mang2, 0, dst, mang1.length, mang2.length);

        System.out.println("mảng sau khi gộp là"+Arrays.toString(dst));
    }
}

