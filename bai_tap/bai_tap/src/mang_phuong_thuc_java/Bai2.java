package mang_phuong_thuc_java;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int N = Integer.parseInt(sc.nextLine());
        int[] mang = new int[N];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < N; i++) {
            System.out.printf("array[%d] = ", i);
            mang[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.print("Nhập sô x cần chèn: ");
        int x =Integer.parseInt(sc.nextLine());

        System.out.print("Nhập vị trí index cần chèn (0 - " + (N - 1) + "): ");
        int index = Integer.parseInt(sc.nextLine());

        if (index < 0 || index > mang.length - 1) {
            System.out.println("Không chèn được phần tử vào mảng.");
        } else {
            // Bước 5: Chèn phần tử X vào mảng
            int[] newMang = new int[N + 1];
            for (int i = 0, j = 0; i < N + 1; i++) {
                if (i == index) {
                    newMang[i] = x;
                } else {
                    newMang[i] = mang[j];
                    j++;
                }
            }

            // Gán mảng mới cho mảng gốc
            mang = newMang;

            // Bước 6: In ra mảng
            System.out.println("Mảng sau khi chèn phần tử X:");
            for (int i = 0; i < mang.length; i++) {
                System.out.printf("array[%d] = %d\n", i, mang[i]);
            }
        }
    }
}
