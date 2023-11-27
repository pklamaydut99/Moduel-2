package mang_phuong_thuc_java;

import java.util.Scanner;

public class Bai1 {
    //    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int [] mang = {1,2,3,4,5,6};
//        System.out.println("Nhập số cần xóa x=");
//        int x = Integer.parseInt(sc.nextLine());
//        if (x < 0 || x < mang.length){
//            System.out.println("x không tồn tại");
//            return;
//        }
//
//    }
    public static void main(String[] args) {
        int n, i, c;
        Scanner sc = new Scanner(System.in);

//    do {
//        System.out.println("Nhập vào số phần tử của mảng: ");
//        n = scanner.nextInt();
//    } while (n <= 0);
//
//    int A[] = new int[n];
//
//    System.out.println("Nhập các phần tử cho mảng: ");
//    for (i = 0; i < n; i++) {
//        System.out.print("Nhập phần tử thứ " + i + ": ");
//        A[i] = scanner.nextInt();
//    }
        int[] mang = {1, 2, 3, 4, 5, 6};

        System.out.println("Nhập số nguyên x: ");
        int x = Integer.parseInt(sc.nextLine());

        for (c = i = 0; i < mang.length; i++) {
            if (mang[i] != x) {
                mang[c] = mang[i];
                c++;
            }
        }
        // hiển thị các phần tử trong mảng sau khi xóa so cuoi
        System.out.println("Mảng còn lại sau khi xóa phần tử " + x + " là: ");
        for (i = 0; i < mang.length - 1; i++) {
            System.out.print(mang[i] + "\t");
        }
    }
}
